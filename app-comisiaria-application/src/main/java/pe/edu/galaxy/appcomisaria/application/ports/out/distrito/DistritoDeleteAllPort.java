package pe.edu.galaxy.appcomisaria.application.ports.out.distrito;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface DistritoDeleteAllPort {
  Mono<Boolean> deleteAllDistrito();
}
