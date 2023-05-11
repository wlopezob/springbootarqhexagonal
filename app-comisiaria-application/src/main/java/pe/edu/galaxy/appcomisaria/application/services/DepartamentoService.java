package pe.edu.galaxy.appcomisaria.application.services;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.application.ports.in.departamento.DepartamentoInsertAllUseCase;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoGetAllCallApiPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class DepartamentoService implements DepartamentoInsertAllUseCase {
  private final DepartamentoDeleteAllPort departamentoDeleteAllPort;
  private final DepartamentoInsertAllPort departamentoInsertAllPort;
  private final DepartamentoGetAllCallApiPort departamentoGetAllCallApiPort;

  @Override
  public Flux<Departamento> insertAllDepartamento() {

    return departamentoDeleteAllPort.deleteAllDepartamento().flux()
      .flatMap(t -> departamentoGetAllCallApiPort.getAllDepartamento()
        .collectList()
        .flatMapMany(t1 -> departamentoInsertAllPort.insertAllDepartamento(t1)));
  }

}
