package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity.DepartamentoEntity;
import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;

import java.util.List;

@Component
public class DepartamentoMysqlMapperImpl implements DepartamentoMysqlMapper {

  @Override
  public Departamento toDominio(DepartamentoEntity DepartamentoEntity) {
    return Departamento.builder()
      .idDpto(DepartamentoEntity.getIdDpto())
      .departamento(DepartamentoEntity.getDepartamento())
      .capital(DepartamentoEntity.getCapital())
      .build();
  }

  @Override
  public DepartamentoEntity toEntity(Departamento departamento) {
    return DepartamentoEntity.builder()
      .idDpto(departamento.getIdDpto())
      .departamento(departamento.getDepartamento())
      .capital(departamento.getCapital())
      .build();
  }

  @Override
  public List<Departamento> toListDominio(List<DepartamentoEntity> list) {
    return null;
  }

  @Override
  public List<DepartamentoEntity> toListEntity(List<Departamento> list) {
    return null;
  }
}
