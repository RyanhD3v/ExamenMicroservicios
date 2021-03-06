package gs.apiredsocial.controller;

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

import gs.apiredsocial.entity.Usuario;
import gs.apiredsocial.service.UsuarioDaoImp;

@RestController
@RequestMapping("/v1")
public class UsuarioController {
	
	@Autowired
	private UsuarioDaoImp usuarioService;
	
	@GetMapping("/users/listar")
	@ResponseStatus(HttpStatus.OK)
	public List<Usuario> getAllUsers() {
		return usuarioService.findAll();
	}
	
	@GetMapping("/users/detalle/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Usuario datos(@PathVariable Long id) {
		return usuarioService.findById(id);
	}
	
	@PostMapping("/users/agregar")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario addUser(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@DeleteMapping("/users/borrar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		usuarioService.delete(id);
	}
	
	@PutMapping("/users/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario editarComentario(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario usuarioDb = usuarioService.findById(id);
		
		usuarioDb.setNombre(usuario.getNombre());
		usuarioDb.setApellido(usuario.getApellido());
		usuarioDb.setPais(usuario.getPais());
		usuarioDb.setCorreo(usuario.getCorreo());
		
		return usuarioService.save(usuarioDb);
		
	}

}
