package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.distrito.DistritoResponse;
import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DistritoWebClientMapperImpl implements DistritoWebClientMapper{
  @Override
  public Distrito toDominio(DistritoResponse provinciaResponse) {
    return null;
  }

  @Override
  public DistritoResponse toEntity(Distrito provincia) {
    return null;
  }

  @Override
  public List<Distrito> toListDominio(List<DistritoResponse> list) {
    return list.get(0).getFeatures().stream()
      .map(dist -> Distrito.builder()
        .idDpto(dist.getAttributes().getIdDpto())
        .idProv(dist.getAttributes().getIdProv())
        .provincia(dist.getAttributes().getProvincia())
        .departamento(dist.getAttributes().getDepartamento())
        .capital(dist.getAttributes().getCapital())
        .idDist(dist.getAttributes().getIdDist())
        .distrito(dist.getAttributes().getDistrito())
        .build())
      .collect(Collectors.toList());
  }

  @Override
  public List<DistritoResponse> toListEntity(List<Distrito> list) {
    return null;
  }
}
