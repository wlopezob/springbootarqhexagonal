package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.distrito;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.annotation.RestControllerAdapter;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.base.GenericController;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.DistritoResponse;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers.DistritoResponseMapper;
import pe.edu.galaxy.appcomisaria.application.services.DistritoService;
import reactor.core.publisher.Flux;

@RestControllerAdapter
@RequiredArgsConstructor
public class DistritoRestControllerImpl
  extends GenericController implements DistritoRestController {

  private final DistritoService distritoService;
  private final DistritoResponseMapper mapper;

  @Override
  public Flux<DistritoResponse> getAll() {
    return distritoService.insertAllDistrito().map(mapper::toResponse);
  }
}
