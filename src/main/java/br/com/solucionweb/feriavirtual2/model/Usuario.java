package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USUARIO")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_USUARIO")
	private Long idUsuario;

	@Column(name="DIRECCION_USUARIO")
	private String direccionUsuario;

	@Column(name="DV_USUARIO")
	private String dvUsuario;

	@Column(name="EMAIL_USUARIO")
	private String emailUsuario;

	@Column(name="NOMBRE_USUARIO")
	private String nombreUsuario;

	@Column(name="RUT_USUARIO")
	private String rutUsuario;

	@Column(name="TELEFONO_USUARIO")
	private String telefonoUsuario;

	@OneToMany(mappedBy="usuario")
	private List<Contrato> contratos;

	@ManyToOne
	@JoinColumn(name="ID_COMUNA")
	private Comuna comuna;

	@ManyToOne
	@JoinColumn(name="ID_TIPOUSUARIO")
	private TipoUsuario tipoUsuario;

	public Usuario() {
	}

	public Long getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDireccionUsuario() {
		return this.direccionUsuario;
	}

	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}

	public String getDvUsuario() {
		return this.dvUsuario;
	}

	public void setDvUsuario(String dvUsuario) {
		this.dvUsuario = dvUsuario;
	}

	public String getEmailUsuario() {
		return this.emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getRutUsuario() {
		return this.rutUsuario;
	}

	public void setRutUsuario(String rutUsuario) {
		this.rutUsuario = rutUsuario;
	}

	public String getTelefonoUsuario() {
		return this.telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public List<Contrato> getContratos() {
		return this.contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Comuna getComuna() {
		return this.comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
