package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity;

import jakarta.persistence.*;
import lombok.*;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity.base.GenericEntity;

@Entity(name = "DistritoEntity")
@Table(name = "distrito")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class DistritoEntity extends GenericEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "id_dist")
  private String idDist;
  @Column(name = "id_prov")
  private String idProv;
  @Column(name = "id_dpto")
  private String idDpto;
  private String departamento;
  private String provincia;
  private String distrito;
  private String capital;
}
