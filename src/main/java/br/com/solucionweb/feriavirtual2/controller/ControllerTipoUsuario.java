package br.com.solucionweb.feriavirtual2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.solucionweb.feriavirtual2.dto.TipoUsuarioDto;
import br.com.solucionweb.feriavirtual2.service.TipoUsuarioService;

@Controller
public class ControllerTipoUsuario {

	@Autowired
	private TipoUsuarioService tipoUsuarioService;
	
	 @CrossOrigin(origins = "http://localhost:4200")
		@GetMapping()
		public ResponseEntity<List<TipoUsuarioDto>> listTipoUsuario(){
			return ResponseEntity.ok(new TipoUsuarioDto().convertToList(tipoUsuarioService.listTipoUsuario()));
		}
	
}
