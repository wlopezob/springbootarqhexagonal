package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers;
import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity.ProvinciaEntity;
import pe.edu.galaxy.appcomisaria.dominio.provincia.Provincia;

import java.util.List;

@Component
public class ProvinciaMysqlMapperImpl implements ProvinciaMysqlMapper {
  @Override
  public Provincia toDominio(ProvinciaEntity ProvinciaEntity) {
    return Provincia.builder()
      .id(ProvinciaEntity.getId().toString())
      .idDpto(ProvinciaEntity.getIdDpto())
      .idProv(ProvinciaEntity.getIdProv())
      .provincia(ProvinciaEntity.getProvincia())
      .capital(ProvinciaEntity.getCapital())
      .build();
  }

  @Override
  public ProvinciaEntity toEntity(Provincia provincia) {
    return ProvinciaEntity.builder()
      .idDpto(provincia.getIdDpto())
      .idProv(provincia.getIdProv())
      .provincia(provincia.getProvincia())
      .capital(provincia.getCapital())
      .build();
  }

  @Override
  public List<Provincia> toListDominio(List<ProvinciaEntity> list) {
    return null;
  }

  @Override
  public List<ProvinciaEntity> toListEntity(List<Provincia> list) {
    return null;
  }
}
