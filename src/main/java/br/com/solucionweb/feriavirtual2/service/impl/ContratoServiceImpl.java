package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.ContratoForm;
import br.com.solucionweb.feriavirtual2.model.Contrato;
import br.com.solucionweb.feriavirtual2.repository.ContratoRepository;
import br.com.solucionweb.feriavirtual2.service.ContratoService;

@Service
public class ContratoServiceImpl implements ContratoService{

	@Autowired
	public ContratoRepository contratoRepository;

	@Override
	@Transactional
	public Contrato saveContrato(ContratoForm contratoForm) {
		return contratoRepository.save(contratoForm.convert());
	}

	@Override
	public Optional<Contrato> getContrato(Long id) {
		return contratoRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<Contrato> deleteContrato(Long id) {
		Optional<Contrato> contrato = contratoRepository.findById(id);
		if (contrato.isPresent()) {
			contratoRepository.deleteById(id);
			return contrato;
		}
		return contrato;
	}

	@Override
	@Transactional
	public Optional<Contrato> updateContrato(Long id, ContratoForm contratoForm) {
		Optional<Contrato> contrato = contratoRepository.findById(id);
		if(contrato.isPresent()) {
			Contrato contratoUpdated = contratoRepository.getOne(id);
			contratoUpdated.setDescripcionContrato(contratoForm.getDescripcionContrato() != null? contratoForm.getDescripcionContrato() :
				(contratoUpdated.getDescripcionContrato() != null? contratoUpdated.getDescripcionContrato() : null));
			
			contratoUpdated.setPdfContrato(contratoForm.getPdfContrato() != null? contratoForm.getPdfContrato() :
				(contratoUpdated.getPdfContrato() != null? contratoUpdated.getPdfContrato() : null));
			
			contratoUpdated.setFechaInicio(contratoForm.getFechaInicio() != null? contratoForm.getFechaInicio() :
				(contratoUpdated.getFechaInicio() != null? contratoUpdated.getFechaInicio() : null));
			
			contratoUpdated.setFechaFin(contratoForm.getFechaFin() != null? contratoForm.getFechaFin() :
				(contratoUpdated.getFechaFin() != null? contratoUpdated.getFechaFin() : null));
			
			return contrato;
		}
		return contrato;
	}

	@Override
	public List<Contrato> listContrato() {
		return contratoRepository.findAll();
	}
	
}