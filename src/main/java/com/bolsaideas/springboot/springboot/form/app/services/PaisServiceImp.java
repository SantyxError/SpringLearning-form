package com.bolsaideas.springboot.springboot.form.app.services;

import com.bolsaideas.springboot.springboot.form.app.models.domain.Pais;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PaisServiceImp implements PaisService {

	private final List<Pais> lista;

	public PaisServiceImp() {
		this.lista = Arrays.asList(
				new Pais(1, "ES", "España"),
				new Pais(2, "MX", "Mexico"),
				new Pais(3, "CL", "Chile"),
				new Pais(4, "AR", "Argentina"),
				new Pais(5, "PE", "Perú"),
				new Pais(6, "CO", "Colombia"),
				new Pais(7, "VE", "Venezuela"));
	}

	@Override public List<Pais> listar() {
		return lista;
	}

	@Override public Pais obtenerPorId(Integer id) {
		Pais resultado = null;
		for (Pais pais : this.lista) {
			if (id == pais.getId()) {
				resultado = pais;
				break;
			}
		}
		return resultado;
	}
}
