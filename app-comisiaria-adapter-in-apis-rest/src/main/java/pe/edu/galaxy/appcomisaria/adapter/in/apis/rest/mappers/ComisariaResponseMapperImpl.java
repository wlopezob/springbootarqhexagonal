package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.ComisariaResponse;
import pe.edu.galaxy.appcomisaria.dominio.comisaria.Comisaria;

import java.util.List;

@Component
public class ComisariaResponseMapperImpl implements ComisariaResponseMapper {
  @Override
  public Comisaria toDomino(ComisariaResponse comisariaResponse) {
    return Comisaria.builder()
      .idDpto(comisariaResponse.getIdDpto())
      .departamento(comisariaResponse.getDepartamento())
      .idProv(comisariaResponse.getIdProv())
      .provincia(comisariaResponse.getProvincia())
      .idDist(comisariaResponse.getIdDist())
      .distrito(comisariaResponse.getDistrito())
      .comisaria(comisariaResponse.getComisaria())
      .zonaUtm(comisariaResponse.getZonaUtm())
      .categoria(comisariaResponse.getCategoria())
      .build();
  }

  @Override
  public ComisariaResponse toResponse(Comisaria comisaria) {
    return ComisariaResponse.builder()
      .idDpto(comisaria.getIdDpto())
      .departamento(comisaria.getDepartamento())
      .idProv(comisaria.getIdProv())
      .provincia(comisaria.getProvincia())
      .idDist(comisaria.getIdDist())
      .distrito(comisaria.getDistrito())
      .comisaria(comisaria.getComisaria())
      .zonaUtm(comisaria.getZonaUtm())
      .categoria(comisaria.getCategoria())
      .build();
  }

  @Override
  public List<Comisaria> toListDomino(List<ComisariaResponse> list) {
    return null;
  }

  @Override
  public List<ComisariaResponse> toListResponse(List<Comisaria> listD) {
    return null;
  }

}
