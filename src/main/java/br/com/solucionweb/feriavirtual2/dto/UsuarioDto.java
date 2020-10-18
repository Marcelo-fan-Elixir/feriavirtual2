package br.com.solucionweb.feriavirtual2.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.Comuna;
import br.com.solucionweb.feriavirtual2.model.Contrato;
import br.com.solucionweb.feriavirtual2.model.TipoUsuario;
import br.com.solucionweb.feriavirtual2.model.Usuario;

public class UsuarioDto {

	private String rutUsuario;
	private String dvUsuario;
	private String nombreUsuario;
	private String direccionUsuario;
	private String telefonoUsuario;
	private String emailUsuario;	
	private List<Contrato> contratos;
	private Comuna comuna;
	private TipoUsuario tipoUsuario;
	
	public UsuarioDto(Usuario usuario) {
		rutUsuario = usuario.getRutUsuario();
		dvUsuario = usuario.getDvUsuario();
		nombreUsuario = usuario.getNombreUsuario();
		direccionUsuario = usuario.getDireccionUsuario();
		telefonoUsuario = usuario.getTelefonoUsuario();
		emailUsuario = usuario.getEmailUsuario();
		tipoUsuario = usuario.getTipoUsuario();
		contratos = usuario.getContratos();
	}

	public UsuarioDto() {
		
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
	
	public List<UsuarioDto> convertToList(List<Usuario> listUsuario) {
		return listUsuario.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}
	
	public List<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(List<Contrato> contratos) {
		this.contratos = contratos;
	}
	
	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}
	
}
