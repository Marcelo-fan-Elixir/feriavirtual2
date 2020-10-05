package br.com.solucionweb.feriavirtual2.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.solucionweb.feriavirtual2.enums.TipoUsuario;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long idUsuario;
	
	@Column(name = "RUT_USUARIO")
	private String rutUsuario;
	
	@Column(name = "DV_USUARIO")
	private String dvUsuario;
	
	@Column(name = "NOMBRE_USUARIO")
	private String nombreUsuario;
	
	@Column(name = "DIRECCION_USUARIO")
	private String direccionUsuario;
	
	@Column(name = "TELEFONO_USUARIO")
	private String telefonoUsuario;
	
	@Column(name = "EMAIL_USUARIO")
	private String emailUsuario;
	
	@Column(name = "TIPO_USUARIO")
	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUsuario;
	
	@Column(name = "CONTRATOS")
	@OneToMany(mappedBy = "usuario",  cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Contrato> contratos;

	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getRutUsuario() {
		return rutUsuario;
	}
	public void setRutUsuario(String rutUsuario) {
		this.rutUsuario = rutUsuario;
	}
	public String getDvUsuario() {
		return dvUsuario;
	}
	public void setDvUsuario(String dvUsuario) {
		this.dvUsuario = dvUsuario;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getDireccionUsuario() {
		return direccionUsuario;
	}
	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}
	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}
	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public List<Contrato> getContratos() {
		return contratos;
	}
	
	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	
}
