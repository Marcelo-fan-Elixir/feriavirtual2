package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PAIS database table.
 * 
 */
@Entity
@Table(name="PAIS")
@NamedQuery(name="Pais.findAll", query="SELECT p FROM Pais p")
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_PAIS")
	private long idPais;

	@Column(name="NOMBRE_PAIS")
	private String nombrePais;


	public Pais() {
	}

	public long getIdPais() {
		return this.idPais;
	}

	public void setIdPais(long idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return this.nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
}
