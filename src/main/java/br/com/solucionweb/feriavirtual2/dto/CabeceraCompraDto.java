package br.com.solucionweb.feriavirtual2.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.CabeceraCompra;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class CabeceraCompraDto {

	private String descripcionCabeceraCompra;
	private Date fechaCabeceraCompra;
	private Usuario usuario;

	public CabeceraCompraDto(CabeceraCompra cabeceraCompra) {
		descripcionCabeceraCompra = cabeceraCompra.getDescripcionCabeceraCompra();
		fechaCabeceraCompra = cabeceraCompra.getFechaCabeceraCompra();
		usuario = cabeceraCompra.getUsuario();
	}

	public CabeceraCompraDto() {
		
	}

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

	public List<CabeceraCompraDto> convertToList(List<CabeceraCompra> listCabeceraCompra) {
		return listCabeceraCompra.stream().map(CabeceraCompraDto::new).collect(Collectors.toList());
	}

}
