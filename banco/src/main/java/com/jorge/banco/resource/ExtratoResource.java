package com.jorge.banco.resource;

import java.io.Console;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jorge.banco.model.Extrato;
import com.jorge.banco.repository.ExtratoRepository;


@RestController
@RequestMapping(value = "/api")
public class ExtratoResource {
	
	@Autowired
	ExtratoRepository extratoRepository;
	
	@GetMapping("/extrato")
	public List<Extrato> listarExtrat() {
		return this.extratoRepository.findAll();
		
	}
	
	@GetMapping("/extrato/{id}")
	public List<Extrato> getExtrato(@PathVariable(value = "id") long id) {
		return this.extratoRepository.findByidConta(id);
	}

}
 