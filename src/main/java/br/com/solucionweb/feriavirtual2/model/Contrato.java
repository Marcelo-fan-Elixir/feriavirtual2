package br.com.solucionweb.feriavirtual2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Contrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONTRATO")
	private Long idContrato;
	@Column(name = "DESCRIPCION_CONTRATO")
	private String descripcionContrato;
	@Column(name = "PDF_CONTRATO")
	private String pdfContrato;
	@Column(name = "FECHA_INICIO")
	private Date fechaInicio;
	@Column(name = "FECHA_FIN")
	private Date fechaFin;
	
	
	public Long getIdContrato() {
		return idContrato;
	}
	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
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

	
}
