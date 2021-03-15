package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IMaquinasRegistradorasDAO;
import es.http.service.dto.MaquinasRegistradoras;

@Service
public class MaquinasRegistradorasServiceImpl implements IMaquinasRegistradorasService {
	
	@Autowired
	IMaquinasRegistradorasDAO iMaquinaRegistradoraDAO;

	@Override
	public List<MaquinasRegistradoras> listarMaquinasRegistradoras() {
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinasRegistradoras guardarMaquinaRegistradora(MaquinasRegistradoras curso) {
		return iMaquinaRegistradoraDAO.save(curso);
	}

	@Override
	public MaquinasRegistradoras maquinaRegistradoraXID(int id) {
		return iMaquinaRegistradoraDAO.findById(id).get();
	}

	@Override
	public MaquinasRegistradoras actualizarMaquinaRegistradora(MaquinasRegistradoras curso) {
		return iMaquinaRegistradoraDAO.save(curso);
	}

	@Override
	public void eliminarMaquinaRegistradora(int id) {
		// TODO Auto-generated method stub
		
	}

	/*@Override
	public void eliminarMaquinaRegistradora(int id) {
		iMaquinaRegistradoraDAO.deleteById(id);
	}

	@Override
	public List<MaquinasRegistradoras> listarMaquinasRegistradoras() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MaquinasRegistradoras guardarMaquinaRegistradora(MaquinasRegistradoras maquinaRegistradora) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MaquinasRegistradoras actualizarMaquinaRegistradora(MaquinasRegistradoras maquinaRegistradora) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarMaquinaRegistradora(int id) {
		// TODO Auto-generated method stub
		
	}*/

}
