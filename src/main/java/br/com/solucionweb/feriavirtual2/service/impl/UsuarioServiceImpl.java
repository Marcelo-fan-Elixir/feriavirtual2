package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.dto.UsuarioDto;
import br.com.solucionweb.feriavirtual2.form.UsuarioForm;
import br.com.solucionweb.feriavirtual2.model.Usuario;
import br.com.solucionweb.feriavirtual2.repository.UsuarioRepository;
import br.com.solucionweb.feriavirtual2.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario saveUsuario(UsuarioForm usuarioForm) {
		return usuarioRepository.save(usuarioForm.convert());
	}

	@Override
	public Optional<Usuario> getUsuario(Long id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Optional<UsuarioDto> deleteUsuario() {
		return null;
	}

	@Override
	public Optional<UsuarioDto> updateUsuario() {
		return null;
	}

	@Override
	public Optional<List<UsuarioDto>> listUsuario() {
		return null;
	}
	
	

}
