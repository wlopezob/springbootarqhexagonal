package pe.edu.galaxy.appcomisaria.application.ports.out.comisaria;

import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;
import reactor.core.publisher.Mono;

import java.util.List;

@FunctionalInterface
public interface ComisariaGetAllCallApiPort {
  Mono<List<Comisaria>> getAllComisaria(Integer count);
}
