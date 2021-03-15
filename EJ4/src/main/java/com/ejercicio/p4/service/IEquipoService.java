package com.ejercicio.p4.service;

import java.util.List;

import com.ejercicio.p4.dto.Equipo;

public interface IEquipoService {
	
	// Metodos del CRUD
	public List<Equipo> listarEquipos(); // Listar All

	public Equipo guardarEquipo(Equipo equipo); // Guarda un Equipo CREATE

	public Equipo equipoXNUMS(String numSerie); // Leer datos de un Equipo READ

	public Equipo actualizarEquipo(Equipo equipo); // Actualiza datos del Equipo UPDATE

	public void eliminarEquipo(String numSerie);// Elimina el Equipo DELETE

}
