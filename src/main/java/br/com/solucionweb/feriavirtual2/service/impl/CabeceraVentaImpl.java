package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.CabeceraVentaForm;
import br.com.solucionweb.feriavirtual2.model.CabeceraVenta;
import br.com.solucionweb.feriavirtual2.repository.CabeceraVentaRepository;
import br.com.solucionweb.feriavirtual2.service.CabeceraVentaService;

@Service
public class CabeceraVentaImpl implements CabeceraVentaService {

	@Autowired
	private CabeceraVentaRepository cabeceraVentaRepository;
	
	@Override
	@Transactional
	public CabeceraVenta saveCabeceraVenta(CabeceraVentaForm cabeceraVentaForm) {
		return cabeceraVentaRepository.save(cabeceraVentaForm.Convert());
	}

	@Override
	public Optional<CabeceraVenta> getCabeceraVenta(Long id) {
		return cabeceraVentaRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<CabeceraVenta> deleteCabeceraVenta(Long id) {
		Optional<CabeceraVenta> cabeceraVenta = cabeceraVentaRepository.findById(id);
		if (cabeceraVenta.isPresent()) {
			cabeceraVentaRepository.deleteById(id);
			return cabeceraVenta;
		}
		return cabeceraVenta;
	}
	
	@Override
	@Transactional
	public Optional<CabeceraVenta> updateCabeceraVenta(Long id, CabeceraVentaForm cabeceraVentaForm) {
		Optional<CabeceraVenta> cabeceraVenta = cabeceraVentaRepository.findById(id);
		if(cabeceraVenta.isPresent()) {

			CabeceraVenta cabeceraVentaUpdated = cabeceraVentaRepository.getOne(id);
			cabeceraVentaUpdated.setDescripcionCabeceraVenta(cabeceraVentaForm.getDescripcionCabeceraVenta() != null? cabeceraVentaForm.getDescripcionCabeceraVenta() :
				(cabeceraVentaUpdated.getDescripcionCabeceraVenta() != null? cabeceraVentaUpdated.getDescripcionCabeceraVenta() : null));
			
			cabeceraVentaUpdated.setFechaVenta(cabeceraVentaForm.getFechaVenta() != null? cabeceraVentaForm.getFechaVenta() :
				(cabeceraVentaUpdated.getFechaVenta() != null? cabeceraVentaUpdated.getFechaVenta() : null));
			
			cabeceraVentaUpdated.setPedido(cabeceraVentaForm.getPedido() != null? cabeceraVentaForm.getPedido() :
				(cabeceraVentaUpdated.getPedido() != null? cabeceraVentaUpdated.getPedido() : null));	
			
			cabeceraVentaUpdated.setTipoVenta(cabeceraVentaForm.getTipoVenta() != null? cabeceraVentaForm.getTipoVenta() :
				(cabeceraVentaUpdated.getTipoVenta() != null? cabeceraVentaUpdated.getTipoVenta() : null));	
			
			cabeceraVentaUpdated.setUsuario(cabeceraVentaForm.getUsuario() != null? cabeceraVentaForm.getUsuario() :
				(cabeceraVentaUpdated.getUsuario() != null? cabeceraVentaUpdated.getUsuario() : null));
			
			return cabeceraVenta;
		}
		return cabeceraVenta;
	}
	
	@Override
	public List<CabeceraVenta> listCabeceraVenta() {
		return cabeceraVentaRepository.findAll();
	}

}
