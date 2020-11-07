package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.TransporteForm;
import br.com.solucionweb.feriavirtual2.model.Transporte;

public interface TransporteService {
	
	public Transporte saveTransporte(TransporteForm transporteForm);
	
	public Optional<Transporte> getTransporte(Long id);

	public Optional<Transporte> deleteTransporte(Long id);
	
	public Optional<Transporte> updateTransporte(Long id, TransporteForm transporteForm);
	
	public List<Transporte> listTransporte();

}
