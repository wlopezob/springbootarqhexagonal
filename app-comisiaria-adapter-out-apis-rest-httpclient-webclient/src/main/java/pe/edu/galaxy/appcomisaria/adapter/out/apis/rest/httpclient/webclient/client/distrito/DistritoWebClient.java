package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.distrito;

import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.distrito.DistritoResponse;
import reactor.core.publisher.Flux;

public interface DistritoWebClient {
  Flux<DistritoResponse> getAllDistrito(String codProv);
}
