package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the TRANSPORTE database table.
 * 
 */
@Entity
@Table(name = "TRANSPORTE")
@NamedQuery(name="Transporte.findAll", query="SELECT t FROM Transporte t")
public class Transporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TRANSPORTE")
	private Long idTransporte;

	@Column(name="DETALLE_TRANSPORTE")
	private String detalleTransporte;

	@Column(name="NUMERO_TRANSPORTE")
	private String numeroTransporte;

	@JsonIgnore
	@OneToMany(mappedBy="transporte")
	private List<Subasta> subastas;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ID_ESTADO_TRANSPORTE")
	private EstadoTransporte estadoTransporte;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ID_TIPO_TRANSPORTE")
	private TipoTransporte tipoTransporte;

	public Transporte() {
	}
	
	

	public Long getIdTransporte() {
		return idTransporte;
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

	public String getNumeroTransporte() {
		return this.numeroTransporte;
	}

	public void setNumeroTransporte(String numeroTransporte) {
		this.numeroTransporte = numeroTransporte;
	}

	public List<Subasta> getSubastas() {
		return this.subastas;
	}

	public void setSubastas(List<Subasta> subastas) {
		this.subastas = subastas;
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
