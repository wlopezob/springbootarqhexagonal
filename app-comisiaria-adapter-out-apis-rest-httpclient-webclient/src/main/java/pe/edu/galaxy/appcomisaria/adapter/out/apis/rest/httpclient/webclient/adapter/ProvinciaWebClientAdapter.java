package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter.base.GenericWebClientAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.provincia.ProvinciaWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers.ProvinciaWebClientMapper;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinciaGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.dominio.provincia.Provincia;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class ProvinciaWebClientAdapter extends GenericWebClientAdapter
  implements ProvinciaGetAllCallApiPort {

  private final ProvinciaWebClient provinciaWebClient;
  private final ProvinciaWebClientMapper mapper;

  @Override
  public Mono<List<Provincia>> getAllProvincia(String idDpto) {
    return provinciaWebClient.getAllDepartamento(idDpto).collectList()
      .map(mapper::toListDominio);
  }
}
