package br.com.solucionweb.feriavirtual2.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Empleado {
	
	private Long idEmpleado;
	private String rutEmpleado;
	private String dvEmpleado;
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private Date fechaEmpleado;
	private String direccionEmpleado;
	private String telefonoEmpleado;
	private String emailEmpleado;
	
}
