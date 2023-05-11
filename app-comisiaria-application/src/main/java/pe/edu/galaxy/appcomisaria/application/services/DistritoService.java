package pe.edu.galaxy.appcomisaria.application.services;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.application.ports.in.distrito.DistritoInsertAllUseCase;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoInsertAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinciaGetAllPort;
import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class DistritoService implements DistritoInsertAllUseCase {
  private final DistritoGetAllCallApiPort distritoGetAllCallApiPort;
  private final DistritoDeleteAllPort distritoDeleteAllPort;
  private final DistritoInsertAllPort distritoInsertAllPort;
  private final ProvinciaGetAllPort provinciaGetAllPort;

  @Override
  public Flux<Distrito> insertAllDistrito() {
    // delete distrito
    return distritoDeleteAllPort.deleteAllDistrito().flux()
      .flatMap(b -> provinciaGetAllPort.getAllProvincia().flatMapIterable(t -> t)
        .flatMap(prov -> distritoGetAllCallApiPort.getAllDistrito(prov.getIdProv())
          .flatMap(list -> distritoInsertAllPort.insertAllDistrito(list))))
      .flatMapIterable(t -> t);
  }
}
