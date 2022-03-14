package gs.api.publication.service;

import java.util.List;

import gs.api.publication.entity.Publicacion;

public interface PublicacionService {
	
	public List<Publicacion> findAll();
	public Publicacion findById(Long id);
	public Publicacion save(Publicacion publicacion);
	public void delete(Long id);
	
}
