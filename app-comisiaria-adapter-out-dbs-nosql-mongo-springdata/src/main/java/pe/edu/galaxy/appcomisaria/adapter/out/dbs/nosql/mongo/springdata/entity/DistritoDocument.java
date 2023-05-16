package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.base.GenericEntity;

@Document(collection = "distrito")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DistritoDocument extends GenericEntity {
  @MongoId
  @Field("_id")
  private String id;
  @Field("id_dist")
  private String idDist;
  @Field("id_prov")
  private String idProv;
  @Field("id_dpto")
  private String idDpto;
  private String departamento;
  private String provincia;
  private String distrito;
  private String capital;
}
