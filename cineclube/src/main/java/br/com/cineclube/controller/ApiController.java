package br.com.cineclube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import br.com.cineclube.dao.FilmeRepository;
import br.com.cineclube.model.Filme;

@RestController
public class ApiController {

	@Autowired
	private FilmeRepository daoFilme;
	
	//endpoints
	// GET /filmes/{id}
	@GetMapping("/api/filme/{id}")
	public Filme getFilme(@PathVariable Long id) {
		return daoFilme.getById(id);
	}
	
}
