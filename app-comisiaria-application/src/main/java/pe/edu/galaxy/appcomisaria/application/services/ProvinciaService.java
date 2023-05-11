package pe.edu.galaxy.appcomisaria.application.services;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.application.ports.in.provincia.ProvinciaInsertAllUseCase;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoGetAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinciaGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinicaDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinicaInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.provincia.Provincia;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class ProvinciaService implements ProvinciaInsertAllUseCase {
  private final ProvinciaGetAllCallApiPort provinciaGetAllCallApiPort;
  private final ProvinicaDeleteAllPort provinicaDeleteAllPort;
  private final DepartamentoGetAllPort departamentoGetAllPort;
  private final ProvinicaInsertAllPort provinicaInsertAllPort;

  @Override
  public Flux<Provincia> insertAllProvincia() {
    return provinicaDeleteAllPort.deleteAllProvincia().flux()
      .flatMap(b -> departamentoGetAllPort.getAllDepartamento().flatMapIterable(t -> t)
        .flatMap(dpto -> provinciaGetAllCallApiPort.getAllProvincia(dpto.getIdDpto())
          .flatMap(list -> provinicaInsertAllPort.insertAllProvincia(list))).flatMapIterable(t -> t));
  }
}
