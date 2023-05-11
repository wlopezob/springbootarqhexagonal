package pe.edu.galaxy.appcomisaria.application.ports.out.departamento;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface DepartamentoDeleteAllPort {
  Mono<Boolean> deleteAllDepartamento();
}
