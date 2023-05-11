package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.departamento;

import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.departamento.DepartamentoResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DepartamentoWebClient {
  Mono<DepartamentoResponse> getAllDepartamento();
}
