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

import com.ejercicio.p4.dto.Reserva;
import com.ejercicio.p4.service.ReservaServiceImpl;

@RestController
@RequestMapping("/investigadores")
public class ReservaController {
	
	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@GetMapping("/reserva")
	public List<Reserva> listarReserva(){
		return reservaServiceImpl.listarReservas();
	}
	
	
	@PostMapping("/reserva")
	public Reserva salvarReserva(@RequestBody Reserva reserva) {
		
		return reservaServiceImpl.guardarReserva(reserva);
	}
	
	
	@GetMapping("/reserva/{id}")
	public Reserva ReservaXID(@PathVariable(name="id") int id) {
		
		Reserva reserva_xid= new Reserva();
		
		reserva_xid=reservaServiceImpl.reservaXID(id);
		
		System.out.println("Reserva XID: "+reserva_xid);
		
		return reserva_xid;
	}
	
	@PutMapping("/reserva/{id}")
	public Reserva actualizarReserva(@PathVariable(name="id")int id,@RequestBody Reserva reserva) {
		
		Reserva reserva_seleccionado= new Reserva();
		Reserva reserva_actualizada= new Reserva();
		
		reserva_seleccionado= reservaServiceImpl.reservaXID(id);
		
		reserva_seleccionado.setInvestigador(reserva.getInvestigador());
		reserva_seleccionado.setEquipo(reserva.getEquipo());
		reserva_seleccionado.setComienzo(reserva.getComienzo());
		reserva_seleccionado.setFin(reserva.getFin());
		
		reserva_actualizada = reservaServiceImpl.actualizarReserva(reserva_seleccionado);
		
		System.out.println("La Reserva actualizada es: "+reserva_actualizada);
		
		return reserva_actualizada;
	}
	
	@DeleteMapping("/reserva/{id}")
	public void eliminarReserva(@PathVariable(name="id")int id) {
		reservaServiceImpl.eliminarReserva(id);;
	}

}
