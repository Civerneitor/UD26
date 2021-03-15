package com.ud26.ej2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud26.ej2.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, String> {

}
