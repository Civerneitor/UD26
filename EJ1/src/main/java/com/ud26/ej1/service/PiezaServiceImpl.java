package com.ud26.ej1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26.ej1.dao.IPiezaDAO;
import com.ud26.ej1.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {

	@Autowired
	IPiezaDAO piezaDAO;
	
	@Override
	public List<Pieza> listarPiezas() {
	
		return piezaDAO.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		
		return piezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		
		return piezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		
		return piezaDAO.save(pieza);
	}

	@Override
	public void borrarPieza(int id) {
		piezaDAO.deleteById(id);
		
	}

}
