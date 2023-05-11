package pe.edu.galaxy.appcomisaria.application.ports.out.provincia;


import pe.edu.galaxy.appcomisaria.dominio.provincia.Provincia;
import reactor.core.publisher.Mono;

import java.util.List;

@FunctionalInterface
public interface ProvinciaGetAllPort {
  Mono<List<Provincia>> getAllProvincia();
}
