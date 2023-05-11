package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.mappers;

import java.util.List;

public interface GenericResponseMapper<D,E> {

	D toDomino( E e);
	
	E toResponse( D d);
	
	List<D> toListDomino( List<E> list);
	
	List<E> toListResponse( List<D> listD);
	
}
