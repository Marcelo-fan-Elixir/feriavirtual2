package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="TIPO_USUARIO")
@NamedQuery(name="TipoUsuario.findAll", query="SELECT t FROM TipoUsuario t")
public class TipoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_TIPOUSUARIO")
	private Long idTipousuario;

	@Column(name="DESCRIPCION_TIPO_USUARIO")
	private String descripcionTipoUsuario;

	@Column(name="NOMBRE_TIPO_USUARIO")
	private String nombreTipoUsuario;

	public TipoUsuario() {
	}

	public long getIdTipousuario() {
		return this.idTipousuario;
	}

	public void setIdTipousuario(long idTipousuario) {
		this.idTipousuario = idTipousuario;
	}

	public String getDescripcionTipoUsuario() {
		return this.descripcionTipoUsuario;
	}

	public void setDescripcionTipoUsuario(String descripcionTipoUsuario) {
		this.descripcionTipoUsuario = descripcionTipoUsuario;
	}

	public String getNombreTipoUsuario() {
		return this.nombreTipoUsuario;
	}

	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}


}
