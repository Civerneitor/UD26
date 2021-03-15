package es.http.service.dto;


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
@Table(name="cajeros")//en caso que la tabala sea diferente
public class Cajeros {

	//Atributos de entidad curso
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int codigo;
	@Column(name = "nom_apels")//no hace falta si se llama igual //si falla cambiar '_a' por 'A'
	private String nom_apels;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Ventas> ventas;
	
	
	
	public Cajeros() {
		super();
	}
	public Cajeros(int codigo, String nom_apels) {
		super();
		this.codigo = codigo;
		this.nom_apels = nom_apels;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNom_apels() {
		return nom_apels;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "Ventas")
	public List<Ventas> getVentas() {
		return ventas;
	}
	public void setVentas(List<Ventas> ventas) {
		this.ventas = ventas;
	}
	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
	}
	@Override
	public String toString() {
		return "Cajeros [codigo=" + codigo + ", nom_apels=" + nom_apels + "]";
	}



	
	
	
}
