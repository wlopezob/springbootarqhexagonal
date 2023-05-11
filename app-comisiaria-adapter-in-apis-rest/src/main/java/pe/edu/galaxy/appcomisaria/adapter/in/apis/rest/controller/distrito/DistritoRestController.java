package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.distrito;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.DistritoResponse;
import reactor.core.publisher.Flux;

import static pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.constants.ApiConstants.API_DISTRITO;

@RequestMapping(API_DISTRITO)
public interface DistritoRestController {

  @GetMapping
  Flux<DistritoResponse> getAll();
}
