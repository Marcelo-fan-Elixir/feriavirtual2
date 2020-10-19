package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the PROVINCIA database table.
 * 
 */
@Entity
@Table(name = "PROVINCIA")
@NamedQuery(name="Provincia.findAll", query="SELECT p FROM Provincia p")
public class Provincia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PROVINCIA")
	private long idProvincia;

	@Column(name="NOMBRE_PROVINCIA")
	private String nombreProvincia;

	@ManyToOne
	@JoinColumn(name="ID_REGION")
	private Region region;

	public Provincia() {
	}

	public long getIdProvincia() {
		return this.idProvincia;
	}

	public void setIdProvincia(long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombreProvincia() {
		return this.nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}
