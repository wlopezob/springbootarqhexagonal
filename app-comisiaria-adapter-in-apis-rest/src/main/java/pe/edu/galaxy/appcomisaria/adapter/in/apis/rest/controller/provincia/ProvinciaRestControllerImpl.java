package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.provincia;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.annotation.RestControllerAdapter;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.base.GenericController;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.ProvinciaResponse;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers.ProvinciaResponseMapper;
import pe.edu.galaxy.appcomisaria.application.services.ProvinciaService;
import reactor.core.publisher.Flux;

@RestControllerAdapter
@RequiredArgsConstructor
public class ProvinciaRestControllerImpl
  extends GenericController implements ProvinciaRestController{

  private final ProvinciaService provinciaService;
  private final ProvinciaResponseMapper mapper;

  @Override
  public Flux<ProvinciaResponse> getAll() {
    return provinciaService.insertAllProvincia().map(mapper::toResponse);
  }
}
