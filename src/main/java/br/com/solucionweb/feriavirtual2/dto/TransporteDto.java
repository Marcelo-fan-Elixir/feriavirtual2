package br.com.solucionweb.feriavirtual2.dto;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.EstadoTransporte;
import br.com.solucionweb.feriavirtual2.model.TipoTransporte;
import br.com.solucionweb.feriavirtual2.model.Transporte;

public class TransporteDto {
	
	private String detalleTransporte;
	private Date fechaInicio;
	private Date fechaTermino;
	private String numeroTransporte;
	private EstadoTransporte estadoTransporte;
	private TipoTransporte tipoTransporte;
	
	public TransporteDto(Transporte transporte) {
		detalleTransporte = transporte.getDetalleTransporte();
		fechaInicio = transporte.getFechaInicio();
		fechaTermino = transporte.getFechaTermino();
		numeroTransporte = transporte.getNumeroTransporte();
		estadoTransporte = transporte.getEstadoTransporte();
		tipoTransporte = transporte.getTipoTransporte();
	}
	
	public TransporteDto() {
		
	}
	
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
	
	public List<TransporteDto> convertToList(List<Transporte> listTransporte) {
		return listTransporte.stream().map(TransporteDto::new).collect(Collectors.toList());
	}

}
