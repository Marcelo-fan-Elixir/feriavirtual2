package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_EMPLEADO")
public class TipoEmpleado {
	
	private Long idTipoEmpleado;
	private String nombreTipoEmpleado;

}
