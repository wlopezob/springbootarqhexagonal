package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.adapter.base.GenericMongoAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.mappers.DepartamentoMongoMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.DepartamentoMongoRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoGetAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DepartamentoMongoAdapter extends
  GenericMongoAdapter implements DepartamentoDeleteAllPort,
  DepartamentoGetAllPort, DepartamentoInsertAllPort {

  private final DepartamentoMongoRepository departamentoMongoRepository;
  private final DepartamentoMongoMapper departamentoMapper;

  @Override
  public Mono<Boolean> deleteAllDepartamento() {
    return departamentoMongoRepository.deleteAll().then(Mono.just(true));
  }

  @Override
  public Mono<List<Departamento>> getAllDepartamento() {
    return departamentoMongoRepository.findAll().map(departamentoMapper::toDominio).collectList();
  }

  @Override
  public Flux<Departamento> insertAllDepartamento(List<Departamento> departamentos) {
    var list = departamentos.stream().map(departamentoMapper::toEntity)
      .collect(Collectors.toList());
    return departamentoMongoRepository.insert(list).map(departamentoMapper::toDominio);
  }
}
