package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericMysqlRepository <T,ID> extends JpaRepository<T, ID> {
}
