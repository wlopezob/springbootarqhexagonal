package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.adapter.base.GenericMongoAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.mappers.DistritoMongoMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.DistritoMongoRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DistritoMongoAdapter
  extends GenericMongoAdapter implements DistritoInsertAllPort,
  DistritoDeleteAllPort {
  private final DistritoMongoRepository distritoMongoRepository;
  private final DistritoMongoMapper distritoMapper;

  @Override
  public Mono<Boolean> deleteAllDistrito() {
    return distritoMongoRepository.deleteAll().then(Mono.just(true));
  }

  @Override
  public Mono<List<Distrito>> insertAllDistrito(List<Distrito> list) {
    return distritoMongoRepository.insert(list.stream().map(distritoMapper::toEntity).collect(Collectors.toList()))
      .collectList()
      .map(distritoMapper::toListDominio);
  }

}
