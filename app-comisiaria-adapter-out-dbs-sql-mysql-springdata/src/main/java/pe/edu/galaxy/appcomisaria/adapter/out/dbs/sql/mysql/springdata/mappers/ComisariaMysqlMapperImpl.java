package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity.ComisariaEntity;
import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;

import java.util.List;

@Component
public class ComisariaMysqlMapperImpl implements ComisariaMysqlMapper {
  @Override
  public Comisaria toDominio(ComisariaEntity comisariaEntity) {
    return Comisaria.builder()
      .idDpto(comisariaEntity.getIdDpto())
      .departamento(comisariaEntity.getDepartamento())
      .idProv(comisariaEntity.getIdProv())
      .provincia(comisariaEntity.getProvincia())
      .idDist(comisariaEntity.getIdDist())
      .comisaria(comisariaEntity.getComisaria())
      .categoria(comisariaEntity.getCategoria())
      .zonaUtm(comisariaEntity.getZonaUtm())
      .build();
  }

  @Override
  public ComisariaEntity toEntity(Comisaria comisaria) {
    return ComisariaEntity.builder()
      .idDpto(comisaria.getIdDpto())
      .departamento(comisaria.getDepartamento())
      .idProv(comisaria.getIdProv())
      .provincia(comisaria.getProvincia())
      .idDist(comisaria.getIdDist())
      .comisaria(comisaria.getComisaria())
      .categoria(comisaria.getCategoria())
      .zonaUtm(comisaria.getZonaUtm())
      .build();
  }

  @Override
  public List<Comisaria> toListDominio(List<ComisariaEntity> list) {
    return null;
  }

  @Override
  public List<ComisariaEntity> toListEntity(List<Comisaria> list) {
    return null;
  }
}
