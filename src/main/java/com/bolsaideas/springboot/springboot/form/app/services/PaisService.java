package com.bolsaideas.springboot.springboot.form.app.services;

import com.bolsaideas.springboot.springboot.form.app.models.domain.Pais;

import java.util.List;

public interface PaisService {

	public List<Pais> listar();
	public Pais obtenerPorId(Integer id);
}
