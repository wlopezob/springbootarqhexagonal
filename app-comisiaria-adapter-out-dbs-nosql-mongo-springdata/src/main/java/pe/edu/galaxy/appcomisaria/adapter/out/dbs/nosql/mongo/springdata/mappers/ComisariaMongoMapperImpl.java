package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.ComisariaDocument;
import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;

import java.util.List;

@Component
public class ComisariaMongoMapperImpl implements ComisariaMongoMapper {
  @Override
  public Comisaria toDominio(ComisariaDocument comisariaDocument) {
    return Comisaria.builder()
      .idDpto(comisariaDocument.getIdDpto())
      .departamento(comisariaDocument.getDepartamento())
      .idProv(comisariaDocument.getIdProv())
      .provincia(comisariaDocument.getProvincia())
      .idDist(comisariaDocument.getIdDist())
      .comisaria(comisariaDocument.getComisaria())
      .categoria(comisariaDocument.getCategoria())
      .zonaUtm(comisariaDocument.getZonaUtm())
      .build();
  }

  @Override
  public ComisariaDocument toEntity(Comisaria comisaria) {
    return ComisariaDocument.builder()
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
  public List<Comisaria> toListDominio(List<ComisariaDocument> list) {
    return null;
  }

  @Override
  public List<ComisariaDocument> toListEntity(List<Comisaria> list) {
    return null;
  }
}
