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

import br.com.solucionweb.feriavirtual2.dto.CabeceraVentaDto;
import br.com.solucionweb.feriavirtual2.form.CabeceraVentaForm;
import br.com.solucionweb.feriavirtual2.model.CabeceraVenta;
import br.com.solucionweb.feriavirtual2.service.CabeceraVentaService;

@RestController
@RequestMapping("/v1/cabeceraVenta")
public class CabeceraVentaController {

	@Autowired
	private CabeceraVentaService cabeceraVentaService;
	
	@PostMapping()
	public ResponseEntity<CabeceraVentaDto> saveCabeceraVenta(@RequestBody CabeceraVentaForm cabeceraVentaForm, UriComponentsBuilder uriBuilder) {
		CabeceraVenta cabeceraVenta = cabeceraVentaService.saveCabeceraVenta(cabeceraVentaForm);
		URI uri = uriBuilder.path("/v1/cabeceraVenta/{id}")
				.buildAndExpand(cabeceraVenta.getIdCabeceraVenta())
				.toUri();
		return ResponseEntity.created(uri).body(new CabeceraVentaDto(cabeceraVenta));//201
	}
	
	@GetMapping()
	public ResponseEntity<List<CabeceraVentaDto>> listCabeceraVenta(){
		return ResponseEntity.ok(new CabeceraVentaDto().convertToList(cabeceraVentaService.listCabeceraVenta()));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CabeceraVentaDto> getCabeceraVenta(@PathVariable Long id){
		Optional<CabeceraVenta> cabeceraVenta = cabeceraVentaService.getCabeceraVenta(id);
		if(cabeceraVenta.isPresent()) {
			return ResponseEntity.ok().body(new CabeceraVentaDto(cabeceraVenta.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteCabeceraVenta(@PathVariable Long id){
		Optional<CabeceraVenta> cabeceraVenta = cabeceraVentaService.deleteCabeceraVenta(id);
		if (cabeceraVenta.isPresent()) {
			return ResponseEntity.noContent().build();//204 
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCabeceraVenta(@PathVariable Long id,@RequestBody CabeceraVentaForm cabeceraVentaForm){
		Optional<CabeceraVenta> cabeceraVenta = cabeceraVentaService.updateCabeceraVenta(id, cabeceraVentaForm);
		if(cabeceraVenta.isPresent()) {
			return ResponseEntity.ok().body(new CabeceraVentaDto(cabeceraVenta.get()));	
		}
		return ResponseEntity.notFound().build();
	}
	
}
