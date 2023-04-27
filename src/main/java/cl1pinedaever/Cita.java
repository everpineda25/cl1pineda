package cl1pinedaever;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the citas database table.
 * 
 */
@Entity
@Table(name="citas")
@NamedQuery(name="Cita.findAll", query="SELECT c FROM Cita c")
public class Cita implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cita")
	private int idCita;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_cita")
	private Date fechaCita;

	@Column(name="id_doctor")
	private int idDoctor;

	@Column(name="nom_paciente_cita")
	private String nomPacienteCita;

	@Column(name="num_cita")
	private String numCita;

	//bi-directional one-to-one association to Doctor
	@OneToOne(mappedBy="cita")
	private Doctor doctor;

	public Cita() {
	}

	public int getIdCita() {
		return this.idCita;
	}

	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}

	public Date getFechaCita() {
		return this.fechaCita;
	}

	public void setFechaCita(Date fechaCita) {
		this.fechaCita = fechaCita;
	}

	public int getIdDoctor() {
		return this.idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getNomPacienteCita() {
		return this.nomPacienteCita;
	}

	public void setNomPacienteCita(String nomPacienteCita) {
		this.nomPacienteCita = nomPacienteCita;
	}

	public String getNumCita() {
		return this.numCita;
	}

	public void setNumCita(String numCita) {
		this.numCita = numCita;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}