package br.com.solucionweb.feriavirtual2.form;

import br.com.solucionweb.feriavirtual2.model.Producto;

public class ProductoForm {
	
	private String nombreProducto;
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public Producto Convert() {
		Producto producto = new Producto();
		producto.setNombreProducto(this.nombreProducto);
		return null;
	}
	
}
