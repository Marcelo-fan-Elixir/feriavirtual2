package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="TIPO_TRANSPORTE")
@NamedQuery(name="TipoTransporte.findAll", query="SELECT t FROM TipoTransporte t")
public class TipoTransporte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIPO_TRANSPORTE")
	private long idTipoTransporte;

	@Column(name="NOMBRE_TIPO_TRANSPORTE")
	private String nombreTipoTransporte;

	@OneToMany(mappedBy="tipoTransporte")
	private List<Transporte> transportes;

	public TipoTransporte() {
	}

	public long getIdTipoTransporte() {
		return this.idTipoTransporte;
	}

	public void setIdTipoTransporte(long idTipoTransporte) {
		this.idTipoTransporte = idTipoTransporte;
	}

	public String getNombreTipoTransporte() {
		return this.nombreTipoTransporte;
	}

	public void setNombreTipoTransporte(String nombreTipoTransporte) {
		this.nombreTipoTransporte = nombreTipoTransporte;
	}

	public List<Transporte> getTransportes() {
		return this.transportes;
	}

	public void setTransportes(List<Transporte> transportes) {
		this.transportes = transportes;
	}

}
