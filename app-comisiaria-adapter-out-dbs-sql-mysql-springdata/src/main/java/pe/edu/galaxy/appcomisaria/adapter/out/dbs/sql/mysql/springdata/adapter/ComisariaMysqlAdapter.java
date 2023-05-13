package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers.ComisariaMysqlMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.ComisariaMysqlRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.comisaria.ComisariaInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ComisariaMysqlAdapter implements ComisariaDeleteAllPort, ComisariaInsertAllPort {
  private final ComisariaMysqlRepository repository;
  private final ComisariaMysqlMapper mapper;

  @Override
  public Mono<Boolean> deleteAllComisaria() {
    return Mono.defer(() -> {
      repository.deleteAll();
      return Mono.just(true);
    });
  }

  @Override
  public Flux<Comisaria> insertAllComisaria(List<Comisaria> comisarias) {
    return Flux.fromIterable(repository
      .saveAll(comisarias.stream().map(mapper::toEntity).collect(Collectors.toList()))
      .stream().map(mapper::toDominio).collect(Collectors.toList()));
  }
}
