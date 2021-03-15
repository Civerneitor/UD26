package com.ud26.ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26.ej1.dao.IRegistroTiendaDAO;
import com.ud26.ej1.dto.RegistroTienda;

@Service
public class RegistroTiendaServiceImpl implements IRegistroTiendaService {

	@Autowired
	IRegistroTiendaDAO regTiendaDAO;

	@Override
	public List<RegistroTienda> listarPiezas() {
		
		return regTiendaDAO.findAll();
	}

	@Override
	public RegistroTienda guardarPieza(RegistroTienda regTienda) {
		
		return regTiendaDAO.save(regTienda);
	}

	@Override
	public RegistroTienda piezaXID(int id) {
		
		return regTiendaDAO.findById(id).get();
	}

	@Override
	public RegistroTienda actualizarPieza(RegistroTienda regTienda) {
		
		return regTiendaDAO.save(regTienda);
	}

	@Override
	public void borrarPieza(int id) {
		regTiendaDAO.deleteById(id);
		
	}
}
