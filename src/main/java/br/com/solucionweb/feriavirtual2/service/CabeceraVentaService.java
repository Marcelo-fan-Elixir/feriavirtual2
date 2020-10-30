package br.com.solucionweb.feriavirtual2.service;

import java.util.List;
import java.util.Optional;

import br.com.solucionweb.feriavirtual2.form.CabeceraVentaForm;
import br.com.solucionweb.feriavirtual2.model.CabeceraVenta;

public interface CabeceraVentaService {
	
	public CabeceraVenta saveCabeceraVenta(CabeceraVentaForm cabeceraVentaForm);

	public Optional<CabeceraVenta> getCabeceraVenta(Long id);

	public Optional<CabeceraVenta> deleteCabeceraVenta(Long id);

	public Optional<CabeceraVenta> updateCabeceraVenta(Long id, CabeceraVentaForm cabeceraVentaForm);

	public List<CabeceraVenta> listCabeceraVenta();

}
