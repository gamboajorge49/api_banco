package com.jorge.banco.resource;

import com.jorge.banco.model.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jorge.banco.repository.AgenciaRepotitory;

@RestController
@RequestMapping(value = "/api")
public class GlobalResource {

	@Autowired
	AgenciaRepotitory agenciaRepotitory;

	@GetMapping("/agencias")
	public List<Agencia> listarAgencias() {
		return this.agenciaRepotitory.findAll();
	}

	
	
	
	
}
