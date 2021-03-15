package com.ud26.ej1.dto;

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
@Table(name = "proveedores")
public class Proveedor {

	@Id
	@Column(name = "id")
	private String id;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "id")
	private List<RegistroTienda> registroTienda;

	public Proveedor() {
	}

	public Proveedor(String id, String nombre, List<RegistroTienda> registroTienda) {
		this.id = id;
		this.nombre = nombre;
		this.registroTienda = registroTienda;
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
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "RegistroTienda")
	public List<RegistroTienda> getRegistroTienda() {
		return registroTienda;
	}

	public void setRegistroTienda(List<RegistroTienda> registroTienda) {
		this.registroTienda = registroTienda;
	}
	
	
}
