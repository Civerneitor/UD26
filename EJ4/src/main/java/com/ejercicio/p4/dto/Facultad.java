package com.ejercicio.p4.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Facultades")
public class Facultad {
	
	
	//Atributos de la entidad Facultades
	@Id
	@Column(name="codigo")
	private int codigo;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="dni")
	private List<Investigador> investigador;
	
	@OneToMany
	@JoinColumn(name="numSerie")
	private List<Equipo> equipo;
	
	//Constructores
	public Facultad() {}
	
	public Facultad(int codigo, String nombre, List<Investigador> investigador,List<Equipo> equipo) {
		this.codigo=codigo;
		this.nombre=nombre;
		this.investigador=investigador;
		this.equipo=equipo;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the investigador
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public List<Investigador> getInvestigador() {
		return investigador;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = investigador;
	}

	/**
	 * @return the equipo
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipo> getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}
	
	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Registro Facultad [Codigo= "+codigo+", nombre= "+nombre+" , investigador= "+investigador+
				", equipo= "+equipo+"]";
	}
	
	
}
