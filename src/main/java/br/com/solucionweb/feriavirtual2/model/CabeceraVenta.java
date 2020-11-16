package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="CABECERA_VENTA")
@NamedQuery(name="CabeceraVenta.findAll", query="SELECT c FROM CabeceraVenta c")
public class CabeceraVenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CV_SEQ")
	@SequenceGenerator(sequenceName = "cabecera_venta_seq", allocationSize = 1, name = "CV_SEQ")
	@Column(name="ID_CABECERA_VENTA")
	private long idCabeceraVenta;

	@Column(name="DESCRIPCION_CABECERA_VENTA")
	private String descripcionCabeceraVenta;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_VENTA")
	private Date fechaVenta;

	@ManyToOne
	@JoinColumn(name="ID_PEDIDO")
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name="ID_TIPO_VENTA")
	private TipoVenta tipoVenta;

	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;
	
	@JsonIgnore
	@OneToMany(mappedBy="cabeceraVenta")
	private List<VentaDetalle> ventaDetalles;


	public CabeceraVenta() {
	}

	public long getIdCabeceraVenta() {
		return this.idCabeceraVenta;
	}

	public void setIdCabeceraVenta(long idCabeceraVenta) {
		this.idCabeceraVenta = idCabeceraVenta;
	}

	public String getDescripcionCabeceraVenta() {
		return this.descripcionCabeceraVenta;
	}

	public void setDescripcionCabeceraVenta(String descripcionCabeceraVenta) {
		this.descripcionCabeceraVenta = descripcionCabeceraVenta;
	}

	public Date getFechaVenta() {
		return this.fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public TipoVenta getTipoVenta() {
		return this.tipoVenta;
	}

	public void setTipoVenta(TipoVenta tipoVenta) {
		this.tipoVenta = tipoVenta;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<VentaDetalle> getVentaDetalles() {
		return ventaDetalles;
	}

	public void setVentaDetalles(List<VentaDetalle> ventaDetalles) {
		this.ventaDetalles = ventaDetalles;
	}
	
	

}
