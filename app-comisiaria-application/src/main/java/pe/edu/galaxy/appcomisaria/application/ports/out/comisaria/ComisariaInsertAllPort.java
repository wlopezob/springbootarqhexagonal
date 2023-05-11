package pe.edu.galaxy.appcomisaria.application.ports.out.comisaria;

import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;
import reactor.core.publisher.Flux;

import java.util.List;

@FunctionalInterface
public interface ComisariaInsertAllPort {
  Flux<Comisaria> insertAllComisaria(List<Comisaria> comisarias);
}
