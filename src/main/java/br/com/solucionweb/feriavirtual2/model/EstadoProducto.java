package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ESTADO_PRODUCTO")
@NamedQuery(name="EstadoProducto.findAll", query="SELECT e FROM EstadoProducto e")
public class EstadoProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_ESTADO_PRODUCTO")
	private Long idEstadoProducto;

	@Column(name="DESCRTPCION_ESTADO_PRODUCTO")
	private String descrtpcionEstadoProducto;

	@Column(name="PORCENTAJE_ESTADO_PRODUCTO")
	private BigDecimal porcentajeEstadoProducto;

	public EstadoProducto() {
	}

	public Long getIdEstadoProducto() {
		return this.idEstadoProducto;
	}

	public void setIdEstadoProducto(Long idEstadoProducto) {
		this.idEstadoProducto = idEstadoProducto;
	}

	public String getDescrtpcionEstadoProducto() {
		return this.descrtpcionEstadoProducto;
	}

	public void setDescrtpcionEstadoProducto(String descrtpcionEstadoProducto) {
		this.descrtpcionEstadoProducto = descrtpcionEstadoProducto;
	}

	public BigDecimal getPorcentajeEstadoProducto() {
		return this.porcentajeEstadoProducto;
	}

	public void setPorcentajeEstadoProducto(BigDecimal porcentajeEstadoProducto) {
		this.porcentajeEstadoProducto = porcentajeEstadoProducto;
	}
}
