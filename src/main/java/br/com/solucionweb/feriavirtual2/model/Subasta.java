package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "SUBASTA")
public class Subasta {
	
	private Long idSubasta;
	private String nomPujadorSubasta;
	private Long valorSubasta;
}
