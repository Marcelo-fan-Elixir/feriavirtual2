package br.com.solucionweb.feriavirtual2.dto;

import br.com.solucionweb.feriavirtual2.model.CabeceraVenta;
import br.com.solucionweb.feriavirtual2.model.VentaDetalle;

public class VentaDetalleDto {

	private Long cabeceraVentaDetalle;
	private String descripcionVentaDetalle;
	private Long ivaVentaDetalle;
	private Long totalVentaDetalle;
	private Long valorBrutoVentaDetalle;
	private CabeceraVenta cabeceraVenta;

	public VentaDetalleDto(VentaDetalle ventaDetalle) {
		cabeceraVentaDetalle = ventaDetalle.getCabeceraVentaDetalle();
		descripcionVentaDetalle = ventaDetalle.getDescripcionVentaDetalle();
		ivaVentaDetalle = ventaDetalle.getIvaVentaDetalle();
		totalVentaDetalle = ventaDetalle.getTotalVentaDetalle();
		valorBrutoVentaDetalle = ventaDetalle.getValorBrutoVentaDetalle();
		cabeceraVenta = ventaDetalle.getCabeceraVenta();
	}

	public Long getCabeceraVentaDetalle() {
		return cabeceraVentaDetalle;
	}

	public void setCabeceraVentaDetalle(Long cabeceraVentaDetalle) {
		this.cabeceraVentaDetalle = cabeceraVentaDetalle;
	}

	public String getDescripcionVentaDetalle() {
		return descripcionVentaDetalle;
	}

	public void setDescripcionVentaDetalle(String descripcionVentaDetalle) {
		this.descripcionVentaDetalle = descripcionVentaDetalle;
	}

	public Long getIvaVentaDetalle() {
		return ivaVentaDetalle;
	}

	public void setIvaVentaDetalle(Long ivaVentaDetalle) {
		this.ivaVentaDetalle = ivaVentaDetalle;
	}

	public Long getTotalVentaDetalle() {
		return totalVentaDetalle;
	}

	public void setTotalVentaDetalle(Long totalVentaDetalle) {
		this.totalVentaDetalle = totalVentaDetalle;
	}

	public Long getValorBrutoVentaDetalle() {
		return valorBrutoVentaDetalle;
	}

	public void setValorBrutoVentaDetalle(Long valorBrutoVentaDetalle) {
		this.valorBrutoVentaDetalle = valorBrutoVentaDetalle;
	}

	public CabeceraVenta getCabeceraVenta() {
		return cabeceraVenta;
	}

	public void setCabeceraVenta(CabeceraVenta cabeceraVenta) {
		this.cabeceraVenta = cabeceraVenta;
	}

}
