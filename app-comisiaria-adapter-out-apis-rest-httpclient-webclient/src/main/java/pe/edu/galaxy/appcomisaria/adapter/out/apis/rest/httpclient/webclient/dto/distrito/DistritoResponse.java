package pe.edu.galaxy.appcomisaria.adapter.out.apis.rest.httpclient.webclient.dto.distrito;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DistritoResponse {
  private List<DistritoFeature> features;
}
