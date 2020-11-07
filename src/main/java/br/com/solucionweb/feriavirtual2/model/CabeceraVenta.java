package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;



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

}
