package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.ProductoForm;
import br.com.solucionweb.feriavirtual2.model.Producto;
import br.com.solucionweb.feriavirtual2.repository.ProductoRepository;
import br.com.solucionweb.feriavirtual2.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto saveProducto(ProductoForm productoForm) {
		return productoRepository.save(productoForm.Convert());
	}

	@Override
	public Optional<Producto> getProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Producto> deleteProducto(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Producto> updateProducto(Long id, ProductoForm productoForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> listProducto() {
		// TODO Auto-generated method stub
		return null;
	}

}
