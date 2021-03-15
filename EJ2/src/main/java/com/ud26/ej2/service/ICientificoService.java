package com.ud26.ej2.service;

import java.util.List;

import com.ud26.ej2.dto.Cientifico;

public interface ICientificoService {

	public List<Cientifico> listarCientificos();
	
	public Cientifico guardarCientifico(Cientifico cientifico);
	
	public Cientifico cientificoXID(String dni);
	
	public Cientifico actualizarCientifico(Cientifico cientifico);
	
	public void borrarCientifico(String dni);
	
}
