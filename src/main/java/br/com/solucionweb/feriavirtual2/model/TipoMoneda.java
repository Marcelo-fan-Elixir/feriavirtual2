package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TIPO_MONEDA")
public class TipoMoneda {

	private Long idTipoMoneda;
	private String nombreTipoMoneda;
}
