package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CABECERA_COMPRA database table.
 * 
 */
@Entity
@Table(name="CABECERA_COMPRA")
@NamedQuery(name="CabeceraCompra.findAll", query="SELECT c FROM CabeceraCompra c")
public class CabeceraCompra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_CABECERA_COMPRA")
	private long idCabeceraCompra;

	@Column(name="DESCRIPCION_CABECERA_COMPRA")
	private String descripcionCabeceraCompra;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_CABECERA_COMPRA")
	private Date fechaCabeceraCompra;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	//bi-directional many-to-one association to DetalleCompra
	@OneToMany(mappedBy="cabeceraCompra")
	private List<DetalleCompra> detalleCompras;

	public CabeceraCompra() {
	}


	public String getDescripcionCabeceraCompra() {
		return this.descripcionCabeceraCompra;
	}

	public void setDescripcionCabeceraCompra(String descripcionCabeceraCompra) {
		this.descripcionCabeceraCompra = descripcionCabeceraCompra;
	}

	public Date getFechaCabeceraCompra() {
		return this.fechaCabeceraCompra;
	}

	public void setFechaCabeceraCompra(Date fechaCabeceraCompra) {
		this.fechaCabeceraCompra = fechaCabeceraCompra;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<DetalleCompra> getDetalleCompras() {
		return this.detalleCompras;
	}

	public void setDetalleCompras(List<DetalleCompra> detalleCompras) {
		this.detalleCompras = detalleCompras;
	}

}
