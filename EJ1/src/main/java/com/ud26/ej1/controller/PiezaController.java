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


import com.ud26.ej1.dto.Pieza;
import com.ud26.ej1.service.PiezaServiceImpl;

@RestController
@RequestMapping("/ud26")
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaService;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaService.listarPiezas();
	}
	
	@PostMapping("/pieza")
	public Pieza guardarPieza(@RequestBody Pieza pieza) {
		return piezaService.guardarPieza(pieza);
	}
	
	@GetMapping("/pieza/{id}")
	public Pieza piezaXID(@PathVariable(name = "id") int id) {
		return piezaService.piezaXID(id);
	}
	
	@PutMapping("/pieza/{id}")
	public Pieza actualizarPieza(@PathVariable(name = "id") int id, @RequestBody Pieza pieza) {
		
		Pieza pieza_s = new Pieza();
		Pieza pieza_a = new Pieza();
		
		pieza_s = piezaService.piezaXID(id);
		
		pieza_s.setNombre(pieza.getNombre());
		
		pieza_a = piezaService.actualizarPieza(pieza_s);
		
		return pieza_a;
	}
	
	@DeleteMapping("/pieza/{id}")
	public void borrarPieza(@PathVariable(name = "id") int id) {
		piezaService.borrarPieza(id);
	}
}
