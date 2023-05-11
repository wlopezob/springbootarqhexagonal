package pe.edu.galaxy.appcomisaria.application.ports.in.departamento;

import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface DepartamentoInsertAllUseCase {
  Flux<Departamento> insertAllDepartamento();
}
