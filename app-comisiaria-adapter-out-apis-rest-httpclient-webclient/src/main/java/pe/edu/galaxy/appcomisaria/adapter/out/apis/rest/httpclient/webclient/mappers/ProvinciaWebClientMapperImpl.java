package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.provincia.ProvinciaResponse;
import pe.edu.galaxy.appcomisaria.dominio.provincia.Provincia;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProvinciaWebClientMapperImpl implements ProvinciaWebClientMapper{
  @Override
  public Provincia toDominio(ProvinciaResponse provinciaResponse) {
    return null;
  }

  @Override
  public ProvinciaResponse toEntity(Provincia provincia) {
    return null;
  }

  @Override
  public List<Provincia> toListDominio(List<ProvinciaResponse> list) {
    return list.get(0).getFeatures().stream()
      .map(dpto -> Provincia.builder()
        .idDpto(dpto.getAttributes().getIdDpto())
        .idProv(dpto.getAttributes().getIdPov())
        .provincia(dpto.getAttributes().getProvincia())
        .departamento(dpto.getAttributes().getDepartamento())
        .capital(dpto.getAttributes().getCapital())
        .build())
      .collect(Collectors.toList());
  }

  @Override
  public List<ProvinciaResponse> toListEntity(List<Provincia> list) {
    return null;
  }
}
