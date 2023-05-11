package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.base.GenericEntity;

@Document(collection = "departamento")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartamentoDocument extends GenericEntity {
  @Id
  private String id;
  @Field("id_dpto")
  private String idDpto;
  private String departamento;
  private String capital;
}
