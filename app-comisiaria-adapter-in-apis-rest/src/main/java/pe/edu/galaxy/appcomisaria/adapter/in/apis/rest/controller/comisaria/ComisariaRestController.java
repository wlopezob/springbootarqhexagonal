package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.comisaria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.ComisariaResponse;
import reactor.core.publisher.Flux;
import static pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.constants.ApiConstants.API_COMISARIA;

@RequestMapping(API_COMISARIA)
public interface ComisariaRestController {

  @GetMapping
  Flux<ComisariaResponse> getAll();
}
