package gs.api.comments.models.service;

import java.util.List;

import gs.api.comments.models.Comentario;

public interface IComentarioService {

	public List<Comentario> findAll();
	public Comentario findById(Long id);
	public Comentario save(Comentario comentario);
	public void delete(Long id);
	
}
