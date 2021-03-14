package es.http.service.service;

import java.util.List;

import es.http.service.dto.Ventas;

public interface IVentasService {

	//Metodos del CRUD
		public List<Ventas> listarVentas(); //Listar All 
		
		public Ventas guardarVenta(Ventas venta);	//Guarda un Venta CREATE
		
		public Ventas ventaXID(int id); //Leer datos de un Venta READ
		
		public Ventas actualizarVenta(Ventas venta); //Actualiza datos del Venta UPDATE
		
		public void eliminarVenta(int id);// Elimina el Venta DELETE
	
}


