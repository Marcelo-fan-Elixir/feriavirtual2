package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the VENTA_DETALLE database table.
 * 
 */
@Entity
@Table(name="VENTA_DETALLE")
@NamedQuery(name="VentaDetalle.findAll", query="SELECT v FROM VentaDetalle v")
public class VentaDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_VENTA_DETALLE")
	private long idVentaDetalle;

	@Column(name="CABECERA_VENTA_DETALLE")
	private BigDecimal cabeceraVentaDetalle;

	@Column(name="DESCRIPCION_VENTA_DETALLE")
	private String descripcionVentaDetalle;

	@Column(name="IVA_VENTA_DETALLE")
	private BigDecimal ivaVentaDetalle;

	@Column(name="TOTAL_VENTA_DETALLE")
	private BigDecimal totalVentaDetalle;

	@Column(name="VALOR_BRUTO_VENTA_DETALLE")
	private BigDecimal valorBrutoVentaDetalle;

	//bi-directional many-to-one association to CabeceraVenta
	@JsonIgnore
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ID_CABECERA_VENTA", referencedColumnName="ID_CABECERA_VENTA"),
		@JoinColumn(name="ID_TIPO_MONEDA", referencedColumnName="ID_TIPO_MONEDA"),
		@JoinColumn(name="ID_TIPO_VENTA", referencedColumnName="ID_TIPO_VENTA"),
		@JoinColumn(name="ID_USUARIO", referencedColumnName="ID_USUARIO")
		})
	private CabeceraVenta cabeceraVenta;

	//bi-directional many-to-many association to Producto
	@JsonIgnore
	@ManyToMany
	@JoinTable(
		name="VENTA_PRODCUTO"
		, joinColumns={
			@JoinColumn(name="ID_VENTA_DETALLE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_ESTADO_PRODUCTO", referencedColumnName="ID_ESTADO_PRODUCTO"),
			@JoinColumn(name="ID_PRODUCTO", referencedColumnName="ID_PRODUCTO")
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

	public BigDecimal getCabeceraVentaDetalle() {
		return this.cabeceraVentaDetalle;
	}

	public void setCabeceraVentaDetalle(BigDecimal cabeceraVentaDetalle) {
		this.cabeceraVentaDetalle = cabeceraVentaDetalle;
	}

	public String getDescripcionVentaDetalle() {
		return this.descripcionVentaDetalle;
	}

	public void setDescripcionVentaDetalle(String descripcionVentaDetalle) {
		this.descripcionVentaDetalle = descripcionVentaDetalle;
	}

	public BigDecimal getIvaVentaDetalle() {
		return this.ivaVentaDetalle;
	}

	public void setIvaVentaDetalle(BigDecimal ivaVentaDetalle) {
		this.ivaVentaDetalle = ivaVentaDetalle;
	}

	public BigDecimal getTotalVentaDetalle() {
		return this.totalVentaDetalle;
	}

	public void setTotalVentaDetalle(BigDecimal totalVentaDetalle) {
		this.totalVentaDetalle = totalVentaDetalle;
	}

	public BigDecimal getValorBrutoVentaDetalle() {
		return this.valorBrutoVentaDetalle;
	}

	public void setValorBrutoVentaDetalle(BigDecimal valorBrutoVentaDetalle) {
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
