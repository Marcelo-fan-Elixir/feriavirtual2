package br.com.solucionweb.feriavirtual2.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.TipoUsuario;

public class TipoUsuarioDto {
	
	private Long idTipousuario;
	private String nombreTipoUsuario;
	private String descripcionTipoUsuario;
	
	public TipoUsuarioDto (TipoUsuario tipoUsuario) {
		idTipousuario = tipoUsuario.getIdTipousuario();
		nombreTipoUsuario = tipoUsuario.getNombreTipoUsuario();
		descripcionTipoUsuario = tipoUsuario.getDescripcionTipoUsuario();
	}
	
	public TipoUsuarioDto(){
		
	}
	
	public Long getIdTipousuario() {
		return idTipousuario;
	}
	public void setIdTipousuario(Long idTipousuario) {
		this.idTipousuario = idTipousuario;
	}
	public String getNombreTipoUsuario() {
		return nombreTipoUsuario;
	}
	
	public void setNombreTipoUsuario(String nombreTipoUsuario) {
		this.nombreTipoUsuario = nombreTipoUsuario;
	}
	public String getDescripcionTipoUsuario() {
		return descripcionTipoUsuario;
	}
	public void setDescripcionTipoUsuario(String descripcionTipoUsuario) {
		this.descripcionTipoUsuario = descripcionTipoUsuario;
	}
	
	public List<TipoUsuarioDto> convertToList(List<TipoUsuario> listTipoUsuario) {
		return listTipoUsuario.stream().map(TipoUsuarioDto::new).collect(Collectors.toList());
	}
	
}
