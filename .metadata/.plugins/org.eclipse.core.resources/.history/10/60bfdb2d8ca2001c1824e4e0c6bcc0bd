package gs.api.publication.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gs.api.publication.entity.Publicacion;
import gs.api.publication.entity.dao.PublicacionDao;


@Service
public class PublicacionServiceImp implements PublicacionService{

	//@Autowired
	//private PublicacionClienteRest clienteFeign;
	
	@Autowired
	private PublicacionDao publicacionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Publicacion> findAll() {
		//return clienteFeign.listar().stream().map(p -> new Publicacion()).collect(Collectors.toList());
		return (List<Publicacion>) publicacionDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Publicacion findById(Long id) {
		return publicacionDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Publicacion save(Publicacion publicacion) {
		return publicacionDao.save(publicacion);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		publicacionDao.deleteById(id);
		
	}

}
