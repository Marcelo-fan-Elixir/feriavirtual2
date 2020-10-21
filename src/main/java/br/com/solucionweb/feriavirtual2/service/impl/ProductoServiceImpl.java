package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
	@Transactional
	public Producto saveProducto(ProductoForm productoForm) {
		return productoRepository.save(productoForm.Convert());
	}

	@Override
	public Optional<Producto> getProducto(Long id) {
		return productoRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<Producto> deleteProducto(Long id) {
		Optional<Producto> producto = productoRepository.findById(id);
		if (producto.isPresent()) {
			productoRepository.deleteById(id);
			return producto;
		}
		return producto;
	}

	@Override
	@Transactional
	public Optional<Producto> updateProducto(Long id, ProductoForm productoForm) {
		Optional<Producto> producto = productoRepository.findById(id);
		if(producto.isPresent()) {
			Producto productoUpdated = productoRepository.getOne(id);
			productoUpdated.setNombreProducto(productoForm.getNombreProducto() != null? productoForm.getNombreProducto() :
				(productoUpdated.getNombreProducto() != null? productoUpdated.getNombreProducto() : null));
			
			productoUpdated.setEstadoProducto(productoForm.getEstadoProducto() != null? productoForm.getEstadoProducto() :
				(productoUpdated.getEstadoProducto() != null? productoUpdated.getEstadoProducto() : null));
			
			productoUpdated.setTipoProducto(productoForm.getTipoProducto() != null? productoForm.getTipoProducto() :
				(productoUpdated.getTipoProducto() != null? productoUpdated.getTipoProducto() : null));			
			return producto;
		}
		return producto;
	}

	@Override
	public List<Producto> listProducto() {
		return productoRepository.findAll();
	}

}
