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
@Table(name="maquinas_registradoras")//en caso que la tabala sea diferente
public class MaquinasRegistradoras {

	//Atributos de entidad registro_curso
	@Id
	@Column(name="codigo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int codigo;
	@Column(name = "piso")//no hace falta si se llama igual
	private int piso;
	
	@OneToMany
	@JoinColumn(name = "codigo")
	private List<Ventas> ventas;
	//Constructores
	
	public MaquinasRegistradoras() {
	
	}

	public MaquinasRegistradoras(int codigo, int piso) {
		super();
		this.codigo = codigo;
		this.piso = piso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Ventas")
	public List<Ventas> getVentas() {
		return ventas;
	}

	public void setVentas(List<Ventas> ventas) {
		this.ventas = ventas;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
}
