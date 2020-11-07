package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Entity
@Table(name="DETALLE_COMPRA")
@NamedQuery(name="DetalleCompra.findAll", query="SELECT d FROM DetalleCompra d")
public class DetalleCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_DETALLE_COMPRA")
	private long idDetalleCompra;

	@Column(name="DESCRIPCION_DETALLE_COMPRA")
	private String descripcionDetalleCompra;

	@Column(name="IVA_DETALLE_COMPRA")
	private BigDecimal ivaDetalleCompra;

	@Column(name="TOTAL_VALOR_DETALLE_COMPRA")
	private BigDecimal totalValorDetalleCompra;

	@Column(name="VALOR_BRUTO_DETALLE_VENTA")
	private BigDecimal valorBrutoDetalleVenta;

	@ManyToMany(mappedBy="detalleCompras")
	private List<Producto> productos;

	@ManyToOne
	@JoinColumn(name="ID_CABECERA_COMPRA")
	private CabeceraCompra cabeceraCompra;

	public DetalleCompra() {
	}

	public long getIdDetalleCompra() {
		return this.idDetalleCompra;
	}

	public void setIdDetalleCompra(long idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}

	public String getDescripcionDetalleCompra() {
		return this.descripcionDetalleCompra;
	}

	public void setDescripcionDetalleCompra(String descripcionDetalleCompra) {
		this.descripcionDetalleCompra = descripcionDetalleCompra;
	}

	public BigDecimal getIvaDetalleCompra() {
		return this.ivaDetalleCompra;
	}

	public void setIvaDetalleCompra(BigDecimal ivaDetalleCompra) {
		this.ivaDetalleCompra = ivaDetalleCompra;
	}

	public BigDecimal getTotalValorDetalleCompra() {
		return this.totalValorDetalleCompra;
	}

	public void setTotalValorDetalleCompra(BigDecimal totalValorDetalleCompra) {
		this.totalValorDetalleCompra = totalValorDetalleCompra;
	}

	public BigDecimal getValorBrutoDetalleVenta() {
		return this.valorBrutoDetalleVenta;
	}

	public void setValorBrutoDetalleVenta(BigDecimal valorBrutoDetalleVenta) {
		this.valorBrutoDetalleVenta = valorBrutoDetalleVenta;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public CabeceraCompra getCabeceraCompra() {
		return this.cabeceraCompra;
	}

	public void setCabeceraCompra(CabeceraCompra cabeceraCompra) {
		this.cabeceraCompra = cabeceraCompra;
	}

}
