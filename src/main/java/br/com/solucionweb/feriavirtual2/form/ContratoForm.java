package br.com.solucionweb.feriavirtual2.form;

import java.util.Date;

import br.com.solucionweb.feriavirtual2.model.Contrato;
import br.com.solucionweb.feriavirtual2.model.TipoContrato;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class ContratoForm {
	
	private String descripcionContrato;
	private byte[] pdfContrato;
	private Date fechaInicio;
	private Date fechaInicio2;
	private Date fechaModificacion;
	private Date fechaTermino;
	private Date fechaTermino2;
	private Usuario usuario;
	private TipoContrato tipoContrato;
	
	public Contrato convert() {
		Contrato contrato = new Contrato();
		contrato.setDescripcionContrato(this.descripcionContrato);
		contrato.setPdfContrato(this.pdfContrato);
		contrato.setFechaInicio(this.fechaInicio);
		contrato.setFechaInicio2(this.fechaInicio2);
		contrato.setFechaModificacion(this.fechaModificacion);
		contrato.setFechaTermino(this.fechaTermino);
		contrato.setFechaTermino2(this.fechaTermino2);
		contrato.setUsuario(this.usuario);
		contrato.setTipoContrato(this.tipoContrato);
		return contrato;
	}
	
	public String getDescripcionContrato() {
		return descripcionContrato;
	}
	public void setDescripcionContrato(String descripcionContrato) {
		this.descripcionContrato = descripcionContrato;
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
	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
