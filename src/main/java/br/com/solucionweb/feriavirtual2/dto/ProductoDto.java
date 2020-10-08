package br.com.solucionweb.feriavirtual2.dto;

import br.com.solucionweb.feriavirtual2.model.Producto;

public class ProductoDto {
	
	private String nombreProducto;
	
	public ProductoDto(Producto producto) {
		nombreProducto = producto.getNombreProducto();
	}
	
	public ProductoDto() {
		
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

}
