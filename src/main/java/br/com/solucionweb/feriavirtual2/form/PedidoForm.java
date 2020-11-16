package br.com.solucionweb.feriavirtual2.form;

import java.util.Date;

import br.com.solucionweb.feriavirtual2.model.EstadoPedido;
import br.com.solucionweb.feriavirtual2.model.Pedido;

public class PedidoForm {

	private String detallePedido;
	private Date fechaPedido;
	private EstadoPedido estadoPedido;

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

	public Pedido convert() {
		Pedido pedido = new Pedido();
		pedido.setDetallePedido(this.detallePedido);
		pedido.setFechaPedido(this.fechaPedido);
		pedido.setEstadoPedido(this.estadoPedido);
		return pedido;
	}
	
}
