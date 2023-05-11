package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ProvinciaResponse {
  private String idDpto;
  private String idProv;
  private String provincia;
  private String departamento;
  private String capital;
}
