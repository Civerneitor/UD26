package com.ud26.ej1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "piezasProveedor")
public class RegistroTienda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "idPieza")
	private Pieza pieza;
	
	@ManyToOne
	@JoinColumn(name = "idProveedor")
	private Proveedor proveedor;
	
	@Column(name = "precio")
	private int precio;

	public RegistroTienda(int id, Pieza pieza, Proveedor proveedor, int precio) {
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	public RegistroTienda() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
}
