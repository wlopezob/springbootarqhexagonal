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

@Document(collection = "comisaria")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ComisariaDocument extends GenericEntity {
  @MongoId
  @Field("_id")
  private String id;
  @Field("id_dpto")
  private String idDpto;
  private String departamento;
  @Field("id_prov")
  private String idProv;
  private String provincia;
  @Field("id_dist")
  private String idDist;
  private String distrito;
  private String comisaria;
  private String categoria;
  private String zonaUtm;
}
