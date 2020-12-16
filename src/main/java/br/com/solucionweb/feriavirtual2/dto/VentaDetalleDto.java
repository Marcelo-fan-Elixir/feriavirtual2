package br.com.solucionweb.feriavirtual2.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.CabeceraVenta;
import br.com.solucionweb.feriavirtual2.model.Producto;
import br.com.solucionweb.feriavirtual2.model.VentaDetalle;

public class VentaDetalleDto {

	private Long cabeceraVentaDetalle;
	private String descripcionVentaDetalle;
	private Long ivaVentaDetalle;
	private Long totalVentaDetalle;
	private Long valorBrutoVentaDetalle;
	private CabeceraVenta cabeceraVenta;
	private List<Producto> productos;

	public VentaDetalleDto(VentaDetalle ventaDetalle) {
		productos = ventaDetalle.getProductos();
		cabeceraVentaDetalle = ventaDetalle.getCabeceraVentaDetalle();
		descripcionVentaDetalle = ventaDetalle.getDescripcionVentaDetalle();
		ivaVentaDetalle = ventaDetalle.getIvaVentaDetalle();
		totalVentaDetalle = ventaDetalle.getTotalVentaDetalle();
		valorBrutoVentaDetalle = ventaDetalle.getValorBrutoVentaDetalle();
		cabeceraVenta = ventaDetalle.getCabeceraVenta();
	}
	
	public VentaDetalleDto() {
		
	}
	
	

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
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

	public List<VentaDetalleDto> convertToList(List<VentaDetalle> listVentaDetalle) {
		return listVentaDetalle.stream().map(VentaDetalleDto::new).collect(Collectors.toList());
	}
	
}
