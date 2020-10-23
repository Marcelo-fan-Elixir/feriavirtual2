package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.SubastaForm;
import br.com.solucionweb.feriavirtual2.model.Subasta;

public interface SubastaService {
	
public Subasta saveSubasta(SubastaForm subastaForm);
	
	public Optional<Subasta> getSubasta(Long id);

	public Optional<Subasta> deleteSubasta(Long id);
	
	public Optional<Subasta> updateSubasta(Long id, SubastaForm subastaForm);
	
	public List<Subasta> listSubasta();
	
}
