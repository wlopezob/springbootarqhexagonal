package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity;

import jakarta.persistence.*;
import lombok.*;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity.base.GenericEntity;

@Entity(name = "ProvinciaEntity")
@Table(name = "provincia")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class ProvinciaEntity extends GenericEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "id_dpto")
  private String idDpto;
  @Column(name = "id_prov")
  private String idProv;
    private String provincia;
  private String capital;
}
