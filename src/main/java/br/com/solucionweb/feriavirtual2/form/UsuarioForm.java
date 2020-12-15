package br.com.solucionweb.feriavirtual2.form;

import br.com.solucionweb.feriavirtual2.model.Comuna;
import br.com.solucionweb.feriavirtual2.model.TipoUsuario;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class UsuarioForm {
	
//	private Long idUsuario;
	private String rutUsuario;
	private String dvUsuario;
	private String nombreUsuario;
	private String direccionUsuario;
	private String telefonoUsuario;
	private String emailUsuario;
	private String passwordUsuario;
	private Comuna comuna;
	private TipoUsuario tipoUsuario;
	
	
//	public Long getIdUsuario() {
//		return idUsuario;
//	}
//	public void setIdUsuario(Long idUsuario) {
//		this.idUsuario = idUsuario;
//	}
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
	
	public Comuna getComuna() {
		return comuna;
	}
	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public String getPasswordUsuario() {
		return passwordUsuario;
	}
	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
	
	public Usuario convert() {
		
		Usuario usuario = new Usuario();
//		usuario.setIdUsuario(this.idUsuario);
		usuario.setNombreUsuario(this.nombreUsuario);
		usuario.setRutUsuario(this.rutUsuario);
		usuario.setDvUsuario(this.dvUsuario);
		usuario.setTelefonoUsuario(this.telefonoUsuario);
		usuario.setEmailUsuario(this.emailUsuario);
		usuario.setDireccionUsuario(direccionUsuario);
		usuario.setPasswordUsuario(this.passwordUsuario);
		usuario.setComuna(this.comuna);
		usuario.setTipoUsuario(this.tipoUsuario);
		return usuario;
	}
	
	
}
