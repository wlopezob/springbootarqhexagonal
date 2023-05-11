package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository;


import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.DepartamentoDocument;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.base.GenericMongoRepository;

public interface DepartamentoMongoRepository
  extends GenericMongoRepository<DepartamentoDocument, String> {
}
