package com.ejercicio.p4.controller;

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

import com.ejercicio.p4.dto.Equipo;
import com.ejercicio.p4.service.EquipoServiceImpl;

@RestController
@RequestMapping("/investigadores")
public class EquipoController {
	
	
	@Autowired
	EquipoServiceImpl equipoServiceImpl;
	
	@GetMapping("/equipos")
	public List<Equipo> listarEquipo(){
		return equipoServiceImpl.listarEquipos();
	}
	
	
	@PostMapping("/equipos")
	public Equipo salvarCurso(@RequestBody Equipo equipo) {
		return equipoServiceImpl.guardarEquipo(equipo);
	}
	
	
	@GetMapping("/equipos/{numSerie}")
	public Equipo equipoXNUMS(@PathVariable(name="numSerie") String numSerie) {
		
		Equipo equipo_xnumS= new Equipo();
		
		equipo_xnumS=equipoServiceImpl.equipoXNUMS(numSerie);
		
		System.out.println("Equipo XNUMS: "+equipo_xnumS);
		
		return equipo_xnumS;
	}
	
	@PutMapping("/Equipo/{numSerie}")
	public Equipo actualizarEquipo(@PathVariable(name="numSerie")String numSerie,@RequestBody Equipo equipo) {
		
		Equipo equipo_seleccionado= new Equipo();
		Equipo equipo_actualizado= new Equipo();
		
		equipo_seleccionado= equipoServiceImpl.equipoXNUMS(numSerie);
		
		equipo_seleccionado.setNumSerie(equipo.getNumSerie());
		equipo_seleccionado.setNombre(equipo.getNombre());;
		equipo_seleccionado.setFacultad_fk(equipo.getFacultad_fk());
		
		equipo_actualizado = equipoServiceImpl.actualizarEquipo(equipo_seleccionado);
		
		System.out.println("El equipo actualizado es: "+ equipo_actualizado);
		
		return equipo_actualizado;
	}
	
	@DeleteMapping("/equipos/{numSerie}")
	public void eliminarEquipo(@PathVariable(name="numSerie")String numSerie) {
		equipoServiceImpl.eliminarEquipo(numSerie);
	}

}
