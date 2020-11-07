package br.com.solucionweb.feriavirtual2.form;

import java.util.Date;

import br.com.solucionweb.feriavirtual2.model.EstadoTransporte;
import br.com.solucionweb.feriavirtual2.model.TipoTransporte;
import br.com.solucionweb.feriavirtual2.model.Transporte;

public class TransporteForm {
	
	private String detalleTransporte;
	private Date fechaInicio;
	private Date fechaTermino;
	private String numeroTransporte;
	private EstadoTransporte estadoTransporte;
	private TipoTransporte tipoTransporte;
	
	
	public String getDetalleTransporte() {
		return detalleTransporte;
	}
	public void setDetalleTransporte(String detalleTransporte) {
		this.detalleTransporte = detalleTransporte;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	public String getNumeroTransporte() {
		return numeroTransporte;
	}
	public void setNumeroTransporte(String numeroTransporte) {
		this.numeroTransporte = numeroTransporte;
	}
	public EstadoTransporte getEstadoTransporte() {
		return estadoTransporte;
	}
	public void setEstadoTransporte(EstadoTransporte estadoTransporte) {
		this.estadoTransporte = estadoTransporte;
	}
	public TipoTransporte getTipoTransporte() {
		return tipoTransporte;
	}
	public void setTipoTransporte(TipoTransporte tipoTransporte) {
		this.tipoTransporte = tipoTransporte;
	}
	
	public Transporte convert() {
		Transporte transporte = new Transporte();
		transporte.setDetalleTransporte(this.detalleTransporte);
		transporte.setFechaInicio(this.fechaInicio);
		transporte.setFechaTermino(this.fechaTermino);
		transporte.setNumeroTransporte(this.numeroTransporte);
		transporte.setEstadoTransporte(this.estadoTransporte);
		transporte.setTipoTransporte(this.tipoTransporte);
		return transporte;
	}

}
