package gs.api.publication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
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

import gs.api.publication.entity.Publicacion;
import gs.api.publication.service.PublicacionService;

@RestController
@RequestMapping("/v1")
public class PublicacionController {
	
	//@Qualifier("serviceFeign")
	@Autowired
	private PublicacionService publicacionService;
	
	//Obtener publicaciones
	@GetMapping("/publication/listar")
	@ResponseStatus(HttpStatus.OK)
	public List<Publicacion> listar(){
		return publicacionService.findAll();
	}
	
	//Obtenes Publicacion por id
	@GetMapping("/publication/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Publicacion detalle(@PathVariable Long id) {
		Publicacion publicacion = publicacionService.findById(id);
		return publicacion;
	}
	
	//Crear Publicacion
	@PostMapping("/publication/agregar")
	@ResponseStatus(HttpStatus.CREATED)
	public Publicacion addPublication(@RequestBody Publicacion publicacion) {
		return publicacionService.save(publicacion);

	}
	
	//Borrar publicacion
	@DeleteMapping("/publication/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		publicacionService.delete(id);
	}
	
	//Actualizar publicacion
	@PutMapping("/publication/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Publicacion editarPublication(@RequestBody Publicacion publicacion, @PathVariable Long id) {
		Publicacion publicacionDb = publicacionService.findById(id);
		
		publicacionDb.setDescripcion(publicacion.getDescripcion());
		
		return publicacionService.save(publicacionDb);
		
	}
	
	

}
