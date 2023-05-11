package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.DepartamentoResponse;
import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;

import java.util.List;

@Component
public class DepartamentoResponseMapperImpl implements DepartamentoResponseMapper {
  @Override
  public Departamento toDomino(DepartamentoResponse departamentoResponse) {
    return Departamento.builder()
      .id(departamentoResponse.getId())
      .idDpto(departamentoResponse.getIdDpto())
      .departamento(departamentoResponse.getDepartamento())
      .capital(departamentoResponse.getCapital())
      .build();
  }

  @Override
  public DepartamentoResponse toResponse(Departamento departamento) {
    return DepartamentoResponse.builder()
      .id(departamento.getId())
      .idDpto(departamento.getIdDpto())
      .departamento(departamento.getDepartamento())
      .capital(departamento.getCapital())
      .build();
  }

  @Override
  public List<Departamento> toListDomino(List<DepartamentoResponse> list) {
    return null;
  }

  @Override
  public List<DepartamentoResponse> toListResponse(List<Departamento> listD) {
    return null;
  }
}
