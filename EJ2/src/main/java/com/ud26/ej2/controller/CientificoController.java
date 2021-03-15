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

import com.ud26.ej2.dto.Cientifico;
import com.ud26.ej2.service.CientificoServiceImpl;

@RestController
@RequestMapping("/ud26")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cService;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listarPiezas(){
		return cService.listarCientificos();
	}
	
	@PostMapping("/cientifico")
	public Cientifico guardarPieza(@RequestBody Cientifico cientifico) {
		return cService.guardarCientifico(cientifico);
	}
	
	@GetMapping("/cientifico/{dni}")
	public Cientifico piezaXID(@PathVariable(name = "dni") String dni) {
		return cService.cientificoXID(dni);
	}
	
	@PutMapping("/cientifico/{dni}")
	public Cientifico actualizarPieza(@PathVariable(name = "dni") String dni, @RequestBody Cientifico cientifico) {
		
		Cientifico c_s = new Cientifico();
		Cientifico c_a = new Cientifico();
		
		c_s = cService.cientificoXID(dni);
		
		c_s.setDNI(cientifico.getDNI());
		c_s.setNomApels(cientifico.getNomApels());
		
		c_a = cService.actualizarCientifico(c_s);
		
		return c_a;
	}
	
	@DeleteMapping("/cientifico/{dni}")
	public void borrarPieza(@PathVariable(name = "dni") String dni) {
		cService.borrarCientifico(dni);
	}
}
