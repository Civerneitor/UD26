package com.ud26.ej2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26.ej2.dao.IProyectoDAO;
import com.ud26.ej2.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService {

	@Autowired
	IProyectoDAO pDAO;
	@Override
	public List<Proyecto> listarCientificos() {
		// TODO Auto-generated method stub
		return pDAO.findAll();
	}

	@Override
	public Proyecto guardarProyecto(Proyecto cientifico) {
		// TODO Auto-generated method stub
		return pDAO.save(cientifico);
	}

	@Override
	public Proyecto proyectoXID(String dni) {
		// TODO Auto-generated method stub
		return pDAO.findById(dni).get();
	}

	@Override
	public Proyecto actualizarProyecto(Proyecto cientifico) {
		// TODO Auto-generated method stub
		return pDAO.save(cientifico);
	}

	@Override
	public void borrarProyecto(String dni) {
		pDAO.deleteById(dni);
		
	}

}
