package es.http.service.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ventas")//en caso que la tabala sea diferente
public class Ventas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "cajero")
    Cajeros cajero;
 
    @ManyToOne
    @JoinColumn(name = "producto")
    Productos producto;
    
    @ManyToOne
    @JoinColumn(name = "maquina")
    MaquinasRegistradoras maquina;

	public Ventas() {
		super();
	}

	public Ventas(Cajeros cajeros, Productos productos, MaquinasRegistradoras maquinas_registradoras) {
		super();
		this.cajero = cajeros;
		this.producto = productos;
		this.maquina = maquinas_registradoras;
	}

	public Cajeros getCajeros() {
		return cajero;
	}

	public void setCajeros(Cajeros cajeros) {
		this.cajero = cajeros;
	}

	public Productos getProductos() {
		return producto;
	}

	public void setProductos(Productos productos) {
		this.producto = productos;
	}

	public MaquinasRegistradoras getMaquinas_registradoras() {
		return maquina;
	}

	public void setMaquinas_registradoras(MaquinasRegistradoras maquinas_registradoras) {
		this.maquina = maquinas_registradoras;
	}
	
    
}
