package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.MaquinasRegistradoras;


public interface IMaquinasRegistradorasDAO extends JpaRepository<MaquinasRegistradoras, Integer>{
	
}
