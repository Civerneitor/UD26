package com.ud26.ej1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud26.ej1.dto.Proveedor;
import com.ud26.ej1.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/ud26")
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl provService;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores(){
		return provService.listarPiezas();
	}
	
	@PostMapping("/proveedor")
	public Proveedor  guardarProveedor(@RequestBody Proveedor prov) {
		return provService.guardarPieza(prov);
	}
	
	@GetMapping("/proveedor/{id}")
	public Proveedor proveedorXID(@PathVariable(name = "id") String id) {
		return provService.proveedorXID(id);
	}
	
	@PutMapping("/proveedor/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedor prov) {
		
		Proveedor prov_s = new Proveedor();
		Proveedor prov_a = new Proveedor();
		
		prov_s = provService.proveedorXID(id);
		
		prov_s.setId(prov.getId());
		prov_s.setNombre(prov.getNombre());
		
		prov_a = provService.actualizarPieza(prov_s);
				
		return prov_a;
	}
}
