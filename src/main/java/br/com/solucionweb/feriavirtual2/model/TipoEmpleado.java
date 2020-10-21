package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="TIPO_EMPLEADO")
@NamedQuery(name="TipoEmpleado.findAll", query="SELECT t FROM TipoEmpleado t")
public class TipoEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIPO_EMPLEADO")
	private Long idTipoEmpleado;

	@Column(name="NOMBRE_TIPO_EMPLEADO")
	private String nombreTipoEmpleado;

	public TipoEmpleado() {
	}

	public Long getIdTipoEmpleado() {
		return this.idTipoEmpleado;
	}

	public void setIdTipoEmpleado(Long idTipoEmpleado) {
		this.idTipoEmpleado = idTipoEmpleado;
	}

	public String getNombreTipoEmpleado() {
		return this.nombreTipoEmpleado;
	}

	public void setNombreTipoEmpleado(String nombreTipoEmpleado) {
		this.nombreTipoEmpleado = nombreTipoEmpleado;
	}
}
