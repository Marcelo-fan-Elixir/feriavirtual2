package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.model.Pais;
import br.com.solucionweb.feriavirtual2.repository.PaisRepository;
import br.com.solucionweb.feriavirtual2.service.PaisService;

@Service
public class PaisServiceImpl implements PaisService{

	@Autowired
	private PaisRepository paisRepository;
	
	@Override
	public List<Pais> listPais() {
		return paisRepository.findAll();
	}
	
	

}
