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

import com.ud26.ej2.dto.Proyecto;
import com.ud26.ej2.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/ud26")

public class ProyectoController {
	@Autowired
	ProyectoServiceImpl pService;
	
	@GetMapping("/proyectos")
	public List<Proyecto> listarPiezas(){
		return pService.listarCientificos();
	}
	
	@PostMapping("/proyecto")
	public Proyecto guardarPieza(@RequestBody Proyecto cientifico) {
		return pService.guardarProyecto(cientifico);
	}
	
	@GetMapping("/proyecto/{dni}")
	public Proyecto piezaXID(@PathVariable(name = "dni") String dni) {
		return pService.proyectoXID(dni);
	}
	
	@PutMapping("/proyecto/{dni}")
	public Proyecto actualizarPieza(@PathVariable(name = "dni") String dni, @RequestBody Proyecto cientifico) {
		
		Proyecto p_s = new Proyecto();
		Proyecto p_a = new Proyecto();
		
		p_s = pService.proyectoXID(dni);
		
		p_s.setNombre(cientifico.getNombre());
		p_s.setHoras(cientifico.getHoras());
		
		p_a = pService.actualizarProyecto(p_s);
		
		return p_a;
	}
	
	@DeleteMapping("/proyecto/{dni}")
	public void borrarPieza(@PathVariable(name = "dni") String dni) {
		pService.borrarProyecto(dni);
	}
}
