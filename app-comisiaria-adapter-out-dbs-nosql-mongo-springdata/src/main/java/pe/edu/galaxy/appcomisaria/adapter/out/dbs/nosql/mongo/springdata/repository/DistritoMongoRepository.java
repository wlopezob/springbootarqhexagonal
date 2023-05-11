package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository;


import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.DistritoDocument;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.base.GenericMongoRepository;

public interface DistritoMongoRepository
  extends GenericMongoRepository<DistritoDocument, String> {
}
