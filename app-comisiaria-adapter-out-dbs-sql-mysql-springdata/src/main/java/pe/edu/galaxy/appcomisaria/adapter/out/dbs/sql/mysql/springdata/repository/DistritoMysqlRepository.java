package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.entity.DistritoEntity;
import pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.base.GenericMysqlRepository;

public interface DistritoMysqlRepository extends GenericMysqlRepository<DistritoEntity, Long> {

}
