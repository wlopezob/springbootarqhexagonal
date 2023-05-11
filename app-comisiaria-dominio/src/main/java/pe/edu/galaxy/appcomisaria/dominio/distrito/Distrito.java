package pe.edu.galaxy.appcomisaria.dominio.distrito;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Distrito {
  private String id;
  private String idDist;
  private String idProv;
  private String idDpto;
  private String departamento;
  private String provincia;
  private String distrito;
  private String capital;
}
