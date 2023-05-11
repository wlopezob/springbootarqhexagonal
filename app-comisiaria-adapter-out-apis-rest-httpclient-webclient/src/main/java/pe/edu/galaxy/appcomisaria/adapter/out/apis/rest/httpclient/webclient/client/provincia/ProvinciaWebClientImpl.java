package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.provincia;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.base.GenericWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.config.ApiProperties;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.provincia.ProvinciaResponse;
import pe.edu.galaxy.appcomisaria.dominio.exception.ApiExceptionEnum;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.net.URI;
import java.time.Duration;
import static pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.constants.Constants.HOST;
import static pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.constants.Constants.ORIGIN;


@RequiredArgsConstructor
@Component
public class ProvinciaWebClientImpl
  extends GenericWebClient implements ProvinciaWebClient{

  private final ApiProperties apiProperties;

  @Override
  public Flux<ProvinciaResponse> getAllDepartamento(String codDpto) {
    var response = WebClient.builder()
      .codecs(codecs -> codecs
        .defaultCodecs()
        .maxInMemorySize(5000 * 1024))
      .build().get()
      .uri(URI.create(apiProperties.getProvUrl().replace("{id_dpto}",codDpto)))
      .header(HOST, apiProperties.getHost())
      .header(ORIGIN, apiProperties.getOrigin())
      .retrieve()
      .bodyToMono(String.class)
      .timeout(Duration.ofSeconds(60))
      .retryWhen(Retry.backoff(5, Duration.ofSeconds(1)));

    return response.flatMap(rsp -> Mono.fromCallable(() -> new ObjectMapper()
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .readValue(rsp, ProvinciaResponse.class)))
      .onErrorResume(ex -> Mono.error(ApiExceptionEnum.ERR002.buildException(ex))).flux();
  }
}
