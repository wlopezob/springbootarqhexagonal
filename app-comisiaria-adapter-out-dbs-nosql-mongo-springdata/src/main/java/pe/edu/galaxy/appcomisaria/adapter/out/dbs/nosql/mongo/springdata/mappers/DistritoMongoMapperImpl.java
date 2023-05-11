package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.DistritoDocument;
import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DistritoMongoMapperImpl implements DistritoMongoMapper {
  @Override
  public Distrito toDominio(DistritoDocument distritoDocument) {
    return Distrito.builder()
      .id(distritoDocument.getId())
      .idDpto(distritoDocument.getIdDpto())
      .idProv(distritoDocument.getIdProv())
      .idDist(distritoDocument.getIdDist())
      .departamento(distritoDocument.getDepartamento())
      .provincia(distritoDocument.getProvincia())
      .distrito(distritoDocument.getDistrito())
      .capital(distritoDocument.getCapital())
      .build();
  }

  @Override
  public DistritoDocument toEntity(Distrito distrito) {
    return DistritoDocument.builder()
      .idDpto(distrito.getIdDpto())
      .idProv(distrito.getIdProv())
      .idDist(distrito.getIdDist())
      .departamento(distrito.getDepartamento())
      .provincia(distrito.getProvincia())
      .distrito(distrito.getDistrito())
      .capital(distrito.getCapital())
      .build();
  }

  @Override
  public List<Distrito> toListDominio(List<DistritoDocument> list) {
    return list.stream().map(dist -> Distrito.builder()
      .id(dist.getId())
      .idDpto(dist.getIdDpto())
      .idProv(dist.getIdProv())
      .idDist(dist.getIdDist())
      .departamento(dist.getDepartamento())
      .provincia(dist.getProvincia())
      .distrito(dist.getDistrito())
      .capital(dist.getCapital())
      .build()).collect(Collectors.toList());
  }

  @Override
  public List<DistritoDocument> toListEntity(List<Distrito> list) {
    return null;
  }
}
