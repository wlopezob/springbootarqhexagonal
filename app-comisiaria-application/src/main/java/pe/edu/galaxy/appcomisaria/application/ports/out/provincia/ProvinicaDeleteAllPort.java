package pe.edu.galaxy.appcomisaria.application.ports.out.provincia;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface ProvinicaDeleteAllPort {
  Mono<Boolean> deleteAllProvincia();
}
