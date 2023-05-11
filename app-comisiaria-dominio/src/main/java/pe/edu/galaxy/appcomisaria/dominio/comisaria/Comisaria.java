package pe.edu.galaxy.appcomisaria.dominio.comisaria;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comisaria {
  private String id;
  private String idDpto;
  private String departamento;
  private String idProv;
  private String provincia;
  private String idDist;
  private String distrito;
  private String comisaria;
  private String zonaUtm;
  private String categoria;
}
