package br.com.solucionweb.feriavirtual2.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.solucionweb.feriavirtual2.dto.EmpleadoDto;
import br.com.solucionweb.feriavirtual2.form.EmpleadoForm;
import br.com.solucionweb.feriavirtual2.model.Empleado;
import br.com.solucionweb.feriavirtual2.service.EmpleadoService;

@RestController
@RequestMapping("/v1/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	
	@PostMapping()
	public ResponseEntity<EmpleadoDto> saveEmpleado(@RequestBody EmpleadoForm empleadoForm, UriComponentsBuilder uriBuilder) {
		Empleado empleado = empleadoService.saveEmpleado(empleadoForm);
		URI uri = uriBuilder.path("/v1/empleado/{id}")
				.buildAndExpand(empleado.getIdEmpleado())
				.toUri();
		return ResponseEntity.created(uri).body(new EmpleadoDto(empleado));//201
	}
	
	@GetMapping()
	public ResponseEntity<List<EmpleadoDto>> listEmpleado(){
		return ResponseEntity.ok(new EmpleadoDto().convertToList(empleadoService.listEmpleado()));
	}
	
}
