package br.com.solucionweb.feriavirtual2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "TRANSPORTE")
public class Transporte {
	
	private Long idEstadoTransporte;
	private String descripcionEstadoTransporte;
	private Date fechaInicio;
	private Date fechaEstimada;
	private Date fechaTermino;

}
