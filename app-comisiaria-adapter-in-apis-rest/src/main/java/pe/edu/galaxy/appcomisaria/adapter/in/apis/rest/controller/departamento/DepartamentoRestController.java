package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.departamento;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response.DepartamentoResponse;
import reactor.core.publisher.Flux;

import static pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.controller.constants.ApiConstants.API_DEPARTAMENTO;

@RequestMapping(API_DEPARTAMENTO)
public interface DepartamentoRestController {

  @GetMapping
  Flux<DepartamentoResponse> getAll();
}
