package br.com.solucionweb.feriavirtual2.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.EstadoProducto;
import br.com.solucionweb.feriavirtual2.model.Producto;
import br.com.solucionweb.feriavirtual2.model.TipoProducto;

public class ProductoDto {

	private String nombreProducto;
	private Long valorProducto;
	private EstadoProducto estadoProducto;
	private TipoProducto tipoProducto;

	public ProductoDto(Producto producto) {
		nombreProducto = producto.getNombreProducto();
		estadoProducto = producto.getEstadoProducto();
		tipoProducto = producto.getTipoProducto();
		valorProducto = producto.getValorProducto();
	}

	public ProductoDto() {

	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Long getValorProducto() {
		return valorProducto;
	}

	public void setValorProducto(Long valorProducto) {
		this.valorProducto = valorProducto;
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

	public List<ProductoDto> convertToList(List<Producto> listProducto) {
		return listProducto.stream().map(ProductoDto::new).collect(Collectors.toList());
	}

}
