package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.departamento;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartamentoAttributes {
  @JsonProperty(value = "objectid")
  private int objectId;
  @JsonProperty(value = "id_dpto")
  private String idDpto;
  private String departamento;
  private String capital;
  private String fuente;
}
