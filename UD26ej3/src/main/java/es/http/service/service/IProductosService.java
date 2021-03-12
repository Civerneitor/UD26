package es.http.service.service;

import java.util.List;

import es.http.service.dto.Productos;

public interface IProductosService {

	//Metodos del CRUD
		public List<Productos> listarProductos(); //Listar All 
		
		public Productos guardarProducto(Productos producto);	//Guarda un Producto CREATE
		
		public Productos productoXID(int id); //Leer datos de un Producto READ
		
		public Productos actualizarProducto(Productos producto); //Actualiza datos del producto UPDATE
		
		public void eliminarProducto(int id);// Elimina el producto DELETE
	
}


