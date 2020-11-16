package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="PEDIDO")
@NamedQuery(name="Pedido.findAll", query="SELECT p FROM Pedido p")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PEDIDO")
	private Long idPedido;

	@Column(name="DETALLE_PEDIDO")
	private String detallePedido;
	
	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_PEDIDO")
	private Date fechaPedido;

//	@OneToMany(mappedBy="pedido")
//	private List<CabeceraVenta> cabeceraVentas;

	@ManyToOne
	@JoinColumn(name="ID_ESTADO_PEDIDO")
	private EstadoPedido estadoPedido;

//	@OneToMany(mappedBy="pedido")
//	private List<Subasta> subastas;

	public Pedido() {
	}

	public Long getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public String getDetallePedido() {
		return this.detallePedido;
	}

	public void setDetallePedido(String detallePedido) {
		this.detallePedido = detallePedido;
	}

	public Date getFechaPedido() {
		return this.fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

//	public List<CabeceraVenta> getCabeceraVentas() {
//		return this.cabeceraVentas;
//	}
//
//	public void setCabeceraVentas(List<CabeceraVenta> cabeceraVentas) {
//		this.cabeceraVentas = cabeceraVentas;
//	}

	public EstadoPedido getEstadoPedido() {
		return this.estadoPedido;
	}

	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}

//	public List<Subasta> getSubastas() {
//		return this.subastas;
//	}
//
//	public void setSubastas(List<Subasta> subastas) {
//		this.subastas = subastas;
//	}
}
