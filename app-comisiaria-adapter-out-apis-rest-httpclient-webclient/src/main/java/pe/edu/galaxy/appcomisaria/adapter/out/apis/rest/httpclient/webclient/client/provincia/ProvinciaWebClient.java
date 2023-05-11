package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.provincia;

import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.provincia.ProvinciaResponse;
import reactor.core.publisher.Flux;

public interface ProvinciaWebClient {
  Flux<ProvinciaResponse> getAllDepartamento(String codDpto);
}
