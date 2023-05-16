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

@Document(collection = "provincia")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProvinciaDocument extends GenericEntity {
  @MongoId
  @Field("_id")
  private String id;
  @Field("id_dpto")
  private String idDpto;
  @Field("id_prov")
  private String idProv;
  private String provincia;
  private String departamento;
  private String capital;
}
