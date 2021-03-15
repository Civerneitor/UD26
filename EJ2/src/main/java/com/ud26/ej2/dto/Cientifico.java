package com.ud26.ej2.dto;

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
@Table(name = "cientificos")
public class Cientifico {

	@Id
	@Column(name = "DNI")
	private String DNI;
	@Column(name = "nomApels")
	private String nomApels;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<CientificoProyecto> asignadoA;
	
	public Cientifico() {
		
	}

	public Cientifico(String dni, String nomApels, List<CientificoProyecto> asignadoA) {
		DNI = dni;
		this.nomApels = nomApels;
		this.asignadoA = asignadoA;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "CientificoProyecto")
	public List<CientificoProyecto> getAsignadoA() {
		return asignadoA;
	}

	public void setAsignadoA(List<CientificoProyecto> asignadoA) {
		this.asignadoA = asignadoA;
	}
	
	
}
