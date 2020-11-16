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

import br.com.solucionweb.feriavirtual2.dto.PedidoDto;
import br.com.solucionweb.feriavirtual2.form.PedidoForm;
import br.com.solucionweb.feriavirtual2.model.Pedido;
import br.com.solucionweb.feriavirtual2.service.PedidoService;

@RestController
@RequestMapping("v1/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping()
	public ResponseEntity<PedidoDto> savePedido(@RequestBody PedidoForm pedidoForm, UriComponentsBuilder uriBuilder) {
		Pedido pedido = pedidoService.savePedido(pedidoForm);
		URI uri = uriBuilder.path("/v1/pedido/{id}")
				.buildAndExpand(pedido.getIdPedido())
				.toUri();
		return ResponseEntity.created(uri).body(new PedidoDto(pedido));//201
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PedidoDto> getPedido(@PathVariable Long id) {
		Optional<Pedido> pedido = pedidoService.getPedido(id);
		if (pedido.isPresent()) {
			return ResponseEntity.ok().body(new PedidoDto(pedido.get()));
		}
		return ResponseEntity.notFound().build();
	}
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping()
	public ResponseEntity<List<PedidoDto>> listPedido(){
		return ResponseEntity.ok(new PedidoDto().convertToList(pedidoService.listPedido()));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletePedido(@PathVariable Long id){
		Optional<Pedido> pedido = pedidoService.deletePedido(id);
		if (pedido.isPresent()) {
			return ResponseEntity.noContent().build();//204 
		}
		return ResponseEntity.notFound().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updatePedido(@PathVariable Long id,@RequestBody PedidoForm pedidoForm){
		Optional<Pedido> pedido = pedidoService.updatePedido(id, pedidoForm);
		if(pedido.isPresent()) {
			return ResponseEntity.ok().body(new PedidoDto(pedido.get()));	
		}
		return ResponseEntity.notFound().build();
	}
}
