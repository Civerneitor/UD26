package es.http.service.controller;

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

import es.http.service.dto.Productos;
import es.http.service.service.ProductosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductosController {
	
	@Autowired
	ProductosServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Productos> listarProductos(){
		return productoServiceImpl.listarProductos();
	}
	
	
	@PostMapping("/productos")
	public Productos salvarProducto(@RequestBody Productos curso) {
		
		return productoServiceImpl.guardarProducto(curso);
	}
	
	
	@GetMapping("/productos/{codigo}")
	public Productos ProductoXID(@PathVariable(name="codigo") int id) {
		
		Productos Producto_xid= new Productos();
		
		Producto_xid=productoServiceImpl.productoXID(id);
		
		System.out.println("Producto XID: "+Producto_xid);
		
		return Producto_xid;
	}
	
	@PutMapping("/producto/{codigo}")
	public Productos actualizarProducto(@PathVariable(name="codigo")int id,@RequestBody Productos Producto) {
		
		Productos Producto_seleccionado= new Productos();
		Productos Producto_actualizado= new Productos();
		
		Producto_seleccionado= productoServiceImpl.productoXID(id);
		
		Producto_seleccionado.setNombre(Producto.getNombre());
		Producto_seleccionado.setPrecio(Producto.getPrecio());
		
		Producto_actualizado = productoServiceImpl.actualizarProducto(Producto_seleccionado);
		
		System.out.println("El Producto actualizado es: "+ Producto_actualizado);
		
		return Producto_actualizado;
	}
	
	@DeleteMapping("/producto/{codigo}")
	public void eliminarProducto(@PathVariable(name="codigo")int id) {
		productoServiceImpl.eliminarProducto(id);
	}
	
	
}
