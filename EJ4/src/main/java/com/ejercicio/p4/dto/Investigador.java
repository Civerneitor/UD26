package com.ejercicio.p4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Investigadores")
public class Investigador {
	
	@Id
	@Column(name="dni")
	private String dni;
	
	@Column(name="nomApels")
	private String nomApels;
	
	@ManyToOne
	@JoinColumn(name="facultadFk")
	Facultad facultad_fk;
	
	@OneToMany
	@JoinColumn(name = "dni")
	private List<Reserva> reserva;
	
	//Constructores
	public Investigador() {}
	
	public Investigador(String dni,String nomApels,Facultad facultad) {
		this.dni=dni;
		this.nomApels=nomApels;
		this.facultad_fk=facultad;
	}

	
	//Getter y Setter
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	/**
	 * @return the facultad_fk
	 */
	public Facultad getFacultad_fk() {
		return facultad_fk;
	}

	/**
	 * @param facultad_fk the facultad_fk to set
	 */
	public void setFacultad_fk(Facultad facultad_fk) {
		this.facultad_fk = facultad_fk;
	}
	
	
	@Override
	public String toString() {
		return "Registro Investigador [DNI= "+dni+", nombre y apellidos= "+
				nomApels+", facultad= "+facultad_fk+"]";
	}
}
