package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="ESTADO_SUBASTA")
@NamedQuery(name="EstadoSubasta.findAll", query="SELECT e FROM EstadoSubasta e")
public class EstadoSubasta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ESTADO_SUBASTA")
	private long idEstadoSubasta;

	@Column(name="DETALLE_ESTADO_SUBASTA")
	private String detalleEstadoSubasta;

	public EstadoSubasta() {
	}

	public long getIdEstadoSubasta() {
		return this.idEstadoSubasta;
	}

	public void setIdEstadoSubasta(long idEstadoSubasta) {
		this.idEstadoSubasta = idEstadoSubasta;
	}

	public String getDetalleEstadoSubasta() {
		return this.detalleEstadoSubasta;
	}

	public void setDetalleEstadoSubasta(String detalleEstadoSubasta) {
		this.detalleEstadoSubasta = detalleEstadoSubasta;
	}
}
