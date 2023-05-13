package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity;

import jakarta.persistence.*;
import lombok.*;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity.base.GenericEntity;

@Entity(name = "ComisariaEntity")
@Table(name = "comisaria")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class ComisariaEntity extends GenericEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "id_dpto")
  private String idDpto;
  private String departamento;
  @Column(name = "id_prov")
  private String idProv;
  private String provincia;
  @Column(name = "id_dist")
  private String idDist;
  private String distrito;
  private String comisaria;
  private String categoria;
  @Column(name = "zona_utm")
  private String zonaUtm;
}
