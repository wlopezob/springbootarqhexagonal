package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.DistritoResponse;
import pe.edu.galaxy.appcomisaria.dominio.distrito.Distrito;

import java.util.List;

@Component
public class DistritoResponseMapperImpl implements DistritoResponseMapper {
  @Override
  public Distrito toDomino(DistritoResponse distritoResponse) {
    return Distrito.builder()
      .idDist(distritoResponse.getIdDist())
      .idProv(distritoResponse.getIdProv())
      .idDpto(distritoResponse.getIdDpto())
      .departamento(distritoResponse.getDepartamento())
      .provincia(distritoResponse.getProvincia())
      .distrito(distritoResponse.getDistrito())
      .capital(distritoResponse.getCapital())
      .build();
  }

  @Override
  public DistritoResponse toResponse(Distrito distrito) {
    return DistritoResponse.builder()
      .idDist(distrito.getIdDist())
      .idDpto(distrito.getIdDpto())
      .idProv(distrito.getIdProv())
      .provincia(distrito.getProvincia())
      .departamento(distrito.getDepartamento())
      .distrito(distrito.getDistrito())
      .capital(distrito.getCapital())
      .build();
  }

  @Override
  public List<Distrito> toListDomino(List<DistritoResponse> list) {
    return null;
  }

  @Override
  public List<DistritoResponse> toListResponse(List<Distrito> listD) {
    return null;
  }

}
