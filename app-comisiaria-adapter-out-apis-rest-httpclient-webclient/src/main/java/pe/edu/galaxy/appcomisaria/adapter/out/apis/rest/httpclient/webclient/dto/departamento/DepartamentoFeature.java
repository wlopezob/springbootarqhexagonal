package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.departamento;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartamentoFeature {
  private DepartamentoAttributes attributes;
}
