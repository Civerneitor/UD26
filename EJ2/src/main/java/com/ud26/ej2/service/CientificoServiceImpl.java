package com.ud26.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26.ej2.dao.ICientificoDAO;
import com.ud26.ej2.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService{
	 @Autowired
	 ICientificoDAO cDAO;

	@Override
	public List<Cientifico> listarCientificos() {
		
		return cDAO.findAll();
	}

	@Override
	public Cientifico guardarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return cDAO.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(String dni) {
		// TODO Auto-generated method stub
		return cDAO.findById(dni).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		// TODO Auto-generated method stub
		return cDAO.save(cientifico);
	}

	@Override
	public void borrarCientifico(String dni) {
		cDAO.deleteById(dni);
		
	}
}
