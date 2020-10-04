package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TipoContrato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_CONTRATO")
	private Long idTipoContrato;
	@Column(name = "NOMBRE_TIPO_CONTRATO")
	private String nombreTipoContato;
	@Column(name = "DESCRIPCION_TIPO_CONTRATO")
	private String descripcionTipoContrato;
	
	public Long getIdTipoContrato() {
		return idTipoContrato;
	}
	public void setIdTipoContrato(Long idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}
	public String getNombreTipoContato() {
		return nombreTipoContato;
	}
	public void setNombreTipoContato(String nombreTipoContato) {
		this.nombreTipoContato = nombreTipoContato;
	}
	public String getDescripcionTipoContrato() {
		return descripcionTipoContrato;
	}
	public void setDescripcionTipoContrato(String descripcionTipoContrato) {
		this.descripcionTipoContrato = descripcionTipoContrato;
	}
	
	

}
