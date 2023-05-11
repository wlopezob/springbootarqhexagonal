package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.mappers;

import org.springframework.stereotype.Component;
import pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.departamento.DepartamentoResponse;
import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DepartamentoWebClientMapperImpl implements DepartamentoWebClientMapper{
  @Override
  public Departamento toDominio(DepartamentoResponse departamentoResponse) {
    return null;
  }

  @Override
  public DepartamentoResponse toEntity(Departamento departamento) {
    return null;
  }

  @Override
  public List<Departamento> toListDominio(List<DepartamentoResponse> list) {
    return list.get(0).getFeatures().stream()
      .map(dpto -> Departamento.builder()
        .idDpto(dpto.getAttributes().getIdDpto())
        .departamento(dpto.getAttributes().getDepartamento())
        .capital(dpto.getAttributes().getCapital())
        .build())
      .collect(Collectors.toList());
  }

  @Override
  public List<DepartamentoResponse> toListEntity(List<Departamento> list) {
    return null;
  }
}
