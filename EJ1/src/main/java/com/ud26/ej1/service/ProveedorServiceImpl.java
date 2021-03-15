package com.ud26.ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26.ej1.dao.IProveedorDAO;
import com.ud26.ej1.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	IProveedorDAO provDAO;

	@Override
	public List<Proveedor> listarPiezas() {
		
		return provDAO.findAll();
	}

	@Override
	public Proveedor guardarPieza(Proveedor prov) {
		
		return provDAO.save(prov);
	}

	@Override
	public Proveedor proveedorXID(String id) {
		
		return provDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarPieza(Proveedor prov) {
		
		return provDAO.save(prov);
	}

	@Override
	public void borrarPieza(String id) {
		provDAO.deleteById(id);
		
	}
}
