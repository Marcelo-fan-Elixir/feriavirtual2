package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;

public class Comuna {
	
	private Long idComuna;
	private String nombreComuna;
	
	public Long getIdComuna() {
		return idComuna;
	}
	public void setIdComuna(Long idComuna) {
		this.idComuna = idComuna;
	}
	public String getNombreComuna() {
		return nombreComuna;
	}
	public void setNombreComuna(String nombreComuna) {
		this.nombreComuna = nombreComuna;
	}
	
	
	
	

}
