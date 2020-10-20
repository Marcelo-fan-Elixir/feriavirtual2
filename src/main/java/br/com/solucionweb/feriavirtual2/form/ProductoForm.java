package br.com.solucionweb.feriavirtual2.form;

import br.com.solucionweb.feriavirtual2.model.EstadoProducto;
import br.com.solucionweb.feriavirtual2.model.Producto;
import br.com.solucionweb.feriavirtual2.model.TipoProducto;

public class ProductoForm {
	
	private String nombreProducto;
	private EstadoProducto estadoProducto;
	private TipoProducto tipoProducto;
	
	public Producto Convert() {
		Producto producto = new Producto();
		producto.setNombreProducto(this.nombreProducto);
		producto.setEstadoProducto(this.estadoProducto);
		producto.setTipoProducto(this.tipoProducto);
		return producto;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public EstadoProducto getEstadoProducto() {
		return estadoProducto;
	}
	public void setEstadoProducto(EstadoProducto estadoProducto) {
		this.estadoProducto = estadoProducto;
	}
	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
}
