package br.com.solucionweb.feriavirtual2.form;

import java.util.Date;

import br.com.solucionweb.feriavirtual2.model.CabeceraCompra;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class CabeceraCompraForm {
	
	private String descripcionCabeceraCompra;
	private Date fechaCabeceraCompra;
	private Usuario usuario;
	
	public String getDescripcionCabeceraCompra() {
		return descripcionCabeceraCompra;
	}
	public void setDescripcionCabeceraCompra(String descripcionCabeceraCompra) {
		this.descripcionCabeceraCompra = descripcionCabeceraCompra;
	}
	public Date getFechaCabeceraCompra() {
		return fechaCabeceraCompra;
	}
	public void setFechaCabeceraCompra(Date fechaCabeceraCompra) {
		this.fechaCabeceraCompra = fechaCabeceraCompra;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public CabeceraCompra convert() {
		CabeceraCompra cabeceraCompra = new CabeceraCompra();
		cabeceraCompra.setDescripcionCabeceraCompra(this.descripcionCabeceraCompra);
		cabeceraCompra.setFechaCabeceraCompra(this.fechaCabeceraCompra);
		cabeceraCompra.setUsuario(this.usuario);
		return cabeceraCompra;
	}

}
