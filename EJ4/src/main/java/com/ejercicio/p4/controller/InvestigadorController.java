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

import com.ejercicio.p4.dto.Investigador;
import com.ejercicio.p4.service.InvestigadorServiceImpl;


@RestController
@RequestMapping("/investigadores")
public class InvestigadorController {
	
	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;
	
	@GetMapping("/investigador")
	public List<Investigador> listarInvestigador(){
		return investigadorServiceImpl.listarInvestigadores();
	}
	
	
	@PostMapping("/investigador")
	public Investigador salvarInvestigador(@RequestBody Investigador investigador) {
		return investigadorServiceImpl.guardarInvestigador(investigador);
	}
	
	
	@GetMapping("/investigador/{dni}")
	public Investigador investigadorXDNI(@PathVariable(name="dni") String dni) {
		
		Investigador investigador_xdni= new Investigador();
		
		investigador_xdni=investigadorServiceImpl.investigadorXDNI(dni);
		
		System.out.println("Investigador XDNI: "+investigador_xdni);
		
		return investigador_xdni;
	}
	
	@PutMapping("/investigador/{dni}")
	public Investigador actualizarInvestigador(@PathVariable(name="dni")String dni,@RequestBody Investigador investigador) {
		
		Investigador investigador_seleccionado= new Investigador();
		Investigador investigador_actualizado= new Investigador();
		
		investigador_seleccionado= investigadorServiceImpl.investigadorXDNI(dni);
		
		investigador_seleccionado.setNomApels(investigador.getNomApels());
		investigador_seleccionado.setFacultad_fk(investigador.getFacultad_fk());;
		
		
		investigador_actualizado = investigadorServiceImpl.actualizarInvestigador(investigador_seleccionado);
		
		System.out.println("El investigador actualizado es: "+ investigador_actualizado);
		
		return investigador_actualizado;
	}
	
	@DeleteMapping("/investigador/{dni}")
	public void eliminarInvestigador(@PathVariable(name="dni")String dni) {
		investigadorServiceImpl.eliminarInvestigador(dni);
	}
}
