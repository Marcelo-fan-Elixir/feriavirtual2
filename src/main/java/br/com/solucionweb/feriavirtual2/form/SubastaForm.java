package br.com.solucionweb.feriavirtual2.form;

import br.com.solucionweb.feriavirtual2.model.EstadoSubasta;
import br.com.solucionweb.feriavirtual2.model.Pedido;
import br.com.solucionweb.feriavirtual2.model.Subasta;
import br.com.solucionweb.feriavirtual2.model.Transporte;

public class SubastaForm {
	
	private String nomPujadorSubasta;
	private Long valorSubasta;
	private EstadoSubasta estadoSubasta;
	private Pedido pedido;
	private Transporte transporte;
	
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
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Transporte getTransporte() {
		return transporte;
	}
	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}
	public Subasta convert() {
		Subasta subasta = new Subasta();
		subasta.setNomPujadorSubasta(this.nomPujadorSubasta);
		subasta.setValorSubasta(this.valorSubasta);
		subasta.setEstadoSubasta(this.estadoSubasta);
		subasta.setPedido(this.pedido);
		subasta.setTransporte(this.transporte);
		return subasta;
	}

}
