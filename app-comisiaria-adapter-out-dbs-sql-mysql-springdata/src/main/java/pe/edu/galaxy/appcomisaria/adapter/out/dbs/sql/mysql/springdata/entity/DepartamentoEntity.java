package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity;


import jakarta.persistence.*;
import lombok.*;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity.base.GenericEntity;

@Entity(name = "DepartamentoEntity")
@Table(name = "departamento")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class DepartamentoEntity extends GenericEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "id_dpto")
  private String idDpto;
  private String departamento;
  private String capital;
}
