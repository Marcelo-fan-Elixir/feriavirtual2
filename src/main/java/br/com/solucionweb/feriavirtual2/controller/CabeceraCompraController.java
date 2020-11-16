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

import br.com.solucionweb.feriavirtual2.dto.CabeceraCompraDto;
import br.com.solucionweb.feriavirtual2.form.CabeceraCompraForm;
import br.com.solucionweb.feriavirtual2.model.CabeceraCompra;
import br.com.solucionweb.feriavirtual2.service.CabeceraCompraService;

@RestController
@RequestMapping("v1/cabeceraCompra")
public class CabeceraCompraController {
	
	@Autowired
	private CabeceraCompraService cabeceraCompraService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping()
	public ResponseEntity<CabeceraCompraDto> saveCabeceraCompra(@RequestBody CabeceraCompraForm cabeceraCompraForm, UriComponentsBuilder uriBuilder) {
		CabeceraCompra cabeceraCompra = cabeceraCompraService.saveCabeceraCompra(cabeceraCompraForm);
		URI uri = uriBuilder.path("/v1/cabeceraCompra/{id}")
				.buildAndExpand(cabeceraCompra.getIdCabeceraCompra())
				.toUri();
		return ResponseEntity.created(uri).body(new CabeceraCompraDto(cabeceraCompra));//201
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CabeceraCompraDto> getCabeceraCompra(@PathVariable Long id) {
		Optional<CabeceraCompra> cabeceraCompra = cabeceraCompraService.getCabeceraCompra(id);
		if (cabeceraCompra.isPresent()) {
			return ResponseEntity.ok().body(new CabeceraCompraDto(cabeceraCompra.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public ResponseEntity<List<CabeceraCompraDto>> listCabeceraCompra(){
		return ResponseEntity.ok(new CabeceraCompraDto().convertToList(cabeceraCompraService.listCabeceraCompra()));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCabeceraCompra(@PathVariable Long id){
		Optional<CabeceraCompra> cabeceraCompra = cabeceraCompraService.deleteCabeceraCompra(id);
		if (cabeceraCompra.isPresent()) {
			return ResponseEntity.noContent().build();//204 
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCabeceraCompra(@PathVariable Long id,@RequestBody CabeceraCompraForm cabeceraCompraForm){
		Optional<CabeceraCompra> cabeceraCompra = cabeceraCompraService.updateCabeceraCompra(id, cabeceraCompraForm);
		if(cabeceraCompra.isPresent()) {
			return ResponseEntity.ok().body(new CabeceraCompraDto(cabeceraCompra.get()));	
		}
		return ResponseEntity.notFound().build();
	}
}
