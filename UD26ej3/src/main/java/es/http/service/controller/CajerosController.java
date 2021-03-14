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

import es.http.service.dto.Cajeros;
import es.http.service.service.CajerosServiceImpl;

@RestController
@RequestMapping("/api")
public class CajerosController {
	
	@Autowired
	CajerosServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajeros> listarCajeros(){
		return cajeroServiceImpl.listarCajeros();
	}
	
	
	@PostMapping("/cajeros")
	public Cajeros salvarCajero(@RequestBody Cajeros cajero) {
		
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	
	@GetMapping("/cajeros/{codigo}")
	public Cajeros cajeroXID(@PathVariable(name="codigo") int id) {
		
		Cajeros Cajero_xid= new Cajeros();
		
		Cajero_xid=cajeroServiceImpl.cajeroXID(id);
		
		System.out.println("Cajero XID: "+Cajero_xid);
		
		return Cajero_xid;
	}
	
	@PutMapping("/cajeros/{codigo}")
	public Cajeros actualizarCajero(@PathVariable(name="codigo")int id,@RequestBody Cajeros cajero) {
		
		Cajeros Cajero_seleccionado= new Cajeros();
		Cajeros Cajero_actualizado= new Cajeros();
		
		Cajero_seleccionado= cajeroServiceImpl.cajeroXID(id);
		
		Cajero_seleccionado.setNom_apels(cajero.getNom_apels());
		
		
		Cajero_actualizado = cajeroServiceImpl.actualizarCajero(Cajero_seleccionado);
		
		System.out.println("El Cajero actualizado es: "+ Cajero_actualizado);
		
		return Cajero_actualizado;
	}
	
	@DeleteMapping("/cajeros/{codigo}")
	public void eliminarCajero(@PathVariable(name="codigo")int id) {
		cajeroServiceImpl.eliminarCajero(id);
	}
	
	
}
