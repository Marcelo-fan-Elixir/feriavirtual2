package br.com.solucionweb.feriavirtual2.controller;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.solucionweb.feriavirtual2.dto.UsuarioDto;
import br.com.solucionweb.feriavirtual2.form.UsuarioForm;
import br.com.solucionweb.feriavirtual2.model.Usuario;
import br.com.solucionweb.feriavirtual2.service.UsuarioService;

@RestController
@RequestMapping("v1/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping()
	public ResponseEntity<UsuarioDto> saveUsuario(@RequestBody UsuarioForm usuarioForm, UriComponentsBuilder uriBuilder) {
		Usuario usuario = usuarioService.saveUsuario(usuarioForm);
		URI uri = uriBuilder.path("/v1/usuario/{id}")
				.buildAndExpand(usuario.getIdUsuario())
				.toUri();
		return ResponseEntity.created(uri).body(new UsuarioDto(usuario));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UsuarioDto> getUsuario(@PathVariable Long id) {
		Optional<Usuario> usuario = usuarioService.getUsuario(id);
		if (usuario.isPresent()) {
			return ResponseEntity.ok().body(new UsuarioDto(usuario.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
}
