package com.ejercicio.p4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.p4.dao.IEquipoDAO;
import com.ejercicio.p4.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	IEquipoDAO iEquipoDAO;
	
	@Override
	public List<Equipo> listarEquipos() {
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo guardarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo equipoXNUMS(String numSerie) {
		return iEquipoDAO.findById(numSerie).get();
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(String numSerie) {
		iEquipoDAO.deleteById(numSerie);
	}

}
