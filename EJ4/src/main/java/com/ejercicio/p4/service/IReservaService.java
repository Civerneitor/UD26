package com.ejercicio.p4.service;

import java.util.List;

import com.ejercicio.p4.dto.Reserva;

public interface IReservaService {
	// Metodos del CRUD
	public List<Reserva> listarReservas(); // Listar All

	public Reserva guardarReserva(Reserva reserva); // Guarda un Reserva CREATE

	public Reserva reservaXID(int id); // Leer datos de un Reserva READ

	public Reserva actualizarReserva(Reserva reserva); // Actualiza datos de la Reserva UPDATE

	public void eliminarReserva(int id);// Elimina el Reserva DELETE

}
