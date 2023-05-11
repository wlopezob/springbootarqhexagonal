package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.repository.base;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericMongoRepository<T,ID> extends ReactiveMongoRepository<T, ID> {
}
