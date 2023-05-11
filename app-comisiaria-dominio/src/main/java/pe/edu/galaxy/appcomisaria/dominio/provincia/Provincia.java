package pe.edu.galaxy.appcomisaria.dominio.provincia;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Provincia {
  private String id;
  private String idDpto;
  private String idProv;
  private String provincia;
  private String departamento;
  private String capital;
}
