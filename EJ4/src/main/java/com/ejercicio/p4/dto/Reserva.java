package com.ejercicio.p4.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Reservas")
public class Reserva {
	
	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="investigadorDni")
	private Investigador investigador;
	
	@ManyToOne
	@JoinColumn(name="equipoNumSerie")
	private Equipo equipo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date comienzo;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fin;
	
	//Constructores
	public Reserva() {}
	
	public Reserva(int id,Investigador investigador,Equipo equipo,Date comienzo,Date fin) {
		this.id=id;
		this.investigador=investigador;
		this.equipo=equipo;
		this.comienzo=comienzo;
		this.fin=fin;
	}
	
	//Getter y Setter
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the investigador
	 */
	public Investigador getInvestigador() {
		return investigador;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	/**
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	/**
	 * @return the comienzo
	 */
	public Date getComienzo() {
		return comienzo;
	}

	/**
	 * @param comienzo the comienzo to set
	 */
	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	/**
	 * @return the fin
	 */
	public Date getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(Date fin) {
		this.fin = fin;
	}
	
	
	public String toString() {
		return "Registro Reserva [id= "+id+", investigador= "+investigador+", equipo= "+equipo+
				", fecha comienzo= "+comienzo+", fehca fin= "+fin+"]";
	}
}
