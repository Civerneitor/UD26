package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IVentasDAO;
import es.http.service.dto.Ventas;

@Service
public class VentasServiceImpl implements IVentasService {
	
	@Autowired
	IVentasDAO iVentaDAO;

	@Override
	public List<Ventas> listarVentas() {
		return iVentaDAO.findAll();
	}

	@Override
	public Ventas guardarVenta(Ventas curso) {
		return iVentaDAO.save(curso);
	}

	@Override
	public Ventas ventaXID(int id) {
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Ventas actualizarVenta(Ventas curso) {
		return iVentaDAO.save(curso);
	}

	@Override
	public void eliminarVenta(int id) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void eliminarVenta(int id) {
		iVentaDAO.deleteById(id);
	}

	@Override
	public List<Ventas> listarVentas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ventas guardarVenta(Ventas venta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ventas actualizarVenta(Ventas venta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarVenta(int id) {
		// TODO Auto-generated method stub
		
	}*/

}
