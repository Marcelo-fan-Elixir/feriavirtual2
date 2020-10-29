package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CABECERA_VENTA")
@NamedQuery(name = "CabeceraVenta.findAll", query = "SELECT c FROM CabeceraVenta c")
public class CabeceraVenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_CABECERA_VENTA")
	private Long idCabeceraVenta;

	@Column(name = "DESCRIPCION_CABECERA_VENTA")
	private String descripcionCabeceraVenta;

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_VENTA")
	private Date fechaVenta;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "ID_ESTADO_PEDIDO", referencedColumnName = "ID_ESTADO_PEDIDO"),
			@JoinColumn(name = "ID_PEDIDO", referencedColumnName = "ID_PEDIDO") })
	private Pedido pedido;

	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "ID_TIPO_MONEDA", referencedColumnName = "ID_TIPO_MONEDA"),
			@JoinColumn(name = "ID_TIPO_VENTA", referencedColumnName = "ID_TIPO_VENTA") })
	private TipoVenta tipoVenta;

	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;

	public CabeceraVenta() {
	}

	public Long getIdCabeceraVenta() {
		return idCabeceraVenta;
	}

	public void setIdCabeceraVenta(Long idCabeceraVenta) {
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


}
