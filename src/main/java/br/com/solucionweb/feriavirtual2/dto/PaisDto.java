package br.com.solucionweb.feriavirtual2.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.Pais;

public class PaisDto {
	
	private Long idPais;
	private String nombrePais;
	
	public PaisDto(Pais pais) {
		idPais = pais.getIdPais();
		nombrePais = pais.getNombrePais();
	}
	
	public PaisDto() {
	}

	
	
	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	public List<PaisDto> convertToList(List<Pais> listPais) {
		return listPais.stream().map(PaisDto::new).collect(Collectors.toList());
	}
	
}
