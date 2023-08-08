package com.bolsaideas.springboot.springboot.form.app.services;

import com.bolsaideas.springboot.springboot.form.app.models.domain.Role;

import java.util.List;

public interface RoleService {
	public List<Role> listar();
	public Role obtenerPorId(Integer id);
}
