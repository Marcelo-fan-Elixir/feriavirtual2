package br.com.solucionweb.feriavirtual2.form;

import java.util.List;

import br.com.solucionweb.feriavirtual2.enums.TipoUsuario;
import br.com.solucionweb.feriavirtual2.model.Contrato;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class UsuarioForm {
	
	private String rutUsuario;
	private String dvUsuario;
	private String nombreUsuario;
	private String direccionUsuario;
	private String telefonoUsuario;
	private String emailUsuario;
	private TipoUsuario tipoUsuario;
	private List<Contrato> contratos;
	
	
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
	
	public Usuario convert() {
		
		Usuario usuario = new Usuario();
		usuario.setNombreUsuario(this.nombreUsuario);
		usuario.setRutUsuario(this.rutUsuario);
		usuario.setDvUsuario(this.dvUsuario);
		usuario.setTelefonoUsuario(this.telefonoUsuario);
		usuario.setEmailUsuario(this.emailUsuario);
		usuario.setDireccionUsuario(direccionUsuario);
		usuario.setTipoUsuario(this.tipoUsuario);
		usuario.setContratos(this.contratos);
		return usuario;
	}
	
	
}
