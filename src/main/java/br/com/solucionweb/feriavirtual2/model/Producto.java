package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "PRODUCTO")
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PROD_SEQ")
    @SequenceGenerator(sequenceName = "producto_seq", allocationSize = 1, name = "PROD_SEQ")
	@Column(name="ID_PRODUCTO")
	private Long idProducto;

	@Column(name="NOMBRE_PRODUCTO")
	private String nombreProducto;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
		name="COMPRA_PRODUCTO"
		, joinColumns={
			@JoinColumn(name="ID_ESTADO_PRODUCTO", referencedColumnName="ID_ESTADO_PRODUCTO"),
			@JoinColumn(name="ID_PRODUCTO", referencedColumnName="ID_PRODUCTO")
			}
		, inverseJoinColumns={
			@JoinColumn(name="ID_CABECERA_COMPRA", referencedColumnName="ID_CABECERA_COMPRA"),
			@JoinColumn(name="ID_DETALLE_COMPRA", referencedColumnName="ID_DETALLE_COMPRA"),
			@JoinColumn(name="ID_USUARIO", referencedColumnName="ID_USUARIO")
			}
		)
	private List<DetalleCompra> detalleCompras;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ID_ESTADO_PRODUCTO")
	private EstadoProducto estadoProducto;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="ID_TIPO_PRODUCTO")
	private TipoProducto tipoProducto;

	public Producto() {
	}
	
	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
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
