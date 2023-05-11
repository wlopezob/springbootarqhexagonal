package pe.edu.galaxy.appcomisaria.dominio.departamento;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Departamento {
  private String id;
  private String idDpto;
  private String departamento;
  private String capital;
}
