package br.com.solucionweb.feriavirtual2.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.solucionweb.feriavirtual2.dto.ProductoDto;
import br.com.solucionweb.feriavirtual2.form.ProductoForm;
import br.com.solucionweb.feriavirtual2.model.Producto;
import br.com.solucionweb.feriavirtual2.service.ProductoService;

@RestController
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@PostMapping()
	public ResponseEntity<ProductoDto> saveProducto(@RequestBody ProductoForm productoForm, UriComponentsBuilder uriBuilder) {
		Producto producto = productoService.saveProducto(productoForm);
		URI uri = uriBuilder.path("/v1/producto/{id}")
				.buildAndExpand(producto.getIdProducto())
				.toUri();
		return ResponseEntity.created(uri).body(new ProductoDto(producto));//201
	}
}
