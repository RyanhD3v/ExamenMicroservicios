package gs.api.comments.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gs.api.comments.models.Comentario;
import gs.api.comments.models.dao.ComentarioDao;

@Service
public class ComentarioServiceImp implements IComentarioService{

	@Autowired
	private ComentarioDao comentarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Comentario> findAll() {
		return (List<Comentario>) comentarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Comentario findById(Long id) {
		return comentarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Comentario save(Comentario comentario) {
		return comentarioDao.save(comentario);
		
	}

	@Override
	@Transactional
	public void delete(Long id) {
		comentarioDao.deleteById(id);
	}

}
