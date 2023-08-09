package com.bolsaideas.springboot.springboot.form.app.editors;

import com.bolsaideas.springboot.springboot.form.app.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.PropertiesEditor;
import org.springframework.stereotype.Component;

@Component
public class RolesEditor extends PropertiesEditor {
	@Autowired
	private RoleService service;

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			Integer id = Integer.parseInt(text);
			setValue(service.obtenerPorId(id));
		} catch (NumberFormatException e) {
			setValue(null);
		}
	}
}
