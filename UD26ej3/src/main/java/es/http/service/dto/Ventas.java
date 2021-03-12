package es.http.service.dto;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ventas")//en caso que la tabala sea diferente
public class Ventas {
	
	@ManyToOne
    @JoinColumn(name = "cajeros")
    Cajeros cajeros;
 
    @ManyToOne
    @JoinColumn(name = "productos")
    Productos productos;
    
    @ManyToOne
    @JoinColumn(name = "maquinas_registradoras")
    MaquinasRegistradoras maquinas_registradoras;

	public Ventas() {
		super();
	}

	public Ventas(Cajeros cajeros, Productos productos, MaquinasRegistradoras maquinas_registradoras) {
		super();
		this.cajeros = cajeros;
		this.productos = productos;
		this.maquinas_registradoras = maquinas_registradoras;
	}

	public Cajeros getCajeros() {
		return cajeros;
	}

	public void setCajeros(Cajeros cajeros) {
		this.cajeros = cajeros;
	}

	public Productos getProductos() {
		return productos;
	}

	public void setProductos(Productos productos) {
		this.productos = productos;
	}

	public MaquinasRegistradoras getMaquinas_registradoras() {
		return maquinas_registradoras;
	}

	public void setMaquinas_registradoras(MaquinasRegistradoras maquinas_registradoras) {
		this.maquinas_registradoras = maquinas_registradoras;
	}
	
    
}
