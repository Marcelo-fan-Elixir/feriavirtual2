package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.EmpleadoForm;
import br.com.solucionweb.feriavirtual2.model.Empleado;

public interface EmpleadoService {

	public Empleado saveEmpleado(EmpleadoForm empleadoForm);
	
	public Optional<Empleado> getEmpleado(Long id);

	public Optional<Empleado> deleteEmpleado(Long id);
	
	public Optional<Empleado> updateEmpleado(Long id, EmpleadoForm empleadoForm);
	
	public List<Empleado> listEmpleado();
}
