package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TIPO_VENTA")
public class TipoVenta {
	
	private Long idTipoVenta;
	private String nombreTipoVenta;
	private String descripcionTipoVenta;

}
