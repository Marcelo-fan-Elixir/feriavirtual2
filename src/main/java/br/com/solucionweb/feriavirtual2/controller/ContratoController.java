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

import br.com.solucionweb.feriavirtual2.dto.ContratoDto;
import br.com.solucionweb.feriavirtual2.form.ContratoForm;
import br.com.solucionweb.feriavirtual2.model.Contrato;
import br.com.solucionweb.feriavirtual2.repository.ContratoRepository;
import br.com.solucionweb.feriavirtual2.service.ContratoService;
import br.com.solucionweb.feriavirtual2.util.PdfGenerate;

@RestController
@RequestMapping("/v1/contrato")
public class ContratoController {

	@Autowired
	private ContratoService contratoService;
	
	@PostMapping()
	public ResponseEntity<ContratoDto> saveContrato(@RequestBody ContratoForm contratoForm, UriComponentsBuilder uriBuilder) {
		Contrato contrato = contratoService.saveContrato(contratoForm);
		URI uri = uriBuilder.path("/v1/contrato/{id}")
				.buildAndExpand(contrato.getIdContrato())
				.toUri();
		return ResponseEntity.created(uri).body(new ContratoDto(contrato));//201
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ContratoDto> getContrato(@PathVariable Long id){
		Optional<Contrato> contrato = contratoService.getContrato(id);
		if(contrato.isPresent()) {
			return ResponseEntity.ok().body(new ContratoDto(contrato.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping()
	public ResponseEntity<List<ContratoDto>> listContrato(){
		return ResponseEntity.ok(new ContratoDto().convertToList(contratoService.listContrato()));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteContrato(@PathVariable Long id){
		Optional<Contrato> contrato = contratoService.deleteContrato(id);
		if (contrato.isPresent()) {
			return ResponseEntity.noContent().build();//204 
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateContrato(@PathVariable Long id,@RequestBody ContratoForm contratoForm){
		Optional<Contrato> contrato = contratoService.updateContrato(id, contratoForm);
		if(contrato.isPresent()) {
			return ResponseEntity.ok().body(new ContratoDto(contrato.get()));	
		}
		return ResponseEntity.notFound().build();
	}
	
	@Autowired
	private ContratoRepository contratoR;
	
	@GetMapping("/pdf/{id}")
	public ResponseEntity<ContratoDto> getContratoPdf(@PathVariable Long id){
		contratoService.getContratoPdf(id);
		return ResponseEntity.ok().build();
	}
	
}
