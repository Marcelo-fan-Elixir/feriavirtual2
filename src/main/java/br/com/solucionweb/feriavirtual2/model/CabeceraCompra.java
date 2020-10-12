package br.com.solucionweb.feriavirtual2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "CABECERA_COMPRA")
public class CabeceraCompra {
	
	private Long idCabeceraCompra;
	private String descripcionCabeceraCompra;
	private Date fechaCabeceraCompra;

}
