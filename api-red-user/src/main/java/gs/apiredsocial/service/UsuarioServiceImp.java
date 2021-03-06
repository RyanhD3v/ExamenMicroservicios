package gs.apiredsocial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gs.apiredsocial.dao.UsuarioDao;
import gs.apiredsocial.entity.Usuario;

@Service
public class UsuarioServiceImp implements UsuarioDaoImp{

	
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
		
	}

	@Override
	@Transactional
	public Usuario save(Usuario user) {
		return usuarioDao.save(user);
		
	}

	@Override
	@Transactional
	public void delete(Long id) {
		usuarioDao.deleteById(id);
	}

	

}
