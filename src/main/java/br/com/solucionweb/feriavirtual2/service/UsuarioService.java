package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.dto.UsuarioDto;
import br.com.solucionweb.feriavirtual2.form.UsuarioForm;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public interface UsuarioService {
	
	public Usuario saveUsuario(UsuarioForm usuarioForm);
	
	public Optional<Usuario> getUsuario(Long id);

	public Optional<UsuarioDto> deleteUsuario();
	
	public Optional<UsuarioDto> updateUsuario();
	
	public Optional<List<UsuarioDto>> listUsuario();
	
}
