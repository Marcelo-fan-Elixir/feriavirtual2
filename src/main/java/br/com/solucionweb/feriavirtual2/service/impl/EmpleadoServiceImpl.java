package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.EmpleadoForm;
import br.com.solucionweb.feriavirtual2.model.Empleado;
import br.com.solucionweb.feriavirtual2.repository.EmpleadoRepository;
import br.com.solucionweb.feriavirtual2.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	@Transactional
	public Empleado saveEmpleado(EmpleadoForm empleadoForm) {
		return empleadoRepository.save(empleadoForm.convert());
	}

	@Override
	public Optional<Empleado> getEmpleado(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Optional<Empleado> deleteEmpleado(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Optional<Empleado> updateEmpleado(Long id, EmpleadoForm empleadoForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> listEmpleado() {
		return empleadoRepository.findAll();
	}

}
