package com.ud26.ej1.service;

import java.util.List;

import com.ud26.ej1.dto.Proveedor;



public interface IProveedorService {
	
	public List<Proveedor> listarPiezas();
	
	public Proveedor guardarPieza(Proveedor prov);
	
	public Proveedor proveedorXID(String id);
	
	public Proveedor actualizarPieza(Proveedor prov);
	
	public void borrarPieza(String id);
}
