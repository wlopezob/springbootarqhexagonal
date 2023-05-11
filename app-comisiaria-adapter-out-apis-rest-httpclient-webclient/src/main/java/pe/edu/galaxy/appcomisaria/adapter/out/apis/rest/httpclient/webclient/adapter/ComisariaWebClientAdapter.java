package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter.base.GenericWebClientAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.comisaria.ComisariaWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers.ComisariaWebClientMapper;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaCountCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class ComisariaWebClientAdapter extends GenericWebClientAdapter
  implements ComisariaCountCallApiPort, ComisariaGetAllCallApiPort {

  private final ComisariaWebClient comisariaWebClient;
  private final ComisariaWebClientMapper mapper;

  @Override
  public Mono<Integer> getCountComisaria() {
    return comisariaWebClient.getAllCountComisaria();
  }

  @Override
  public Mono<List<Comisaria>> getAllComisaria(Integer count) {
    return comisariaWebClient.getAllComisaria(count).collectList()
      .map(mapper::toListDominio);
  }
}
