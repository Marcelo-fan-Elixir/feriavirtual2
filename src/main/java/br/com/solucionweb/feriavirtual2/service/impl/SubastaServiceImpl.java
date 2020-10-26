package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.solucionweb.feriavirtual2.form.SubastaForm;
import br.com.solucionweb.feriavirtual2.model.Subasta;
import br.com.solucionweb.feriavirtual2.repository.SubastaRepository;
import br.com.solucionweb.feriavirtual2.service.SubastaService;

public class SubastaServiceImpl  implements SubastaService{

	@Autowired
	private SubastaRepository subastaRepository;
	
	@Override
	public Subasta saveSubasta(SubastaForm subastaForm) {
		return subastaRepository.save(subastaForm.convert());
	}

	@Override
	public Optional<Subasta> getSubasta(Long id) {
		return subastaRepository.findById(id);
	}

	@Override
	public Optional<Subasta> deleteSubasta(Long id) {
		Optional<Subasta> subasta = subastaRepository.findById(id);
		if (subasta.isPresent()) {
			subastaRepository.deleteById(id);
			return subasta;
		}
		return subasta;
	}

	@Override
	public Optional<Subasta> updateSubasta(Long id, SubastaForm subastaForm) {
		Optional<Subasta> subasta = subastaRepository.findById(id);
		if (subasta.isPresent()) {
			Subasta subastaUpdated = subastaRepository.getOne(id);
			
			subastaUpdated.setNomPujadorSubasta(subastaForm.getNomPujadorSubasta() != null? subastaForm.getNomPujadorSubasta() :
				(subastaUpdated.getNomPujadorSubasta() != null? subastaUpdated.getNomPujadorSubasta() : null));
			
			subastaUpdated.setValorSubasta(subastaForm.getValorSubasta() != null? subastaForm.getValorSubasta() :
				(subastaUpdated.getValorSubasta() != null? subastaUpdated.getValorSubasta() : null));
			
			subastaUpdated.setEstadoSubasta(subastaForm.getEstadoSubasta() != null? subastaForm.getEstadoSubasta() :
				(subastaUpdated.getEstadoSubasta() != null? subastaUpdated.getEstadoSubasta() : null));
			
			return subasta;
		}
		return subasta;
	}

	@Override
	public List<Subasta> listSubasta() {
		return subastaRepository.findAll();
	}
	
	

}
