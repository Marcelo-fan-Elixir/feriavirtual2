package br.com.solucionweb.feriavirtual2.form;

import br.com.solucionweb.feriavirtual2.model.EstadoSubasta;
import br.com.solucionweb.feriavirtual2.model.Subasta;

public class SubastaForm {
	
	private String nomPujadorSubasta;
	private Long valorSubasta;
	private EstadoSubasta estadoSubasta;
	
	public String getNomPujadorSubasta() {
		return nomPujadorSubasta;
	}
	public void setNomPujadorSubasta(String nomPujadorSubasta) {
		this.nomPujadorSubasta = nomPujadorSubasta;
	}
	public Long getValorSubasta() {
		return valorSubasta;
	}
	public void setValorSubasta(Long valorSubasta) {
		this.valorSubasta = valorSubasta;
	}
	public EstadoSubasta getEstadoSubasta() {
		return estadoSubasta;
	}
	public void setEstadoSubasta(EstadoSubasta estadoSubasta) {
		this.estadoSubasta = estadoSubasta;
	}
	
	public Subasta convert() {
		Subasta subasta = new Subasta();
		subasta.setNomPujadorSubasta(this.nomPujadorSubasta);
		subasta.setValorSubasta(this.valorSubasta);
		subasta.setEstadoSubasta(this.estadoSubasta);
		return subasta;
	}

}
