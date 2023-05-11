package pe.edu.galaxy.appcomisaria.application.ports.out.comisaria;

import reactor.core.publisher.Mono;

import java.util.List;

@FunctionalInterface
public interface ComisariaDeleteAllPort {
  Mono<Boolean>  deleteAllComisaria();
}
