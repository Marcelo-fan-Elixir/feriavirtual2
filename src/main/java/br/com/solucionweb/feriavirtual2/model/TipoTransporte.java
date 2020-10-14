package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TIPO_TRANSPORTE")
public class TipoTransporte {

	private Long idTipoTransporte;
	private String nombreTipoTransporte;
	
}
