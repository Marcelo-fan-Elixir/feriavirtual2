package br.com.solucionweb.feriavirtual2.form;

import br.com.solucionweb.feriavirtual2.model.Usuario;

public class UsuarioForm {
	
	private String rutUsuario;
	private String dvUsuario;
	private String nombreUsuario;
	private String direccionUsuario;
	private String telefonoUsuario;
	private String emailUsuario;
	
	
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
	
	public Usuario convert() {
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(this.nombreUsuario);
		usuario.setRutUsuario(this.rutUsuario);
		usuario.setDvUsuario(this.dvUsuario);
		usuario.setTelefonoUsuario(this.telefonoUsuario);
		usuario.setEmailUsuario(this.emailUsuario);
		usuario.setDireccionUsuario(direccionUsuario);
		
		return usuario;
	}

}
