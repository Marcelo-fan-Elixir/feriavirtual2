package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the TIPO_CONTRATO database table.
 * 
 */
@Entity
@Table(name="TIPO_CONTRATO")
@NamedQuery(name="TipoContrato.findAll", query="SELECT t FROM TipoContrato t")
public class TipoContrato implements Serializable {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_TIPO_CONTRATO")
	private Long idTipoContrato;

	@Column(name="DESCRIPCION_TIPO_CONTRATO")
	private String descripcionTipoContrato;

	@Column(name="NOMBRE_TIPO_CONTRATO")
	private String nombreTipoContrato;

	public TipoContrato() {
	}

	public Long getIdTipoContrato() {
		return this.idTipoContrato;
	}

	public void setIdTipoContrato(Long idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}

	public String getDescripcionTipoContrato() {
		return this.descripcionTipoContrato;
	}

	public void setDescripcionTipoContrato(String descripcionTipoContrato) {
		this.descripcionTipoContrato = descripcionTipoContrato;
	}

	public String getNombreTipoContrato() {
		return this.nombreTipoContrato;
	}

	public void setNombreTipoContrato(String nombreTipoContrato) {
		this.nombreTipoContrato = nombreTipoContrato;
	}
}
