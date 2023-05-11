package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter.base.GenericWebClientAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.departamento.DepartamentoWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers.DepartamentoWebClientMapper;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;
import reactor.core.publisher.Flux;

import java.util.List;

@RequiredArgsConstructor
public class DepartamentoWebClientAdapter extends GenericWebClientAdapter
  implements DepartamentoGetAllCallApiPort {

  private final DepartamentoWebClient departamentoWebClient;
  private final DepartamentoWebClientMapper mapper;

  @Override
  public Flux<Departamento> getAllDepartamento() {
    return departamentoWebClient.getAllDepartamento()
      .flatMapMany(list -> Flux.fromIterable(mapper.toListDominio(List.of(list))));
  }
}
