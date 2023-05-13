package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter.base.GenericMysqlAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers.DepartamentoMysqlMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.DepartamentoMysqlRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoGetAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.departamento.DepartamentoInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DepartamentoMysqlAdapter extends GenericMysqlAdapter
  implements DepartamentoDeleteAllPort,
  DepartamentoGetAllPort, DepartamentoInsertAllPort {

  private final DepartamentoMysqlRepository repository;
  private final DepartamentoMysqlMapper departamentoMapper;

  @Override
  public Mono<Boolean> deleteAllDepartamento() {
    return Mono.defer(() -> {
      repository.deleteAll();
      return Mono.just(true);
    });
  }

  @Override
  public Mono<List<Departamento>> getAllDepartamento() {
    return Mono.just(repository.findAll()
      .stream().map(departamentoMapper::toDominio)
      .collect(Collectors.toList()));
  }

  @Override
  public Flux<Departamento> insertAllDepartamento(List<Departamento> departamentos) {
    return Flux.fromIterable(repository
      .saveAll(departamentos.stream().map(departamentoMapper::toEntity)
        .collect(Collectors.toList()))
      .stream().map(departamentoMapper::toDominio)
      .collect(Collectors.toList()));
  }
}
