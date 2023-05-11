package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.comisaria;

import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.annotation.RestControllerAdapter;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.base.GenericController;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.ComisariaResponse;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers.ComisariaResponseMapper;
import pe.edu.galaxy.appcomisaria.application.services.ComisariaService;
import reactor.core.publisher.Flux;

@RestControllerAdapter
@RequiredArgsConstructor
public class ComisariaRestControllerImpl
  extends GenericController implements ComisariaRestController {

  private final ComisariaService distritoService;
  private final ComisariaResponseMapper mapper;

  @Override
  public Flux<ComisariaResponse> getAll() {
    return distritoService.getAllComisaria().map(mapper::toResponse);
  }
}
