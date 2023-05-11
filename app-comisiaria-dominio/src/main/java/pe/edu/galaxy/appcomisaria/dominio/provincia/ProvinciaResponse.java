package pe.edu.galaxy.appcomisaria.dominio.provincia;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProvinciaResponse {
  private String id;
  private String idDpto;
  private String idProv;
  private String String;
  private String provincia;
  private String capital;
}
