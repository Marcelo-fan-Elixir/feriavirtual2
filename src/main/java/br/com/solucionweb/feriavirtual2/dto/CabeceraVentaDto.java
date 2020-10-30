package br.com.solucionweb.feriavirtual2.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.Pedido;
import br.com.solucionweb.feriavirtual2.model.CabeceraVenta;
import br.com.solucionweb.feriavirtual2.model.TipoVenta;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class CabeceraVentaDto {
	
	private String descripcionCabeceraVenta;
	private Date fechaVenta;
	private Pedido pedido;
	private TipoVenta tipoVenta;
	private Usuario usuario;
	
	public CabeceraVentaDto(CabeceraVenta cabeceraVenta) {
		descripcionCabeceraVenta = cabeceraVenta.getDescripcionCabeceraVenta();
		fechaVenta = cabeceraVenta.getFechaVenta();
		pedido = cabeceraVenta.getPedido();
		usuario = cabeceraVenta.getUsuario();
		
	}

	public CabeceraVentaDto() {
		
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
	
	public List<CabeceraVentaDto> convertToList(List<CabeceraVenta> listCabeceraVenta) {
		return listCabeceraVenta.stream().map(CabeceraVentaDto::new).collect(Collectors.toList());
	}

}
