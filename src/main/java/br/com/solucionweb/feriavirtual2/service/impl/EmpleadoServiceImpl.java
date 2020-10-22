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
		return empleadoRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<Empleado> deleteEmpleado(Long id) {
		Optional<Empleado> empleado = empleadoRepository.findById(id);
		if (empleado.isPresent()) {
			empleadoRepository.deleteById(id);
			return empleado;
		}
		return empleado;
	}

	@Override
	@Transactional
	public Optional<Empleado> updateEmpleado(Long id, EmpleadoForm empleadoForm) {
		Optional<Empleado> empleado = empleadoRepository.findById(id);
		if(empleado.isPresent()) {
			Empleado empleadoUpdated = empleadoRepository.getOne(id);
			empleadoUpdated.setRutEmpleado(empleadoForm.getRutEmpleado() != null? empleadoForm.getRutEmpleado() :
				(empleadoUpdated.getRutEmpleado() != null? empleadoUpdated.getRutEmpleado() : null));
			
			empleadoUpdated.setDvEmpleado(empleadoForm.getDvEmpleado() != null? empleadoForm.getDvEmpleado() :
				(empleadoUpdated.getDvEmpleado() != null? empleadoUpdated.getDvEmpleado() : null));
			
			empleadoUpdated.setNombreEmpleado(empleadoForm.getNombreEmpleado() != null? empleadoForm.getNombreEmpleado() :
				(empleadoUpdated.getNombreEmpleado() != null? empleadoUpdated.getNombreEmpleado() : null));
			
			empleadoUpdated.setApellidoEmpleado(empleadoForm.getApellidoEmpleado() != null? empleadoForm.getApellidoEmpleado() :
				(empleadoUpdated.getApellidoEmpleado() != null? empleadoUpdated.getApellidoEmpleado() : null));
			
			empleadoUpdated.setFechaEmpleado(empleadoForm.getFechaEmpleado() != null? empleadoForm.getFechaEmpleado() :
				(empleadoUpdated.getFechaEmpleado() != null? empleadoUpdated.getFechaEmpleado() : null));
			
			empleadoUpdated.setDireccionEmpleado(empleadoForm.getDireccionEmpleado() != null? empleadoForm.getDireccionEmpleado() :
				(empleadoUpdated.getDireccionEmpleado() != null? empleadoUpdated.getDireccionEmpleado() : null));
			
			empleadoUpdated.setTelefonoEmpleado(empleadoForm.getTelefonoEmpleado() != null? empleadoForm.getTelefonoEmpleado() :
				(empleadoUpdated.getTelefonoEmpleado() != null? empleadoUpdated.getTelefonoEmpleado() : null));
			
			empleadoUpdated.setEmailEmpleado(empleadoForm.getEmailEmpleado() != null? empleadoForm.getEmailEmpleado() :
				(empleadoUpdated.getEmailEmpleado() != null? empleadoUpdated.getEmailEmpleado() : null));
			
			empleadoUpdated.setTipoEmpleado(empleadoForm.getTipoEmpleado() != null? empleadoForm.getTipoEmpleado() :
				(empleadoUpdated.getTipoEmpleado() != null? empleadoUpdated.getTipoEmpleado() : null));
			
			empleadoUpdated.setSexo(empleadoForm.getSexo() != null? empleadoForm.getSexo() :
				(empleadoUpdated.getSexo() != null? empleadoUpdated.getSexo() : null));
			
			empleadoUpdated.setComuna(empleadoForm.getComuna() != null? empleadoForm.getComuna() :
				(empleadoUpdated.getComuna() != null? empleadoUpdated.getComuna() : null));

			return empleado;
		}
		return empleado;
	}

	@Override
	public List<Empleado> listEmpleado() {
		return empleadoRepository.findAll();
	}

}
