package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import es.http.service.dto.Ventas;

public interface IVentasDAO extends JpaRepository<Ventas, Integer> {

}
