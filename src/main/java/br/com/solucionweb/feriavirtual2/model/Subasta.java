package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "SUBASTA")
@NamedQuery(name="Subasta.findAll", query="SELECT s FROM Subasta s")
public class Subasta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SUBASTA")
	private Long idSubasta;

	@Column(name="NOM_PUJADOR_SUBASTA")
	private String nomPujadorSubasta;

	@Column(name="VALOR_SUBASTA")
	private Long valorSubasta;

	@ManyToOne
	@JoinColumn(name="ID_ESTADO_SUBASTA")
	private EstadoSubasta estadoSubasta;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ID_ESTADO_PEDIDO", referencedColumnName="ID_ESTADO_PEDIDO"),
		@JoinColumn(name="ID_PEDIDO", referencedColumnName="ID_PEDIDO")
		})
	private Pedido pedido;

	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="ID_ESTADO_TRANSPORTE", referencedColumnName="ID_ESTADO_TRANSPORTE"),
		@JoinColumn(name="ID_TIPO_TRANSPORTE", referencedColumnName="ID_TIPO_TRANSPORTE"),
		@JoinColumn(name="ID_TRANSPORTE", referencedColumnName="ID_TRANSPORTE")
		})
	private Transporte transporte;

	public Subasta() {
	}
	
	
	public Long getIdSubasta() {
		return idSubasta;
	}


	public void setIdSubasta(Long idSubasta) {
		this.idSubasta = idSubasta;
	}


	public String getNomPujadorSubasta() {
		return this.nomPujadorSubasta;
	}

	public void setNomPujadorSubasta(String nomPujadorSubasta) {
		this.nomPujadorSubasta = nomPujadorSubasta;
	}

	public Long getValorSubasta() {
		return this.valorSubasta;
	}

	public void setValorSubasta(Long valorSubasta) {
		this.valorSubasta = valorSubasta;
	}

	public EstadoSubasta getEstadoSubasta() {
		return this.estadoSubasta;
	}

	public void setEstadoSubasta(EstadoSubasta estadoSubasta) {
		this.estadoSubasta = estadoSubasta;
	}

	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Transporte getTransporte() {
		return this.transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

}

