package com.ud26.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26.ej2.dao.ICientificoProyectoDAO;
import com.ud26.ej2.dto.CientificoProyecto;

@Service
public class CientificoProyectoServiceImpl implements ICientificoProyectoService {
	
	@Autowired
	ICientificoProyectoDAO cpDAO;
	
	@Override
	public List<CientificoProyecto> listarCientificos() {
		// TODO Auto-generated method stub
		return cpDAO.findAll();
	}

	@Override
	public CientificoProyecto guardarCientificoProyecto(CientificoProyecto cientifico) {
		// TODO Auto-generated method stub
		return cpDAO.save(cientifico);
	}

	@Override
	public CientificoProyecto cientificoProyectoXID(int id) {
		// TODO Auto-generated method stub
		return cpDAO.findById(id).get();
	}

	@Override
	public CientificoProyecto actualizarCientificoProyecto(CientificoProyecto cientifico) {
		// TODO Auto-generated method stub
		return cpDAO.save(cientifico);
	}

	@Override
	public void borrarCientificoProyecto(int id) {
		cpDAO.deleteById(id);
		
	}

}
