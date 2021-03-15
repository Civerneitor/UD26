package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ICajerosDAO;
import es.http.service.dto.Cajeros;

@Service
public class CajerosServiceImpl implements ICajerosService {
	
	@Autowired
	ICajerosDAO iCajeroDAO;

	@Override
	public List<Cajeros> listarCajeros() {
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajeros guardarCajero(Cajeros cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajeros cajeroXID(int id) {
		return iCajeroDAO.findById(id).get();
	}

	@Override
	public Cajeros actualizarCajero(Cajeros cajero) {
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int id) {
		iCajeroDAO.deleteById(id);
	}

}
