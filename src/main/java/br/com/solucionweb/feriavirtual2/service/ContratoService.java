package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.ContratoForm;
import br.com.solucionweb.feriavirtual2.model.Contrato;

public interface ContratoService {
	
	public Contrato saveContrato(ContratoForm contratoForm);

	Optional<Contrato> getContrato(Long id);

	public Optional<Contrato> deleteContrato(Long id);
	
	public Optional<Contrato> updateContrato(Long id, ContratoForm contratoForm);
	
	public List<Contrato> listContrato();

}
