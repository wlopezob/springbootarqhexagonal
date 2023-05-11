package pe.edu.galaxy.appcomisaria.application.ports.out.departamento;


import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;
import reactor.core.publisher.Flux;

import java.util.List;

@FunctionalInterface
public interface DepartamentoInsertAllPort {
  Flux<Departamento> insertAllDepartamento(List<Departamento> departamentos);
}
