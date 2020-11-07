package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.TransporteForm;
import br.com.solucionweb.feriavirtual2.model.Transporte;
import br.com.solucionweb.feriavirtual2.repository.TransporteRepository;
import br.com.solucionweb.feriavirtual2.service.TransporteService;

@Service
public class TransporteServiceImpl implements TransporteService{

	@Autowired
	private TransporteRepository transporteRepository;
	
	@Override
	@Transactional
	public Transporte saveTransporte(TransporteForm transporteForm) {
		return transporteRepository.save(transporteForm.convert());
	}

	@Override
	public Optional<Transporte> getTransporte(Long id) {
		return transporteRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<Transporte> deleteTransporte(Long id) {
		Optional<Transporte> transporte = transporteRepository.findById(id);
		if (transporte.isPresent()) {
			transporteRepository.deleteById(id);
			return transporte;
		}
		return transporte;
	}

	@Override
	@Transactional
	public Optional<Transporte> updateTransporte(Long id, TransporteForm transporteForm) {
		Optional<Transporte> transporte = transporteRepository.findById(id);
		if (transporte.isPresent()) {
			Transporte transporteUpdated = transporteRepository.getOne(id);
			
			transporteUpdated.setDetalleTransporte(transporteForm.getDetalleTransporte() != null? transporteForm.getDetalleTransporte() :
				(transporteUpdated.getDetalleTransporte() != null? transporteUpdated.getDetalleTransporte() : null));
			
			transporteUpdated.setFechaInicio(transporteForm.getFechaInicio() != null? transporteForm.getFechaInicio() :
				(transporteUpdated.getFechaInicio() != null? transporteUpdated.getFechaInicio() : null));
			
			transporteUpdated.setFechaTermino(transporteForm.getFechaTermino() != null? transporteForm.getFechaTermino() :
				(transporteUpdated.getFechaTermino() != null? transporteUpdated.getFechaTermino() : null));
			
			transporteUpdated.setTipoTransporte(transporteForm.getTipoTransporte() != null? transporteForm.getTipoTransporte() :
				(transporteUpdated.getTipoTransporte() != null? transporteUpdated.getTipoTransporte() : null));
			
			transporteUpdated.setEstadoTransporte(transporteForm.getEstadoTransporte() != null? transporteForm.getEstadoTransporte() :
				(transporteUpdated.getEstadoTransporte() != null? transporteUpdated.getEstadoTransporte() : null));
			
			transporteUpdated.setNumeroTransporte(transporteForm.getNumeroTransporte() != null? transporteForm.getNumeroTransporte() :
				(transporteUpdated.getNumeroTransporte() != null? transporteUpdated.getNumeroTransporte() : null));
			
			return transporte;
		}
		return transporte;
	}

	@Override
	public List<Transporte> listTransporte() {
		return transporteRepository.findAll();
	}

}
