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
import org.springframework.web.util.UriComponentsBuilder;

import br.com.solucionweb.feriavirtual2.dto.SubastaDto;
import br.com.solucionweb.feriavirtual2.form.SubastaForm;
import br.com.solucionweb.feriavirtual2.model.Subasta;
import br.com.solucionweb.feriavirtual2.service.SubastaService;

public class SubastaController {
	
	@Autowired
	private SubastaService subastaService;
	
	@PostMapping()
	public ResponseEntity<SubastaDto> saveSubasta(@RequestBody SubastaForm subastaForm, UriComponentsBuilder uriBuilder) {
		Subasta subasta = subastaService.saveSubasta(subastaForm);
		URI uri = uriBuilder.path("/v1/subasta/{id}")
				.buildAndExpand(subasta.getIdSubasta())
				.toUri();
		return ResponseEntity.created(uri).body(new SubastaDto(subasta));//201
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<SubastaDto> getSubasta(@PathVariable Long id) {
		Optional<Subasta> subasta = subastaService.getSubasta(id);
		if (subasta.isPresent()) {
			return ResponseEntity.ok().body(new SubastaDto(subasta.get()));
		}
		return ResponseEntity.notFound().build();
	}
	

	@GetMapping()
	public ResponseEntity<List<SubastaDto>> listSubasta(){
		return ResponseEntity.ok(new SubastaDto().convertToList(subastaService.listSubasta()));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteSubasta(@PathVariable Long id){
		Optional<Subasta> subasta = subastaService.deleteSubasta(id);
		if (subasta.isPresent()) {
			return ResponseEntity.noContent().build();//204 
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateSubasta(@PathVariable Long id,@RequestBody SubastaForm subastaForm){
		Optional<Subasta> subasta = subastaService.updateSubasta(id, subastaForm);
		if(subasta.isPresent()) {
			return ResponseEntity.ok().body(new SubastaDto(subasta.get()));	
		}
		return ResponseEntity.notFound().build();
	}
	
}
