package br.com.solucionweb.feriavirtual2.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.solucionweb.feriavirtual2.model.EstadoSubasta;
import br.com.solucionweb.feriavirtual2.model.Pedido;
import br.com.solucionweb.feriavirtual2.model.Subasta;
import br.com.solucionweb.feriavirtual2.model.Transporte;

public class SubastaDto {
	
	private String nomPujadorSubasta;
	private Long valorSubasta;
	private EstadoSubasta estadoSubasta;
	private Pedido pedido;
	private Transporte transporte;
	
	public SubastaDto(Subasta subasta) {
		nomPujadorSubasta = subasta.getNomPujadorSubasta();
		valorSubasta = subasta.getValorSubasta();
		estadoSubasta = subasta.getEstadoSubasta();
		pedido = subasta.getPedido();
		transporte = subasta.getTransporte();
	}
	
	public SubastaDto() {
		
	}
	
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

	public List<SubastaDto> convertToList(List<Subasta> listSubasta) {
		return listSubasta.stream().map(SubastaDto::new).collect(Collectors.toList());
	}
	
}
