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



@Entity
@Table(name = "REGION")
@NamedQuery(name="Region.findAll", query="SELECT r FROM Region r")
public class Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_REGION")
	private long idRegion;

	@Column(name="NOMBRE_REGION")
	private String nombreRegion;

	@ManyToOne
	@JoinColumn(name="ID_PAIS")
	private Pais pais;

	public Region() {
	}

	public long getIdRegion() {
		return this.idRegion;
	}

	public void setIdRegion(long idRegion) {
		this.idRegion = idRegion;
	}

	public String getNombreRegion() {
		return this.nombreRegion;
	}

	public void setNombreRegion(String nombreRegion) {
		this.nombreRegion = nombreRegion;
	}

	public Pais getPai() {
		return this.pais;
	}

	public void setPai(Pais pais) {
		this.pais = pais;
	}

}
