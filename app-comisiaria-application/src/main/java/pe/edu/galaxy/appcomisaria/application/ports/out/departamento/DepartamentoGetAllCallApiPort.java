package pe.edu.galaxy.appcomisaria.application.ports.out.departamento;

import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface DepartamentoGetAllCallApiPort {
  Flux<Departamento> getAllDepartamento();
}
