package br.com.solucionweb.feriavirtual2.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


@Table(name = "PEDIDO")
public class Pedido {

	private Long idPedido;
	private String detallePedido;
	private Date fechaPedido;
	
}
