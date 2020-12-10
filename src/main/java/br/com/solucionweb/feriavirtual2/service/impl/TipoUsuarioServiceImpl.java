package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.model.TipoUsuario;
import br.com.solucionweb.feriavirtual2.repository.TipoUsuarioRepository;
import br.com.solucionweb.feriavirtual2.service.TipoUsuarioService;

@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService{

	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;
	
	@Override
	public List<TipoUsuario> listTipoUsuario() {
		return tipoUsuarioRepository.findAll();
	}

}
