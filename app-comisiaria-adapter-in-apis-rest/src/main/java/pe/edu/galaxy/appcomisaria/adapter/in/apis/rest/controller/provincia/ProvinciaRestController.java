package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.provincia;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.ProvinciaResponse;
import reactor.core.publisher.Flux;

import static pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.constants.ApiConstants.API_PROVINCIA;

@RequestMapping(API_PROVINCIA)
public interface ProvinciaRestController {

  @GetMapping
  Flux<ProvinciaResponse> getAll();
}
