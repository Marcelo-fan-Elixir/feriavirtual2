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

import br.com.solucionweb.feriavirtual2.dto.ProductoDto;
import br.com.solucionweb.feriavirtual2.form.ProductoForm;
import br.com.solucionweb.feriavirtual2.model.Producto;
import br.com.solucionweb.feriavirtual2.service.ProductoService;

@RestController
@RequestMapping("/v1/producto")
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
	
	
	@GetMapping()
	public ResponseEntity<List<ProductoDto>> listProducto(){
		return ResponseEntity.ok(new ProductoDto().convertToList(productoService.listProducto()));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductoDto> getProducto(@PathVariable Long id){
		Optional<Producto> producto = productoService.getProducto(id);
		if(producto.isPresent()) {
			return ResponseEntity.ok().body(new ProductoDto(producto.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProducto(@PathVariable Long id){
		Optional<Producto> producto = productoService.deleteProducto(id);
		if (producto.isPresent()) {
			return ResponseEntity.noContent().build();//204 
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProducto(@PathVariable Long id,@RequestBody ProductoForm productoForm){
		Optional<Producto> producto = productoService.updateProducto(id, productoForm);
		if(producto.isPresent()) {
			return ResponseEntity.ok().body(new ProductoDto(producto.get()));	
		}
		return ResponseEntity.notFound().build();
	}
	
}
