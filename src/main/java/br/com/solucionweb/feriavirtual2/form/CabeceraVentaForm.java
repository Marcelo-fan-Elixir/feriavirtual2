package br.com.solucionweb.feriavirtual2.form;

import java.util.Date;
import java.util.List;

import br.com.solucionweb.feriavirtual2.model.CabeceraVenta;
import br.com.solucionweb.feriavirtual2.model.Pedido;
import br.com.solucionweb.feriavirtual2.model.TipoVenta;
import br.com.solucionweb.feriavirtual2.model.Usuario;
import br.com.solucionweb.feriavirtual2.model.VentaDetalle;

public class CabeceraVentaForm {

	private String descripcionCabeceraVenta;
	private Date fechaVenta;
	private Pedido pedido;
	private TipoVenta tipoVenta;
	private Usuario usuario;
	private List<VentaDetalle> ventaDetalles;
	
	public CabeceraVenta Convert() {
		CabeceraVenta cabeceraVenta = new CabeceraVenta();
		cabeceraVenta.setDescripcionCabeceraVenta(this.descripcionCabeceraVenta);
		cabeceraVenta.setFechaVenta(this.fechaVenta);
		cabeceraVenta.setPedido(this.pedido);
		cabeceraVenta.setTipoVenta(this.tipoVenta);
		cabeceraVenta.setUsuario(this.usuario);
		cabeceraVenta.setVentaDetalles(this.ventaDetalles);
		return cabeceraVenta;
	}
	
	public String getDescripcionCabeceraVenta() {
		return descripcionCabeceraVenta;
	}
	public void setDescripcionCabeceraVenta(String descripcionCabeceraVenta) {
		this.descripcionCabeceraVenta = descripcionCabeceraVenta;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public TipoVenta getTipoVenta() {
		return tipoVenta;
	}
	public void setTipoVenta(TipoVenta tipoVenta) {
		this.tipoVenta = tipoVenta;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<VentaDetalle> getVentaDetalles() {
		return ventaDetalles;
	}

	public void setVentaDetalles(List<VentaDetalle> ventaDetalles) {
		this.ventaDetalles = ventaDetalles;
	}
	
	

}
