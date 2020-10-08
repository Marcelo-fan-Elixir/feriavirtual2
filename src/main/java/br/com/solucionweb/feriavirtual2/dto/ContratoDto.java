package br.com.solucionweb.feriavirtual2.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.Contrato;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class ContratoDto {
	
	private String descripcionContrato;
	private String pdfContrato;
	private Date fechaInicio;
	private Date fechaFin;
	private Usuario usuario;

	public ContratoDto(Contrato contrato) {
		descripcionContrato = contrato.getDescripcionContrato();
		pdfContrato = contrato.getPdfContrato();
		fechaInicio = contrato.getFechaInicio();
		fechaFin = contrato.getFechaFin();
		usuario = contrato.getUsuario();
	}
	
	public ContratoDto() {
		
	}
	
	public String getDescripcionContrato() {
		return descripcionContrato;
	}
	public void setDescripcionContrato(String descripcionContrato) {
		this.descripcionContrato = descripcionContrato;
	}
	public String getPdfContrato() {
		return pdfContrato;
	}
	public void setPdfContrato(String pdfContrato) {
		this.pdfContrato = pdfContrato;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public List<ContratoDto> convertToList(List<Contrato> listContrato) {
		return listContrato.stream().map(ContratoDto::new).collect(Collectors.toList());
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
