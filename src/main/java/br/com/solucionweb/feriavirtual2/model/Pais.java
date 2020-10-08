package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PAIS")
public class Pais {

	private Long idPais;
	private String nombrePais;
	
}
