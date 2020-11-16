package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.CabeceraCompraForm;
import br.com.solucionweb.feriavirtual2.model.CabeceraCompra;
import br.com.solucionweb.feriavirtual2.repository.CabeceraCompraRepository;
import br.com.solucionweb.feriavirtual2.service.CabeceraCompraService;

@Service
public class CabeceraCompraServiceImpl implements CabeceraCompraService{

	@Autowired
	private CabeceraCompraRepository cabeceraCompraRepository;
	
	@Override
	@Transactional
	public CabeceraCompra saveCabeceraCompra(CabeceraCompraForm cabeceraCompraForm) {
		return cabeceraCompraRepository.save(cabeceraCompraForm.convert());
	}

	@Override
	public Optional<CabeceraCompra> getCabeceraCompra(Long id) {
		return cabeceraCompraRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<CabeceraCompra> deleteCabeceraCompra(Long id) {
		Optional<CabeceraCompra> cabeceraCompra = cabeceraCompraRepository.findById(id);
		if (cabeceraCompra.isPresent()) {
			cabeceraCompraRepository.deleteById(id);
			return cabeceraCompra;
		}
		return cabeceraCompra;
	}

	@Override
	@Transactional
	public Optional<CabeceraCompra> updateCabeceraCompra(Long id, CabeceraCompraForm cabeceraCompraForm) {
		Optional<CabeceraCompra> cabeceraCompra = cabeceraCompraRepository.findById(id);
		if (cabeceraCompra.isPresent()) {
			CabeceraCompra cabeceraCompraUpdated = cabeceraCompraRepository.getOne(id);
			cabeceraCompraUpdated.setDescripcionCabeceraCompra(cabeceraCompraForm.getDescripcionCabeceraCompra() != null? cabeceraCompraForm.getDescripcionCabeceraCompra() :
				(cabeceraCompraUpdated.getDescripcionCabeceraCompra() != null? cabeceraCompraUpdated.getDescripcionCabeceraCompra() : null));
			
			cabeceraCompraUpdated.setFechaCabeceraCompra(cabeceraCompraForm.getFechaCabeceraCompra() != null? cabeceraCompraForm.getFechaCabeceraCompra() :
				(cabeceraCompraUpdated.getFechaCabeceraCompra() != null? cabeceraCompraUpdated.getFechaCabeceraCompra() : null));
			
			cabeceraCompraUpdated.setUsuario(cabeceraCompraForm.getUsuario() != null? cabeceraCompraForm.getUsuario() :
				(cabeceraCompraUpdated.getUsuario() != null? cabeceraCompraUpdated.getUsuario() : null));
			return cabeceraCompra;
		}
		return cabeceraCompra;
	}

	@Override
	public List<CabeceraCompra> listCabeceraCompra() {
		return cabeceraCompraRepository.findAll();
	}
	
	

}