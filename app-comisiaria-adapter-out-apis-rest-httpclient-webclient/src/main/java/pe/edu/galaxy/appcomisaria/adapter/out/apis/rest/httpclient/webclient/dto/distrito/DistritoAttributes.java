package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.distrito;

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
public class DistritoAttributes {
  @JsonProperty(value = "objectid")
  private int objectId;
  @JsonProperty(value = "id_dpto")
  private String idDpto;
  private String departamento;
  @JsonProperty(value = "id_prov")
  private String idProv;
  private String provincia;
  @JsonProperty(value = "id_dist")
  private String idDist;
  private String distrito;
  private String capital;
  private String fuente;
}
