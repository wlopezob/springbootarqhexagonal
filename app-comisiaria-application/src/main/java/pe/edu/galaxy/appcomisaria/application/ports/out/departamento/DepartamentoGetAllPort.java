package pe.edu.galaxy.appcomisaria.application.ports.out.departamento;


import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;
import reactor.core.publisher.Mono;

import java.util.List;

@FunctionalInterface
public interface DepartamentoGetAllPort {
  Mono<List<Departamento>> getAllDepartamento();
}
