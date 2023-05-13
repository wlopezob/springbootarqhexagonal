package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter.base.GenericMysqlAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers.DistritoMysqlMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.DistritoMysqlRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.distrito.DistritoInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DistritoMysqlAdapter
  extends GenericMysqlAdapter implements DistritoInsertAllPort,
  DistritoDeleteAllPort {
  private final DistritoMysqlRepository repository;
  private final DistritoMysqlMapper mapper;

  @Override
  public Mono<Boolean> deleteAllDistrito() {
    return Mono.defer(() -> {
      repository.deleteAll();
      return Mono.just(true);
    });
  }

  @Override
  public Mono<List<Distrito>> insertAllDistrito(List<Distrito> list) {
    return Mono.just(repository.saveAll(list.stream().map(mapper::toEntity)
        .collect(Collectors.toList())).stream()
      .map(mapper::toDominio).collect(Collectors.toList()));
  }

}
