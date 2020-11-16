package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.PedidoForm;
import br.com.solucionweb.feriavirtual2.model.Pedido;

public interface PedidoService {
	
	public Pedido savePedido(PedidoForm pedidoForm);
	
	public Optional<Pedido> getPedido(Long id);

	public Optional<Pedido> deletePedido(Long id);
	
	public Optional<Pedido> updatePedido(Long id, PedidoForm pedidoForm);
	
	public List<Pedido> listPedido();
	
}
