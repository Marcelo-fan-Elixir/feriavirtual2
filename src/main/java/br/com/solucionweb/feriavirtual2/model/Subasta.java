package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name="SUBASTA")
@NamedQuery(name="Subasta.findAll", query="SELECT s FROM Subasta s")
public class Subasta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
	@SequenceGenerator(sequenceName = "subasta_seq", allocationSize = 1, name = "USER_SEQ")
	@Column(name="ID_SUBASTA")
	private long idSubasta;

	@Column(name="NOM_PUJADOR_SUBASTA")
	private String nomPujadorSubasta;

	@Column(name="VALOR_SUBASTA")
	private Long valorSubasta;

	@ManyToOne
	@JoinColumn(name="ID_ESTADO_SUBASTA")
	private EstadoSubasta estadoSubasta;

	@ManyToOne
	@JoinColumn(name="ID_PEDIDO")
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name="ID_TRANSPORTE")
	private Transporte transporte;

	public Subasta() {
	}

	public long getIdSubasta() {
		return this.idSubasta;
	}

	public void setIdSubasta(long idSubasta) {
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

