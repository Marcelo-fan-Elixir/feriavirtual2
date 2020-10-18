package br.com.solucionweb.feriavirtual2.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.Contrato;
import br.com.solucionweb.feriavirtual2.model.TipoContrato;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class ContratoDto {
	
	private String descripcionContrato;
	private byte[] pdfContrato;
	private Date fechaInicio;
	private Date fechaInicio2;
	private Date fechaModificacion;
	private Date fechaTermino;
	private Date fechaTermino2;
	private Usuario usuario;
	private TipoContrato tipoContrato;
	
	public ContratoDto(Contrato contrato) {
		descripcionContrato = contrato.getDescripcionContrato();
		pdfContrato = contrato.getPdfContrato();
		fechaInicio = contrato.getFechaInicio();
		fechaTermino = contrato.getFechaTermino();
		fechaInicio2 = contrato.getFechaInicio2();
		fechaTermino2 = contrato.getFechaTermino2();
		tipoContrato = contrato.getTipoContrato();
		usuario = contrato.getUsuario();
	}
	
	public ContratoDto() {
		
	}
	
	public byte[] getPdfContrato() {
		return pdfContrato;
	}

	public void setPdfContrato(byte[] pdfContrato) {
		this.pdfContrato = pdfContrato;
	}

	public Date getFechaInicio2() {
		return fechaInicio2;
	}

	public void setFechaInicio2(Date fechaInicio2) {
		this.fechaInicio2 = fechaInicio2;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaTermino() {
		return fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Date getFechaTermino2() {
		return fechaTermino2;
	}

	public void setFechaTermino2(Date fechaTermino2) {
		this.fechaTermino2 = fechaTermino2;
	}

	public String getDescripcionContrato() {
		return descripcionContrato;
	}
	public void setDescripcionContrato(String descripcionContrato) {
		this.descripcionContrato = descripcionContrato;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
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
	
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

}
