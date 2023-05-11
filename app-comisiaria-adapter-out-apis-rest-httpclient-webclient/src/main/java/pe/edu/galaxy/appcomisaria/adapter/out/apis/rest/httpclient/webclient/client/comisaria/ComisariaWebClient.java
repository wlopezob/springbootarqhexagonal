package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.comisaria;

import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.comisaria.ComisariaResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ComisariaWebClient {
  Mono<Integer> getAllCountComisaria();
  Flux<ComisariaResponse> getAllComisaria(int count);
}
