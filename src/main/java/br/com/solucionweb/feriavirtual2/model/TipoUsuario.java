package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TIPO_USUARIO")
public class TipoUsuario {
	
	private Long idTipoUsuario;
	private String nombreTipoUsuario;

}
