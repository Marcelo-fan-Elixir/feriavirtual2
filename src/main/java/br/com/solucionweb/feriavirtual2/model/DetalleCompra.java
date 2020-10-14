package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "DETALLE_COMPRA")
public class DetalleCompra {

	private Long idDetalleCompra;
	private String descripcionDetalleCompra;
	private Long valorBrutoDetalleVenta;
	private Long ivaDetalleCompra;
	private Long totalValorDetalleCompra;
	
}
