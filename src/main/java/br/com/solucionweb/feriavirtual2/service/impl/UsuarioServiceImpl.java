package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.UsuarioForm;
import br.com.solucionweb.feriavirtual2.model.Usuario;
import br.com.solucionweb.feriavirtual2.repository.UsuarioRepository;
import br.com.solucionweb.feriavirtual2.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	@Transactional
	public Usuario saveUsuario(UsuarioForm usuarioForm) {
		return usuarioRepository.save(usuarioForm.convert());
	}

	@Override
	public Optional<Usuario> getUsuario(Long id) {
		return usuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<Usuario> deleteUsuario(Long id) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if (usuario.isPresent()) {
			usuarioRepository.deleteById(id);
			return usuario;
		}
		return usuario;
	}

	@Override
	@Transactional
	public Optional<Usuario> updateUsuario(Long id, UsuarioForm usuarioForm) {
		Optional<Usuario> usuario = usuarioRepository.findById(id);
		if (usuario.isPresent()) {
			Usuario usuarioUpdated = usuarioRepository.getOne(id);
			usuarioUpdated.setRutUsuario(usuarioForm.getRutUsuario() != null? usuarioForm.getRutUsuario() :
				(usuarioUpdated.getRutUsuario() != null? usuarioUpdated.getRutUsuario() : null));
			
			usuarioUpdated.setDvUsuario(usuarioForm.getDvUsuario() != null? usuarioForm.getDvUsuario() :
				(usuarioUpdated.getDvUsuario() != null? usuarioUpdated.getDvUsuario() : null));
			
			usuarioUpdated.setNombreUsuario(usuarioForm.getNombreUsuario() != null? usuarioForm.getNombreUsuario() :
				(usuarioUpdated.getNombreUsuario() != null? usuarioUpdated.getNombreUsuario() : null));
			
			usuarioUpdated.setDireccionUsuario(usuarioForm.getDireccionUsuario() != null? usuarioForm.getDireccionUsuario() :
				(usuarioUpdated.getDireccionUsuario() != null? usuarioUpdated.getDireccionUsuario() : null));
			
			usuarioUpdated.setTelefonoUsuario(usuarioForm.getTelefonoUsuario() != null? usuarioForm.getTelefonoUsuario() :
				(usuarioUpdated.getTelefonoUsuario() != null? usuarioUpdated.getTelefonoUsuario() : null));
			
			usuarioUpdated.setEmailUsuario(usuarioForm.getEmailUsuario() != null? usuarioForm.getRutUsuario() :
				(usuarioUpdated.getEmailUsuario() != null? usuarioUpdated.getEmailUsuario() : null));
			
			return usuario;
		}
		return usuario;
	}

	@Override
	public List<Usuario> listUsuario() {
		return usuarioRepository.findAll();
	}
	
	

}
