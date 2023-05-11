package pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.mappers;

import pe.edu.galaxy.appcomisaria.adapter.out.dbs.nosql.mongo.springdata.entity.DepartamentoDocument;
import pe.edu.galaxy.appcomisaria.dominio.departamento.Departamento;

public interface DepartamentoMongoMapper extends GenericMongoMapper<Departamento, DepartamentoDocument> {
}
