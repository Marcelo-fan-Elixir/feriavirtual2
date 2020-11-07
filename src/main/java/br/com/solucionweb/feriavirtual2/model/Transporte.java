package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="TRANSPORTE")
@NamedQuery(name="Transporte.findAll", query="SELECT t FROM Transporte t")
public class Transporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TRANSPORTE")
	private Long idTransporte;
	
	@Column(name="DETALLE_TRANSPORTE")
	private String detalleTransporte;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_TERMINO")
	private Date fechaTermino;

	@Column(name="NUMERO_TRANSPORTE")
	private String numeroTransporte;

	@ManyToOne
	@JoinColumn(name="ID_ESTADO_TRANSPORTE")
	private EstadoTransporte estadoTransporte;

	@ManyToOne
	@JoinColumn(name="ID_TIPO_TRANSPORTE")
	private TipoTransporte tipoTransporte;

	public Transporte() {
	}

	public Long getIdTransporte() {
		return this.idTransporte;
	}

	public void setIdTransporte(Long idTransporte) {
		this.idTransporte = idTransporte;
	}

	public String getDetalleTransporte() {
		return this.detalleTransporte;
	}

	public void setDetalleTransporte(String detalleTransporte) {
		this.detalleTransporte = detalleTransporte;
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

	public String getNumeroTransporte() {
		return this.numeroTransporte;
	}

	public void setNumeroTransporte(String numeroTransporte) {
		this.numeroTransporte = numeroTransporte;
	}

	public EstadoTransporte getEstadoTransporte() {
		return this.estadoTransporte;
	}

	public void setEstadoTransporte(EstadoTransporte estadoTransporte) {
		this.estadoTransporte = estadoTransporte;
	}

	public TipoTransporte getTipoTransporte() {
		return this.tipoTransporte;
	}

	public void setTipoTransporte(TipoTransporte tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}

}
