package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository;


import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.ProvinciaDocument;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.base.GenericMongoRepository;

public interface ProvinciaMongoRepository
  extends GenericMongoRepository<ProvinciaDocument, String> {
}
