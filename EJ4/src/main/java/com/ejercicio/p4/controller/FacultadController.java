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

import com.ejercicio.p4.dto.Facultad;
import com.ejercicio.p4.service.FacultadServiceImpl;

@RestController
@RequestMapping("/investigadores")
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/facultad")
	public List<Facultad> listarFacultades(){
		return facultadServiceImpl.listarFacultades();
	}
	
	
	@PostMapping("/facultad")
	public Facultad salvarFacultad(@RequestBody Facultad facultad) {
		return facultadServiceImpl.guardarFacultad(facultad);
	}
	
	
	@GetMapping("/facultad/{codigo}")
	public Facultad facultadXCOD(@PathVariable(name="codigo") int codigo) {
		
		Facultad facultad_xcod= new Facultad();
		
		facultad_xcod=facultadServiceImpl.facultadXCOD(codigo);
		
		System.out.println("Facultad XCOD: "+facultad_xcod);
		
		return facultad_xcod;
	}
	
	@PutMapping("/facultad/{codigo}")
	public Facultad actualizarFacultad(@PathVariable(name="codigo") int codigo,@RequestBody Facultad facultad) {
		
		Facultad facultad_seleccionado= new Facultad();
		Facultad facultad_actualizado= new Facultad();
		
		facultad_seleccionado= facultadServiceImpl.facultadXCOD(codigo);
		
		facultad_seleccionado.setNombre(facultad.getNombre());

		
		facultad_actualizado = facultadServiceImpl.actualizarFacultad(facultad_seleccionado);
		
		System.out.println("El equipo actualizado es: "+ facultad_actualizado);
		
		return facultad_actualizado;
	}
	
	
	@DeleteMapping("/facultad/{codigo}")
	public void eliminarFacultad(@PathVariable(name="codigo") int codigo) {
		facultadServiceImpl.eliminarFacultad(codigo);
	}
	
}
