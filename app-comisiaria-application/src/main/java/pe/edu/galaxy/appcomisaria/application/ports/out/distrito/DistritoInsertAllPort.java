package pe.edu.galaxy.appcomisaria.application.ports.out.distrito;


import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;
import reactor.core.publisher.Mono;

import java.util.List;

@FunctionalInterface
public interface DistritoInsertAllPort {
  Mono<List<Distrito>> insertAllDistrito(List<Distrito> list);
}
