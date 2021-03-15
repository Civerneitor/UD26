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
@Table(name = "proyectos")
public class Proyecto {
	
	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "horas")
	private int horas;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<CientificoProyecto> asignadoA;
	
	public Proyecto() {
		
	}

	public Proyecto(String id, String nombre, int horas, List<CientificoProyecto> asignadoA) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignadoA = asignadoA;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
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
