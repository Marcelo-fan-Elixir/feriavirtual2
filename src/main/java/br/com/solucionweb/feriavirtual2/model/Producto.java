package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "PRODUCTO")
@NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROD_SEQ")
	@SequenceGenerator(sequenceName = "producto_seq", allocationSize = 1, name = "PROD_SEQ")
	@Column(name = "ID_PRODUCTO")
	private long idProducto;

	@Column(name = "NOMBRE_PRODUCTO")
	private String nombreProducto;

	@Column(name = "VALOR_PRODUCTO")
	private Long valorProducto;

	@ManyToMany
	@JoinTable(name = "COMPRA_PRODUCTO", 
	joinColumns = { @JoinColumn(name = "ID_PRODUCTO") }, 
	inverseJoinColumns = {@JoinColumn(name = "ID_DETALLE_COMPRA") })
	private List<DetalleCompra> detalleCompras;

	@ManyToOne
	@JoinColumn(name = "ID_ESTADO_PRODUCTO")
	private EstadoProducto estadoProducto;

	@ManyToOne
	@JoinColumn(name = "ID_TIPO_PRODUCTO")
	private TipoProducto tipoProducto;

	public Producto() {
	}

	public long getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Long getValorProducto() {
		return this.valorProducto;
	}

	public void setValorProducto(Long valorProducto) {
		this.valorProducto = valorProducto;
	}

	public List<DetalleCompra> getDetalleCompras() {
		return this.detalleCompras;
	}

	public void setDetalleCompras(List<DetalleCompra> detalleCompras) {
		this.detalleCompras = detalleCompras;
	}

	public EstadoProducto getEstadoProducto() {
		return this.estadoProducto;
	}

	public void setEstadoProducto(EstadoProducto estadoProducto) {
		this.estadoProducto = estadoProducto;
	}

	public TipoProducto getTipoProducto() {
		return this.tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

}
