package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "SEXO")
@NamedQuery(name="Sexo.findAll", query="SELECT s FROM Sexo s")
public class Sexo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SEXO")
	private Long idSexo;

	@Column(name="NOMBRE_SEXO")
	private String nombreSexo;

	public Sexo() {
	}

	public Long getIdSexo() {
		return this.idSexo;
	}

	public void setIdSexo(Long idSexo) {
		this.idSexo = idSexo;
	}

	public String getNombreSexo() {
		return this.nombreSexo;
	}

	public void setNombreSexo(String nombreSexo) {
		this.nombreSexo = nombreSexo;
	}
}
