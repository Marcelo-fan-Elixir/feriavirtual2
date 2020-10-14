package br.com.solucionweb.feriavirtual2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "CABECERA_VENTA")
public class CabeceraVenta {
	
	private Long idCabeceraVenta;
	private String descripcionCabeceraVenta;
	private Date fechaVenta;

}
