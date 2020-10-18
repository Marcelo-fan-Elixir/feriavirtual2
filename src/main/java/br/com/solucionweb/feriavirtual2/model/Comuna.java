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
 * The persistent class for the COMUNA database table.
 * 
 */
@Entity
@Table(name = "COMUNA")
@NamedQuery(name="Comuna.findAll", query="SELECT c FROM Comuna c")
public class Comuna implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_COMUNA")
	private Long idComuna;

	@Column(name="NOMBRE_COMUNA")
	private String nombreComuna;

	@ManyToOne
	@JoinColumn(name="ID_PROVINCIA")
	private Provincia provincia;

	public Comuna() {
	}
	
	public void setIdComuna(Long idComuna) {
		this.idComuna = idComuna;
	}

	public long getIdComuna() {
		return this.idComuna;
	}

	public void setIdComuna(long idComuna) {
		this.idComuna = idComuna;
	}

	public String getNombreComuna() {
		return this.nombreComuna;
	}

	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

}
