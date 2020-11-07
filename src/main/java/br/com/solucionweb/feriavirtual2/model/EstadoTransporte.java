package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO_TRANSPORTE")
@NamedQuery(name="EstadoTransporte.findAll", query="SELECT e FROM EstadoTransporte e")
public class EstadoTransporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ESTADO_TRANSPORTE")
	private Long idEstadoTransporte;

	@Column(name="DESCRIPCION_ESTADO_TRANSPORTE")
	private String descripcionEstadoTransporte;

	public EstadoTransporte() {
	}

	public Long getIdEstadoTransporte() {
		return idEstadoTransporte;
	}

	public void setIdEstadoTransporte(Long idEstadoTransporte) {
		this.idEstadoTransporte = idEstadoTransporte;
	}

	public String getDescripcionEstadoTransporte() {
		return this.descripcionEstadoTransporte;
	}

	public void setDescripcionEstadoTransporte(String descripcionEstadoTransporte) {
		this.descripcionEstadoTransporte = descripcionEstadoTransporte;
	}
}