package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Productos;


public interface IProductosDAO extends JpaRepository<Productos, Integer>{
	
}
