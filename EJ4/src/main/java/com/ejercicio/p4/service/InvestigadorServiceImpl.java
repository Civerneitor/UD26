package com.ejercicio.p4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejercicio.p4.dao.IInvestigadorDAO;
import com.ejercicio.p4.dto.Investigador;
@Service
public class InvestigadorServiceImpl implements IInvestigadorService {

	@Autowired
	IInvestigadorDAO iInvestigadorDAO;
	
	@Override
	public List<Investigador> listarInvestigadores() {
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigador guardarInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public Investigador investigadorXDNI(String dni) {
		return iInvestigadorDAO.findById(dni).get();
	}

	@Override
	public Investigador actualizarInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(String dni) {
		iInvestigadorDAO.deleteById(dni);
	}

}
