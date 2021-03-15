package com.ejercicio.p4.service;

import java.util.List;

import com.ejercicio.p4.dto.Facultad;

public interface IFacultadService {
	
	//Metodos del CRUD
	public List<Facultad> listarFacultades(); //Listar All 
			
	public Facultad guardarFacultad(Facultad facultad);	//Guarda un Facultad CREATE
			
	public Facultad facultadXCOD(int codigo); //Leer datos de un Facultad READ
			
	public Facultad actualizarFacultad(Facultad facultad); //Actualiza datos del Facultad UPDATE
			
	public void eliminarFacultad(int codigo);// Elimina el Facultad DELETE

}
