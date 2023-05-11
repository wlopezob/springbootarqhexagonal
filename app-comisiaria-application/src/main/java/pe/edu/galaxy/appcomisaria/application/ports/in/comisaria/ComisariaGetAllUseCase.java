package pe.edu.galaxy.appcomisaria.application.ports.in.comisaria;

import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface ComisariaGetAllUseCase {
  Flux<Comisaria> getAllComisaria();
}
