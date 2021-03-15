package com.ud26.ej2.service;

import java.util.List;

import com.ud26.ej2.dto.CientificoProyecto;

public interface ICientificoProyectoService {
	public List<CientificoProyecto> listarCientificos();
	
	public CientificoProyecto guardarCientificoProyecto(CientificoProyecto cientifico);
	
	public CientificoProyecto cientificoProyectoXID(int id);
	
	public CientificoProyecto actualizarCientificoProyecto(CientificoProyecto cientifico);
	
	public void borrarCientificoProyecto(int id);
}
