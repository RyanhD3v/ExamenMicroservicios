package gs.api.comments.controllers;

import gs.api.comments.models.Comentario;
import gs.api.comments.models.service.IComentarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1")
public class ComentarioController {

	@Autowired
	private IComentarioService comentarioService;
	
	@GetMapping("/coments/listar")
	@ResponseStatus(HttpStatus.OK)
	public List<Comentario> getAllComents(){
		return comentarioService.findAll();
	}
	
	@GetMapping("/coments/detalle/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Comentario detalle(@PathVariable Long id) {
		Comentario comentario = comentarioService.findById(id);
		return comentario;
	}
	
	@PostMapping("/coments/agregar")
	@ResponseStatus(HttpStatus.CREATED)
	public Comentario addComent(@RequestBody Comentario comentario) {
		return comentarioService.save(comentario);

	}
	
	@DeleteMapping("/coments/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		comentarioService.delete(id);
	}
	
	@PutMapping("/coments/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Comentario editarComentario(@RequestBody Comentario comentario, @PathVariable Long id) {
		Comentario comentarioDb = comentarioService.findById(id);
		
		comentarioDb.setDescripcion(comentario.getDescripcion());
		
		return comentarioService.save(comentarioDb);
		
	}
	
	
}
