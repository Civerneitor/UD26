package com.ejercicio.p4.service;

import java.util.List;

import com.ejercicio.p4.dto.Investigador;

public interface IInvestigadorService {
	// Metodos del CRUD
	public List<Investigador> listarInvestigadores(); // Listar All

	public Investigador guardarInvestigador(Investigador investigador); // Guarda un Investigador CREATE

	public Investigador investigadorXDNI(String dni); // Leer datos de un Investigador READ

	public Investigador actualizarInvestigador(Investigador investigador); // Actualiza datos del Investigador UPDATE

	public void eliminarInvestigador(String dni);// Elimina el Investigador DELETE

}
