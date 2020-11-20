package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;



@Entity
@Table(name="VENTA_DETALLE")
@NamedQuery(name="VentaDetalle.findAll", query="SELECT v FROM VentaDetalle v")
public class VentaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_VENTA_DETALLE")
	private long idVentaDetalle;

	@Column(name="CABECERA_VENTA_DETALLE")
	private Long cabeceraVentaDetalle;
		
	@Column(name="DESCRIPCION_VENTA_DETALLE")
	private String descripcionVentaDetalle;

	@Column(name="IVA_VENTA_DETALLE")
	private Long ivaVentaDetalle;

	@Column(name="TOTAL_VENTA_DETALLE")
	private Long totalVentaDetalle;

	@Column(name="VALOR_BRUTO_VENTA_DETALLE")
	private Long valorBrutoVentaDetalle;

	@ManyToOne
	@JoinColumn(name="ID_CABECERA_VENTA")
	private CabeceraVenta cabeceraVenta;

	@ManyToMany
	@JoinTable(
		name="VENTA_PRODUCTO"
		, joinColumns={
			@JoinColumn(name="ID_VENTA_DETALLE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_PRODUCTO")
			}
		)
	private List<Producto> productos;

	public VentaDetalle() {
	}

	public long getIdVentaDetalle() {
		return this.idVentaDetalle;
	}

	public void setIdVentaDetalle(long idVentaDetalle) {
		this.idVentaDetalle = idVentaDetalle;
	}

	public Long getCabeceraVentaDetalle() {
		return this.cabeceraVentaDetalle;
	}

	public void setCabeceraVentaDetalle(Long cabeceraVentaDetalle) {
		this.cabeceraVentaDetalle = cabeceraVentaDetalle;
	}

	public String getDescripcionVentaDetalle() {
		return this.descripcionVentaDetalle;
	}

	public void setDescripcionVentaDetalle(String descripcionVentaDetalle) {
		this.descripcionVentaDetalle = descripcionVentaDetalle;
	}

	public Long getIvaVentaDetalle() {
		return this.ivaVentaDetalle;
	}

	public void setIvaVentaDetalle(Long ivaVentaDetalle) {
		this.ivaVentaDetalle = ivaVentaDetalle;
	}

	public Long getTotalVentaDetalle() {
		return this.totalVentaDetalle;
	}

	public void setTotalVentaDetalle(Long totalVentaDetalle) {
		this.totalVentaDetalle = totalVentaDetalle;
	}

	public Long getValorBrutoVentaDetalle() {
		return this.valorBrutoVentaDetalle;
	}

	public void setValorBrutoVentaDetalle(Long valorBrutoVentaDetalle) {
		this.valorBrutoVentaDetalle = valorBrutoVentaDetalle;
	}

	public CabeceraVenta getCabeceraVenta() {
		return this.cabeceraVenta;
	}

	public void setCabeceraVenta(CabeceraVenta cabeceraVenta) {
		this.cabeceraVenta = cabeceraVenta;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

}
