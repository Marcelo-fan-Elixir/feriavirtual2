package br.com.solucionweb.feriavirtual2.form;

import java.util.Date;

import br.com.solucionweb.feriavirtual2.model.Contrato;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class ContratoForm {
	
	private String descripcionContrato;
	private String pdfContrato;
	private Date fechaInicio;
	private Date fechaFin;
	private Usuario usuario;
	
	
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
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Contrato convert() {
		Contrato contrato = new Contrato();
		contrato.setDescripcionContrato(this.descripcionContrato);
		contrato.setPdfContrato(this.pdfContrato);
		contrato.setFechaInicio(this.fechaInicio);
		contrato.setFechaFin(this.fechaFin);
		contrato.setUsuario(this.usuario);
		return contrato;
	}
}
