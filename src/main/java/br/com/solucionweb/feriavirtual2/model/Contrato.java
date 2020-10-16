package br.com.solucionweb.feriavirtual2.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CONTRATO")
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
	
	@Column(name = "FECHA_TERMINO")
	private Date fechaFin;
	
	@JsonIgnore 
	@ManyToOne(fetch = FetchType.EAGER)
	private Usuario usuario;
	
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

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
