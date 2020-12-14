package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.VentaDetalleForm;
import br.com.solucionweb.feriavirtual2.model.VentaDetalle;
import br.com.solucionweb.feriavirtual2.repository.VentaDetalleRepository;
import br.com.solucionweb.feriavirtual2.service.VentaDetalleService;
import br.com.solucionweb.feriavirtual2.util.NotaVentaDetalle;

@Service
public class VentaDetalleServiceImpl implements VentaDetalleService{

	@Autowired
	private VentaDetalleRepository ventaDetalleRepository;
	
	@Override
	@Transactional
	public VentaDetalle saveVentaDetalle(VentaDetalleForm ventaDetalleForm) {
		return ventaDetalleRepository.save(ventaDetalleForm.convert());
	}

	@Override
	public Optional<VentaDetalle> getVentaDetalle(Long id) {
		return ventaDetalleRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<VentaDetalle> deleteVentaDetalle(Long id) {
		Optional<VentaDetalle> ventaDetalle = ventaDetalleRepository.findById(id);
		if (ventaDetalle.isPresent()) {
			ventaDetalleRepository.deleteById(id);
			return ventaDetalle;
		}
		return ventaDetalle;
	}

	@Override
	@Transactional
	public Optional<VentaDetalle> updateVentaDetalle(Long id, VentaDetalleForm ventaDetalleForm) {
		Optional<VentaDetalle> ventaDetalle = ventaDetalleRepository.findById(id);
		if (ventaDetalle.isPresent()) {
			VentaDetalle ventaDetalleUpdated = ventaDetalleRepository.getOne(id);
			
			ventaDetalleUpdated.setCabeceraVentaDetalle(ventaDetalleForm.getCabeceraVentaDetalle() != null? ventaDetalleForm.getCabeceraVentaDetalle() :
				(ventaDetalleUpdated.getCabeceraVentaDetalle() != null? ventaDetalleUpdated.getCabeceraVentaDetalle() : null));
			
			ventaDetalleUpdated.setDescripcionVentaDetalle(ventaDetalleForm.getDescripcionVentaDetalle() != null? ventaDetalleForm.getDescripcionVentaDetalle() :
				(ventaDetalleUpdated.getDescripcionVentaDetalle() != null? ventaDetalleUpdated.getDescripcionVentaDetalle() : null));
			
			ventaDetalleUpdated.setIvaVentaDetalle(ventaDetalleForm.getIvaVentaDetalle() != null? ventaDetalleForm.getIvaVentaDetalle() :
				(ventaDetalleUpdated.getIvaVentaDetalle() != null? ventaDetalleUpdated.getIvaVentaDetalle() : null));			
			
			ventaDetalleUpdated.setTotalVentaDetalle(ventaDetalleForm.getTotalVentaDetalle() != null? ventaDetalleForm.getTotalVentaDetalle() :
				(ventaDetalleUpdated.getTotalVentaDetalle() != null? ventaDetalleUpdated.getTotalVentaDetalle() : null));			

			ventaDetalleUpdated.setValorBrutoVentaDetalle(ventaDetalleForm.getValorBrutoVentaDetalle() != null? ventaDetalleForm.getValorBrutoVentaDetalle() :
				(ventaDetalleUpdated.getValorBrutoVentaDetalle() != null? ventaDetalleUpdated.getValorBrutoVentaDetalle() : null));			

			ventaDetalleUpdated.setCabeceraVenta(ventaDetalleForm.getCabeceraVenta() != null? ventaDetalleForm.getCabeceraVenta() :
							(ventaDetalleUpdated.getCabeceraVenta() != null ? ventaDetalleUpdated.getCabeceraVenta() : null));			

			
			return ventaDetalle;
		}
		return ventaDetalle;
	}

	@Override
	public List<VentaDetalle> listVentaDetalle() {
		return ventaDetalleRepository.findAll();
	}
	
	@Override
	public Optional<VentaDetalle> getNotaVentaDetalle(Long id) {
		VentaDetalle ventaDetalle = ventaDetalleRepository.getOne(id);
		NotaVentaDetalle nvd = new NotaVentaDetalle();
		nvd.generaNotaVenta(ventaDetalle);
		return null;
	}
	
}
