package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.adapter.base.GenericWebClientAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.client.distrito.DistritoWebClient;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers.DistritoWebClientMapper;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;
import reactor.core.publisher.Mono;

import java.util.List;

@RequiredArgsConstructor
public class DistritoWebClientAdapter extends GenericWebClientAdapter
  implements DistritoGetAllCallApiPort {

  private final DistritoWebClient distritoWebClient;
  private final DistritoWebClientMapper mapper;

  @Override
  public Mono<List<Distrito>> getAllDistrito(String codProv) {
    return distritoWebClient.getAllDistrito(codProv).collectList()
      .map(mapper::toListDominio);
  }
}
