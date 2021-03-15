package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Cajeros;


public interface ICajerosDAO extends JpaRepository<Cajeros, Integer>{
	
}
