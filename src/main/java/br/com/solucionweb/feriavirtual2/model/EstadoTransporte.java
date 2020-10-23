package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_ESTIMADA")
	private Date fechaEstimada;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_TERMINO")
	private Date fechaTermino;

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

	public Date getFechaEstimada() {
		return this.fechaEstimada;
	}

	public void setFechaEstimada(Date fechaEstimada) {
		this.fechaEstimada = fechaEstimada;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaTermino() {
		return this.fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
}