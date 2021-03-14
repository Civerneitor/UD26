package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Ventas;
import es.http.service.service.VentasServiceImpl;

@RestController
@RequestMapping("/api")
public class VentasController {
	
	@Autowired
	VentasServiceImpl ventaServiceImpl;
	
	@GetMapping("/ventas")
	public List<Ventas> listarVentas(){
		return ventaServiceImpl.listarVentas();
	}
	
	
	@PostMapping("/ventas")
	public Ventas salvarVenta(@RequestBody Ventas venta) {
		
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	
	@GetMapping("/ventas/{id}")
	public Ventas VentaXID(@PathVariable(name="id") int id) {
		
		Ventas Venta_xid= new Ventas();
		
		Venta_xid=ventaServiceImpl.ventaXID(id);
		
		System.out.println("Venta XID: "+Venta_xid);
		
		return Venta_xid;
	}
	
	@PutMapping("/ventas/{id}")
	public Ventas actualizarVenta(@PathVariable(name="id")int id,@RequestBody Ventas Venta) {
		
		Ventas Venta_seleccionado= new Ventas();
		Ventas Venta_actualizado= new Ventas();
		
		Venta_seleccionado= ventaServiceImpl.ventaXID(id);
		
		
		Venta_seleccionado.setCajeros(Venta.getCajeros());
		Venta_seleccionado.setProductos(Venta.getProductos());
		Venta_seleccionado.setMaquinas_registradoras(Venta.getMaquinas_registradoras());
		
		Venta_actualizado = ventaServiceImpl.actualizarVenta(Venta_seleccionado);
		
		System.out.println("El Venta actualizado es: "+ Venta_actualizado);
		
		return Venta_actualizado;
	}
	
	@DeleteMapping("/ventas/{id}")
	public void eleiminarVenta(@PathVariable(name="id")int id) {
		ventaServiceImpl.eliminarVenta(id);
	}
	
	
}
