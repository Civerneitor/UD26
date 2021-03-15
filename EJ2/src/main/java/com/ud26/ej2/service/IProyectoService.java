package com.ud26.ej2.service;

import java.util.List;

import com.ud26.ej2.dto.Proyecto;

public interface IProyectoService {
	public List<Proyecto> listarCientificos();

	public Proyecto guardarProyecto(Proyecto cientifico);

	public Proyecto proyectoXID(String dni);

	public Proyecto actualizarProyecto(Proyecto cientifico);

	public void borrarProyecto(String dni);
}
