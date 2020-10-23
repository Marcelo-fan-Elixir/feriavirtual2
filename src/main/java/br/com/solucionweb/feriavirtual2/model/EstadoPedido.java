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


/**
 * The persistent class for the ESTADO_PEDIDO database table.
 * 
 */
@Entity
@Table(name="ESTADO_PEDIDO")
@NamedQuery(name="EstadoPedido.findAll", query="SELECT e FROM EstadoPedido e")
public class EstadoPedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ESTADO_PEDIDO")
	private long idEstadoPedido;

	@Column(name="DETALLE_ESTADO_PEDIDO")
	private String detalleEstadoPedido;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_TERMINO")
	private Date fechaTermino;


	public EstadoPedido() {
	}

	public long getIdEstadoPedido() {
		return this.idEstadoPedido;
	}

	public void setIdEstadoPedido(long idEstadoPedido) {
		this.idEstadoPedido = idEstadoPedido;
	}

	public String getDetalleEstadoPedido() {
		return this.detalleEstadoPedido;
	}

	public void setDetalleEstadoPedido(String detalleEstadoPedido) {
		this.detalleEstadoPedido = detalleEstadoPedido;
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
