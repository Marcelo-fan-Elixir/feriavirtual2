package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.CabeceraCompraForm;
import br.com.solucionweb.feriavirtual2.model.CabeceraCompra;

public interface CabeceraCompraService {
	
	public CabeceraCompra saveCabeceraCompra(CabeceraCompraForm cabeceraCompraForm);
	
	public Optional<CabeceraCompra> getCabeceraCompra(Long id);

	public Optional<CabeceraCompra> deleteCabeceraCompra(Long id);
	
	public Optional<CabeceraCompra> updateCabeceraCompra(Long id, CabeceraCompraForm cabeceraCompraForm);
	
	public List<CabeceraCompra> listCabeceraCompra();
	
}
