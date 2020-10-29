package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_MONEDA")
@NamedQuery(name = "TipoMoneda.findAll", query = "SELECT t FROM TipoMoneda t")
public class TipoMoneda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TIPO_MONEDA")
	private long idTipoMoneda;

	@Column(name = "NOMBRE_TIPO_MONEDA")
	private String nombreTipoMoneda;

	public TipoMoneda() {
	}

	public long getIdTipoMoneda() {
		return this.idTipoMoneda;
	}

	public void setIdTipoMoneda(long idTipoMoneda) {
		this.idTipoMoneda = idTipoMoneda;
	}

	public String getNombreTipoMoneda() {
		return this.nombreTipoMoneda;
	}

	public void setNombreTipoMoneda(String nombreTipoMoneda) {
		this.nombreTipoMoneda = nombreTipoMoneda;
	}

}
