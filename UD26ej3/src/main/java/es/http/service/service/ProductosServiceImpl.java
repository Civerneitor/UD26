package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProductosDAO;
import es.http.service.dto.Productos;

@Service
public class ProductosServiceImpl implements IProductosService {
	
	@Autowired
	IProductosDAO iProductoDAO;

	@Override
	public List<Productos> listarProductos() {
		return iProductoDAO.findAll();
	}

	@Override
	public Productos guardarProducto(Productos curso) {
		return iProductoDAO.save(curso);
	}

	@Override
	public Productos productoXID(int id) {
		return iProductoDAO.findById(id).get();
	}

	@Override
	public Productos actualizarProducto(Productos curso) {
		return iProductoDAO.save(curso);
	}

	@Override
	public void eliminarProducto(int id) {
		iProductoDAO.deleteById(id);
	}

}
