package gs.apiredsocial.service;

import java.util.List;

import gs.apiredsocial.entity.Usuario;

public interface UsuarioDaoImp{
	
	public List<Usuario> findAll();
	public Usuario findById(Long id);
	public Usuario save(Usuario user);
	public void delete(Long id);

	
	
	

}
