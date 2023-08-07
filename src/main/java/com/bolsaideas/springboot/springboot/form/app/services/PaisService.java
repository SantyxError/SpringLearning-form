package com.bolsaideas.springboot.springboot.form.app.services;

import com.bolsaideas.springboot.springboot.form.app.models.domain.Pais;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaisService {

	public List<Pais> listar();

	public Pais obtenerPorId(Integer id);
}
