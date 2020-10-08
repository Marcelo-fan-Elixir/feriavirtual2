package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.ProductoForm;
import br.com.solucionweb.feriavirtual2.model.Producto;

public interface ProductoService {

	public Producto saveProducto(ProductoForm productoForm);

	public Optional<Producto> getProducto(Long id);

	public Optional<Producto> deleteProducto(Long id);

	public Optional<Producto> updateProducto(Long id, ProductoForm productoForm);

	public List<Producto> listProducto();
}
