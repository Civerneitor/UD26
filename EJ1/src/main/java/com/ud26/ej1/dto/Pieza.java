package com.ud26.ej1.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "piezas")
public class Pieza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<RegistroTienda> registroTienda;
	
	

	public Pieza(int id, String nombre, List<RegistroTienda> registroTienda) {
		this.id = id;
		this.nombre = nombre;
		this.registroTienda = registroTienda;
	}



	public Pieza() {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RegistroTienda")
	public List<RegistroTienda> getRegistroTienda() {
		return registroTienda;
	}



	public void setRegistroTienda(List<RegistroTienda> registroTienda) {
		this.registroTienda = registroTienda;
	}
	
	
}
