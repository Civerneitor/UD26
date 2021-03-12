package es.http.service.dto;

import java.util.Date;

import javax.persistence.Column;
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
@Table(name="maquinas_registradoras")//en caso que la tabala sea diferente
public class MaquinasRegistradoras {

	//Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int codigo;
	@Column(name = "piso")//no hace falta si se llama igual
	private int piso;
	
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

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}
}
