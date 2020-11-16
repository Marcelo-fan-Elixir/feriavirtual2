package br.com.solucionweb.feriavirtual2.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.EstadoPedido;
import br.com.solucionweb.feriavirtual2.model.Pedido;

public class PedidoDto {

	private String detallePedido;
	private Date fechaPedido;
	private EstadoPedido estadoPedido;
	
	public PedidoDto(Pedido pedido) {
		detallePedido = pedido.getDetallePedido();
		fechaPedido = pedido.getFechaPedido();
		estadoPedido = pedido.getEstadoPedido();
	}

	public PedidoDto() {
	}

	public String getDetallePedido() {
		return detallePedido;
	}

	public void setDetallePedido(String detallePedido) {
		this.detallePedido = detallePedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}

	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	
	public List<PedidoDto> convertToList(List<Pedido> listPedido) {
		return listPedido.stream().map(PedidoDto::new).collect(Collectors.toList());
	}

}
