package pe.edu.galaxy.appcomisaria.application.ports.in.distrito;

import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface DistritoInsertAllUseCase {
  Flux<Distrito> insertAllDistrito();
}
