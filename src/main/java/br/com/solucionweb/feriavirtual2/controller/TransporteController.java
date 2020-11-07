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

import br.com.solucionweb.feriavirtual2.dto.TransporteDto;
import br.com.solucionweb.feriavirtual2.form.TransporteForm;
import br.com.solucionweb.feriavirtual2.model.Transporte;
import br.com.solucionweb.feriavirtual2.service.TransporteService;

@RestController
@RequestMapping("v1/transporte")
public class TransporteController {
	
	@Autowired
	private TransporteService transporteService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping()
	public ResponseEntity<TransporteDto> saveTransporte(@RequestBody TransporteForm transporteForm, UriComponentsBuilder uriBuilder) {
		Transporte transporte = transporteService.saveTransporte(transporteForm);
		URI uri = uriBuilder.path("/v1/transporte/{id}")
				.buildAndExpand(transporte.getIdTransporte())
				.toUri();
		return ResponseEntity.created(uri).body(new TransporteDto(transporte));//201
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TransporteDto> getTransporte(@PathVariable Long id) {
		Optional<Transporte> transporte = transporteService.getTransporte(id);
		if (transporte.isPresent()) {
			return ResponseEntity.ok().body(new TransporteDto(transporte.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public ResponseEntity<List<TransporteDto>> listTransporte(){
		return ResponseEntity.ok(new TransporteDto().convertToList(transporteService.listTransporte()));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTransporte(@PathVariable Long id){
		Optional<Transporte> transporte = transporteService.deleteTransporte(id);
		if (transporte.isPresent()) {
			return ResponseEntity.noContent().build();//204 
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTransporte(@PathVariable Long id,@RequestBody TransporteForm transporteForm){
		Optional<Transporte> transporte = transporteService.updateTransporte(id, transporteForm);
		if(transporte.isPresent()) {
			return ResponseEntity.ok().body(new TransporteDto(transporte.get()));	
		}
		return ResponseEntity.notFound().build();
	}
}
