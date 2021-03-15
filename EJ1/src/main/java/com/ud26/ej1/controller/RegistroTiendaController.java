package com.ud26.ej1.controller;

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

import com.ud26.ej1.dto.RegistroTienda;
import com.ud26.ej1.service.RegistroTiendaServiceImpl;

@RestController
@RequestMapping("/ud26")
public class RegistroTiendaController {

	@Autowired
	RegistroTiendaServiceImpl regTiendaService;
	
	@GetMapping("/registros")
	public List<RegistroTienda> listarRegistros(){
		return regTiendaService.listarPiezas();
	}
	
	@PostMapping("/registro")
	public RegistroTienda guardarRegistro(@RequestBody RegistroTienda regTienda) {
		return regTiendaService.guardarPieza(regTienda);
	}
	
	@GetMapping("/registro/{id}")
	public RegistroTienda registroXID(@PathVariable(name = "id") int id) {
		return regTiendaService.piezaXID(id);
	}
	
	@PutMapping("/registro/{id}")
	public RegistroTienda actualizarRegistro(@PathVariable(name = "id") int id, @RequestBody RegistroTienda regTienda) {
		
		RegistroTienda reg_s = new RegistroTienda();
		RegistroTienda reg_a = new RegistroTienda();
		
		reg_s = regTiendaService.piezaXID(id);
		
		reg_s.setPieza(regTienda.getPieza());
		reg_s.setProveedor(regTienda.getProveedor());
		reg_s.setPrecio(regTienda.getPrecio());
		
		reg_a = regTiendaService.actualizarPieza(reg_s);
		
		return reg_a;
	}
	
	@DeleteMapping("/registro/{id}")
	public void borrarRegistro(@PathVariable(name = "id") int id) {
		regTiendaService.borrarPieza(id);
	}
	
}
