package br.com.solucionweb.feriavirtual2.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "EMPLEADO")
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_SEQ")
    @SequenceGenerator(sequenceName = "empleado_seq", allocationSize = 1, name = "EMP_SEQ")
	private Long idEmpleado;
	
	@Column(name="APELLIDO_EMPLEADO")
	private String apellidoEmpleado;

	@Column(name="DIRECCION_EMPLEADO")
	private String direccionEmpleado;

	@Column(name="DV_EMPLEADO")
	private String dvEmpleado;

	@Column(name="EMAIL_EMPLEADO")
	private String emailEmpleado;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_EMPLEADO")
	private Date fechaEmpleado;

	@Column(name="NOMBRE_EMPLEADO")
	private String nombreEmpleado;

	@Column(name="RUT_EMPLEADO")
	private String rutEmpleado;

	@Column(name="TELEFONO_EMPLEADO")
	private String telefonoEmpleado;

	@ManyToOne
	@JoinColumn(name="ID_COMUNA")
	private Comuna comuna;
	
	@ManyToOne
	@JoinColumn(name="ID_SEXO")
	private Sexo sexo;

	@ManyToOne
	@JoinColumn(name="ID_TIPO_EMPLEADO")
	private TipoEmpleado tipoEmpleado;

	public Empleado() {
	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
	}

	public String getDvEmpleado() {
		return dvEmpleado;
	}

	public void setDvEmpleado(String dvEmpleado) {
		this.dvEmpleado = dvEmpleado;
	}

	public String getEmailEmpleado() {
		return emailEmpleado;
	}

	public void setEmailEmpleado(String emailEmpleado) {
		this.emailEmpleado = emailEmpleado;
	}

	public Date getFechaEmpleado() {
		return fechaEmpleado;
	}

	public void setFechaEmpleado(Date fechaEmpleado) {
		this.fechaEmpleado = fechaEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getRutEmpleado() {
		return rutEmpleado;
	}

	public void setRutEmpleado(String rutEmpleado) {
		this.rutEmpleado = rutEmpleado;
	}

	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}

	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}

	public Comuna getComuna() {
		return comuna;
	}

	public void setComuna(Comuna comuna) {
		this.comuna = comuna;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public TipoEmpleado getTipoEmpleado() {
		return tipoEmpleado;
	}

	public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
}
