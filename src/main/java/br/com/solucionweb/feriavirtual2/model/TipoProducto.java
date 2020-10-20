package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPO_PRODUCTO database table.
 * 
 */
@Entity
@Table(name="TIPO_PRODUCTO")
@NamedQuery(name="TipoProducto.findAll", query="SELECT t FROM TipoProducto t")
public class TipoProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIPO_PRODUCTO")
	private Long idTipoProducto;

	@Column(name="NOMBRE_TIPO_PRODUCTO")
	private String nombreTipoProducto;

	public TipoProducto() {
	}

	public Long getIdTipoProducto() {
		return this.idTipoProducto;
	}

	public void setIdTipoProducto(Long idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getNombreTipoProducto() {
		return this.nombreTipoProducto;
	}

	public void setNombreTipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}
}
