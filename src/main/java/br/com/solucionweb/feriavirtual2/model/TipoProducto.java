package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TIPO_PRODUCTO")
public class TipoProducto {
	
	private Long idTipoProducto;
	private String nombreTipoProducto;
	
}
