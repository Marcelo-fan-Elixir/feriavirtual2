package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_VENTA")
@NamedQuery(name = "TipoVenta.findAll", query = "SELECT t FROM TipoVenta t")
public class TipoVenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_TIPO_VENTA")
	private Long idTipoVenta;

	@Column(name = "DESCRIPCION_TIPO_VENTA")
	private String descripcionTipoVenta;

	@Column(name = "NOMBRE_TIPO_VENTA")
	private String nombreTipoVenta;

	@ManyToOne
	@JoinColumn(name = "ID_TIPO_MONEDA")
	private TipoMoneda tipoMoneda;

	public TipoVenta() {
	}

	public Long getIdTipoVenta() {
		return idTipoVenta;
	}

	public void setIdTipoVenta(Long idTipoVenta) {
		this.idTipoVenta = idTipoVenta;
	}

	public String getDescripcionTipoVenta() {
		return this.descripcionTipoVenta;
	}

	public void setDescripcionTipoVenta(String descripcionTipoVenta) {
		this.descripcionTipoVenta = descripcionTipoVenta;
	}

	public String getNombreTipoVenta() {
		return this.nombreTipoVenta;
	}

	public void setNombreTipoVenta(String nombreTipoVenta) {
		this.nombreTipoVenta = nombreTipoVenta;
	}

	public TipoMoneda getTipoMoneda() {
		return this.tipoMoneda;
	}

	public void setTipoMoneda(TipoMoneda tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

}
