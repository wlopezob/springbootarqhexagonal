package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.departamento;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.annotation.RestControllerAdapter;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.base.GenericController;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.DepartamentoResponse;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers.DepartamentoResponseMapper;
import pe.edu.galaxy.appcomisaria.application.services.DepartamentoService;
import reactor.core.publisher.Flux;

@RestControllerAdapter
@RequiredArgsConstructor
public class DepartamentoRestControllerImpl
  extends GenericController implements DepartamentoRestController {

  private final DepartamentoService departamentoService;
  private final DepartamentoResponseMapper mapper;

  @Override
  public Flux<DepartamentoResponse> getAll() {
    return departamentoService.insertAllDepartamento()
      .map(mapper::toResponse);
  }
}
