package com.ud26.ej2.controller;

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


import com.ud26.ej2.dto.CientificoProyecto;
import com.ud26.ej2.service.CientificoProyectoServiceImpl;

@RestController
@RequestMapping("/ud26")
public class CientificoProyectoController {
	@Autowired
	CientificoProyectoServiceImpl cpService;
	
	@GetMapping("/asignados")
	public List<CientificoProyecto> listarPiezas(){
		return cpService.listarCientificos();
	}
	
	@PostMapping("/asignado")
	public CientificoProyecto guardarPieza(@RequestBody CientificoProyecto cientifico) {
		return cpService.guardarCientificoProyecto(cientifico);
	}
	
	@GetMapping("/asignado/{dni}")
	public CientificoProyecto piezaXID(@PathVariable(name = "dni") int id) {
		return cpService.cientificoProyectoXID(id);
	}
	
	@PutMapping("/asignado/{dni}")
	public CientificoProyecto actualizarPieza(@PathVariable(name = "dni") int id, @RequestBody CientificoProyecto cientifico) {
		
		CientificoProyecto cp_s = new CientificoProyecto();
		CientificoProyecto cp_a = new CientificoProyecto();
		
		cp_s = cpService.cientificoProyectoXID(id);
		
		cp_s.setCientifico(cientifico.getCientifico());
		cp_s.setProyecto(cientifico.getProyecto());
	
		
		cp_a = cpService.actualizarCientificoProyecto(cp_s);
		
		return cp_a;
	}
	
	@DeleteMapping("/asignado/{dni}")
	public void borrarPieza(@PathVariable(name = "dni") int dni) {
		cpService.borrarCientificoProyecto(dni);
	}
}
