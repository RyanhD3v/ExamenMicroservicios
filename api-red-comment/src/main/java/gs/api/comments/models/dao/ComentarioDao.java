package gs.api.comments.models.dao;

import org.springframework.data.repository.CrudRepository;

import gs.api.comments.models.Comentario;

public interface ComentarioDao extends CrudRepository<Comentario, Long>{

}
