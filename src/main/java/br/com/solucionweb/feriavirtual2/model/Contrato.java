package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the CONTRATO database table.
 * 
 */
@Entity
@Table(name = "CONTRATO")
//@NamedQuery(name="Contrato.findAll", query="SELECT c FROM Contrato c")
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONT_SEQ")
    @SequenceGenerator(sequenceName = "contrato_seq", allocationSize = 1, name = "CONT_SEQ")
	private Long idContrato;

	@Column(name="ID_TIPO_CONTRATO", insertable=false, updatable=false)
	private Long idTipoContrato;
	
	@Column(name="DESCRIPCION_CONTRATO")
	private String descripcionContrato;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_INICIO2")
	private Date fechaInicio2;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_MODIFICACION")
	private Date fechaModificacion;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_TERMINO")
	private Date fechaTermino;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_TERMINO2")
	private Date fechaTermino2;

	@Lob
	@Column(name="PDF_CONTRATO")
	private byte[] pdfContrato;

	@ManyToOne
	@JoinColumn(name="ID_TIPO_CONTRATO")
	private TipoContrato tipoContrato;

	@ManyToOne
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;

	public Contrato() {
	}

	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	public Long getIdTipoContrato() {
		return idTipoContrato;
	}

	public void setIdTipoContrato(Long idTipoContrato) {
		this.idTipoContrato = idTipoContrato;
	}
	
	public String getDescripcionContrato() {
		return this.descripcionContrato;
	}

	public void setDescripcionContrato(String descripcionContrato) {
		this.descripcionContrato = descripcionContrato;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaInicio2() {
		return this.fechaInicio2;
	}

	public void setFechaInicio2(Date fechaInicio2) {
		this.fechaInicio2 = fechaInicio2;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public Date getFechaTermino() {
		return this.fechaTermino;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Date getFechaTermino2() {
		return this.fechaTermino2;
	}

	public void setFechaTermino2(Date fechaTermino2) {
		this.fechaTermino2 = fechaTermino2;
	}

	public byte[] getPdfContrato() {
		return this.pdfContrato;
	}

	public void setPdfContrato(byte[] pdfContrato) {
		this.pdfContrato = pdfContrato;
	}

	public TipoContrato getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
