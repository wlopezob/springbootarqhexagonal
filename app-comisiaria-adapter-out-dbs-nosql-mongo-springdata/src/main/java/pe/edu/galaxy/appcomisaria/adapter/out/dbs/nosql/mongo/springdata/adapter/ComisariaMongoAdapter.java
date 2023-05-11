package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.mappers.ComisariaMongoMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.ComisariaMongoRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ComisariaMongoAdapter implements ComisariaDeleteAllPort, ComisariaInsertAllPort {
  private final ComisariaMongoRepository comisariaMongoRepository;
  private final ComisariaMongoMapper comisariaMongoMapper;

  @Override
  public Mono<Boolean> deleteAllComisaria() {
    return comisariaMongoRepository.deleteAll().then(Mono.just(true));
  }

  @Override
  public Flux<Comisaria> insertAllComisaria(List<Comisaria> comisarias) {
    return comisariaMongoRepository
      .insert(comisarias.stream().map(comisariaMongoMapper::toEntity).collect(Collectors.toList()))
      .map(comisariaMongoMapper::toDominio);
  }
}
