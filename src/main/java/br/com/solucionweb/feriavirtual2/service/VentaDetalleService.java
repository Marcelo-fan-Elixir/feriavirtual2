package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.VentaDetalleForm;
import br.com.solucionweb.feriavirtual2.model.VentaDetalle;

public interface VentaDetalleService {

	public VentaDetalle saveVentaDetalle(VentaDetalleForm ventaDetalleForm);

	public Optional<VentaDetalle> getVentaDetalle(Long id);

	public Optional<VentaDetalle> deleteVentaDetalle(Long id);
	
	public Optional<VentaDetalle> updateVentaDetalle(Long id, VentaDetalleForm ventaDetalleForm);
	
	public List<VentaDetalle> listVentaDetalle();
	
	public Optional<VentaDetalle> getNotaVentaDetalle(Long id);
	
}
