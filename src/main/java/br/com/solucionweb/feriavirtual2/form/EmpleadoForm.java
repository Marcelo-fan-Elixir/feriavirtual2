package br.com.solucionweb.feriavirtual2.form;

import java.util.Date;

import br.com.solucionweb.feriavirtual2.model.Comuna;
import br.com.solucionweb.feriavirtual2.model.Empleado;
import br.com.solucionweb.feriavirtual2.model.Sexo;
import br.com.solucionweb.feriavirtual2.model.TipoEmpleado;

public class EmpleadoForm {

	private String rutEmpleado;
	private String dvEmpleado;
	private String nombreEmpleado;
	private String apellidoEmpleado;
	private Date fechaEmpleado;
	private String direccionEmpleado;
	private String telefonoEmpleado;
	private String emailEmpleado;
	private TipoEmpleado tipoEmpleado;
	private Sexo sexo;
	private Comuna comuna;
	
	public Empleado convert() {
		Empleado empleado = new Empleado();		
		empleado.setRutEmpleado(this.rutEmpleado);
		empleado.setDvEmpleado(this.dvEmpleado);
		empleado.setNombreEmpleado(this.nombreEmpleado);
		empleado.setApellidoEmpleado(this.apellidoEmpleado);
		empleado.setFechaEmpleado(this.fechaEmpleado);
		empleado.setDireccionEmpleado(this.direccionEmpleado);
		empleado.setTelefonoEmpleado(this.telefonoEmpleado);
		empleado.setEmailEmpleado(this.emailEmpleado);
		empleado.setTipoEmpleado(this.tipoEmpleado);
		empleado.setSexo(this.sexo);
		empleado.setComuna(this.comuna);
		return empleado;
	}

	public String getRutEmpleado() {
		return rutEmpleado;
	}

	public void setRutEmpleado(String rutEmpleado) {
		this.rutEmpleado = rutEmpleado;
	}

	public String getDvEmpleado() {
		return dvEmpleado;
	}

	public void setDvEmpleado(String dvEmpleado) {
		this.dvEmpleado = dvEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public Date getFechaEmpleado() {
		return fechaEmpleado;
	}

	public void setFechaEmpleado(Date fechaEmpleado) {
		this.fechaEmpleado = fechaEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}

	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}

	public String getEmailEmpleado() {
		return emailEmpleado;
	}

	public void setEmailEmpleado(String emailEmpleado) {
		this.emailEmpleado = emailEmpleado;
	}

	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}
	
}
