package com.ud26.ej1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud26.ej1.dto.RegistroTienda;

public interface IRegistroTiendaDAO extends JpaRepository<RegistroTienda, Integer> {

}
