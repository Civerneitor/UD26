package com.ud26.ej1.service;

import java.util.List;

import com.ud26.ej1.dto.RegistroTienda;



public interface IRegistroTiendaService {
public List<RegistroTienda> listarPiezas();
	
	public RegistroTienda guardarPieza(RegistroTienda regTienda);
	
	public RegistroTienda piezaXID(int id);
	
	public RegistroTienda actualizarPieza(RegistroTienda regTienda);
	
	public void borrarPieza(int id);
}
