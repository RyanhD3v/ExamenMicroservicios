/*package gs.api.publication.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import gs.api.publication.entity.Publicacion;

@FeignClient(name = "social-users")
public interface PublicacionClienteRest {
	
	@GetMapping("/listar")
	public List<Publicacion> listar();
	
	@GetMapping("/ver/{id}")
	public Publicacion detalle(@PathVariable Long id);

}*/
