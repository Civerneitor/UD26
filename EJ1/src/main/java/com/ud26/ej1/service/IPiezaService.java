package com.ud26.ej1.service;

import java.util.List;

import com.ud26.ej1.dto.Pieza;

public interface IPiezaService {
	
	public List<Pieza> listarPiezas();
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza piezaXID(int id);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void borrarPieza(int id);
}
