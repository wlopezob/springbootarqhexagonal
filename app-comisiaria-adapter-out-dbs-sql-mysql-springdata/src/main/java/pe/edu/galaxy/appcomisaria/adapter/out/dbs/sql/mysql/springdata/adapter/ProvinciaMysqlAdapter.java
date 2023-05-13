package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.adapter.base.GenericMysqlAdapter;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers.ProvinciaMysqlMapper;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.ProvinciaMysqlRepository;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinciaGetAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinicaDeleteAllPort;
import pe.edu.galaxy.appcomisaria.application.ports.out.provincia.ProvinicaInsertAllPort;
import pe.edu.galaxy.appcomisaria.dominio.provincia.Provincia;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class ProvinciaMysqlAdapter
  extends GenericMysqlAdapter implements ProvinciaGetAllPort, ProvinicaDeleteAllPort,
  ProvinicaInsertAllPort {

  private final ProvinciaMysqlRepository repository;
  private final ProvinciaMysqlMapper mapper;

  @Override
  public Mono<List<Provincia>> getAllProvincia() {
    return Mono.just(repository.findAll().stream()
      .map(mapper::toDominio).collect(Collectors.toList()));
  }

  @Override
  public Mono<Boolean> deleteAllProvincia() {
    return Mono.defer(() -> {
      repository.deleteAll();
      return Mono.just(true);
    });
  }

  @Override
  public Mono<List<Provincia>> insertAllProvincia(List<Provincia> list) {
    return Mono.just(repository.saveAll(list.stream()
        .map(mapper::toEntity).collect(Collectors.toList()))
      .stream().map(mapper::toDominio).collect(Collectors.toList()));
  }
}
