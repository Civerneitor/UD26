package com.ejercicio.p4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.p4.dao.IFacultadDAO;
import com.ejercicio.p4.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService {

	@Autowired
	IFacultadDAO iFacultadDAO;
	
	@Override
	public List<Facultad> listarFacultades() {
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultad guardarFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultad facultadXCOD(int codigo) {
		return iFacultadDAO.findById(codigo).get();
	}

	@Override
	public Facultad actualizarFacultad(Facultad facultad) {
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int codigo) {
		iFacultadDAO.deleteById(codigo);
	}

}
