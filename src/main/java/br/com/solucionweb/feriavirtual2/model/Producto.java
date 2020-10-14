package br.com.solucionweb.feriavirtual2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUTO")
	private Long idProducto;
	@Column(name = "NOMBRE_PRODUCTO")
	private String nombreProducto;
	
	public Long getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	

}
