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
@Table(name="Equipos")
public class Equipo {
	
	//Atributos
	@Id
	@Column(name="numSerie")
	private String numSerie;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="facultadFk")
	private Facultad facultad_fk;
	
	@OneToMany
	@JoinColumn(name = "numSerie")
	private List<Reserva> reserva;
	
	//Constructores
	public Equipo() {}
	
	public Equipo(String numSerie,String nombre, Facultad facultad) {
		this.numSerie=numSerie;
		this.nombre=nombre;
		this.facultad_fk=facultad;
	}
	
	//Getter y Setter
	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
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
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
		return "Registro Equipo [NumSerie= "+numSerie+", nombre= "+nombre+", facultad= "+facultad_fk+"]";
	}
	
}
