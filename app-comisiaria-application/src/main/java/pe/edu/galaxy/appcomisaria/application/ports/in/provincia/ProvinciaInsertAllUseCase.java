package pe.edu.galaxy.appcomisaria.application.ports.in.provincia;

import pe.edu.galaxy.appcomisaria.dominio.provincia.Provincia;
import reactor.core.publisher.Flux;

@FunctionalInterface
public interface ProvinciaInsertAllUseCase {
  Flux<Provincia> insertAllProvincia();
}
