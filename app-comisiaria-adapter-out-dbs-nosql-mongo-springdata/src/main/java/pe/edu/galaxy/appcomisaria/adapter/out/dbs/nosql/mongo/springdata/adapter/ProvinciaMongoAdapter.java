package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.adapter.base.GenericMongoAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.mappers.ProvinciaMongoMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.ProvinciaMongoRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinciaGetAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinicaDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinicaInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.provincia.Provincia;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ProvinciaMongoAdapter
  extends GenericMongoAdapter implements ProvinciaGetAllPort, ProvinicaDeleteAllPort,
  ProvinicaInsertAllPort {

  private final ProvinciaMongoRepository provinciaMongoRepository;
  private final ProvinciaMongoMapper provinciaMapper;

  @Override
  public Mono<List<Provincia>> getAllProvincia() {
    return provinciaMongoRepository.findAll().map(provinciaMapper::toDominio)
      .collectList();
  }

  @Override
  public Mono<Boolean> deleteAllProvincia() {
    return provinciaMongoRepository.deleteAll().then(Mono.just(true));
  }

  @Override
  public Mono<List<Provincia>> insertAllProvincia(List<Provincia> list) {
    return provinciaMongoRepository.insert(list.stream()
        .map(provinciaMapper::toEntity).collect(Collectors.toList()))
      .collectList()
      .map(provinciaMapper::toListDominio);
  }
}
