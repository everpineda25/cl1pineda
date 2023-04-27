package cl1pinedaever;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the doctor database table.
 * 
 */
@Entity
@NamedQuery(name="Doctor.findAll", query="SELECT d FROM Doctor d")
public class Doctor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_doctor")
	private int idDoctor;

	@Column(name="especialidad_doctor")
	private String especialidadDoctor;

	@Column(name="nom_doctor")
	private String nomDoctor;

	//bi-directional one-to-one association to Cita
	@OneToOne
	@JoinColumn(name="id_doctor")
	private Cita cita;

	public Doctor() {
	}

	public int getIdDoctor() {
		return this.idDoctor;
	}

	public void setIdDoctor(int idDoctor) {
		this.idDoctor = idDoctor;
	}

	public String getEspecialidadDoctor() {
		return this.especialidadDoctor;
	}

	public void setEspecialidadDoctor(String especialidadDoctor) {
		this.especialidadDoctor = especialidadDoctor;
	}

	public String getNomDoctor() {
		return this.nomDoctor;
	}

	public void setNomDoctor(String nomDoctor) {
		this.nomDoctor = nomDoctor;
	}

	public Cita getCita() {
		return this.cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

}