package pe.edu.galaxy.appcomisaria.application.services;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.application.ports.in.comisaria.ComisariaGetAllUseCase;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaCountCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class ComisariaService implements ComisariaGetAllUseCase {
  private final ComisariaCountCallApiPort comisariaCountCallApiPort;
  private final ComisariaDeleteAllPort comisariaDeleteAllPort;
  private final ComisariaGetAllCallApiPort comisariaGetAllCallApiPort;
  private final ComisariaInsertAllPort comisariaInsertAllPort;

  @Override
  public Flux<Comisaria> getAllComisaria() {
    return comisariaDeleteAllPort.deleteAllComisaria().flux()
      .flatMap(b -> comisariaCountCallApiPort.getCountComisaria()
        .flatMap(count -> comisariaGetAllCallApiPort.getAllComisaria(count)))
      .flatMap(comisarias -> comisariaInsertAllPort.insertAllComisaria(comisarias));
  }
}
