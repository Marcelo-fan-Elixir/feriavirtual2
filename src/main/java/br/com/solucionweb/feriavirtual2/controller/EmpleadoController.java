package br.com.solucionweb.feriavirtual2.controller;
 
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}")
	public ResponseEntity<EmpleadoDto> getEmpleado(@PathVariable Long id){
		Optional<Empleado> emplado = empleadoService.getEmpleado(id);
		if (emplado.isPresent()) {
			return ResponseEntity.noContent().build();//204
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmpleado(@PathVariable Long id){
		Optional<Empleado> empleado = empleadoService.deleteEmpleado(id);
		if (empleado.isPresent()) {
			return ResponseEntity.noContent().build();//204
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateEmpleado(@PathVariable Long id,@RequestBody EmpleadoForm empleadoForm){
		Optional<Empleado> empleado = empleadoService.updateEmpleado(id, empleadoForm);
		if(empleado.isPresent()) {
			return ResponseEntity.ok().body(new EmpleadoDto(empleado.get()));	
		}
		return ResponseEntity.notFound().build();
	}
	
}
