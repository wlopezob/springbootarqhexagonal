package pe.edu.galaxy.appcomisaria.adapter.out.dbs.sql.mysql.springdata.mappers;

import java.util.List;

public interface GenericMapper<D, E> {
  D toDominio(E e);

  E toEntity(D d);

  List<D> toListDominio(List<E> list);

  List<E> toListEntity(List<D> list);
}
