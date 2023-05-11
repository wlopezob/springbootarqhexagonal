package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository;


import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.ComisariaDocument;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.base.GenericMongoRepository;

public interface ComisariaMongoRepository extends GenericMongoRepository<ComisariaDocument, String> {
}
