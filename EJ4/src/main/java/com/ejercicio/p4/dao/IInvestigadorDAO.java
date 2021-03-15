package com.ejercicio.p4.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio.p4.dto.Investigador;

public interface IInvestigadorDAO extends JpaRepository<Investigador, String> {

}
