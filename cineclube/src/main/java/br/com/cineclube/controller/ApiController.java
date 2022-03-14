package br.com.cineclube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.cineclube.dao.FilmeRepository;
import br.com.cineclube.dao.PessoaRepository;
import br.com.cineclube.model.Filme;
import br.com.cineclube.model.Pessoa;

@RestController
public class ApiController {

	@Autowired
	private FilmeRepository daoFilme;
	@Autowired
	private PessoaRepository daoPessoa;
	
	//endpoints
	//FILME
	@GetMapping("/api/filme/{id}")
	public Filme getFilme(@PathVariable Long id) {
		return daoFilme.getById(id);
	}
	

	@GetMapping(value = "/api/filmes")
	public Iterable<Filme> getFilmes(){
		return daoFilme.findAll();
	}
	
	@PostMapping("/api/filme")
	public Filme postfilme(@RequestBody Filme filme) {
		daoFilme.save(filme);
		return filme;
	}
	
	@DeleteMapping("/api/filme/{id}")
	void deleteFilme(@PathVariable Long id) {
		daoFilme.deleteById(id);
	}
	
	@PutMapping("/api/filme/{id}")
	ResponseEntity<Filme> putFilme(@PathVariable Long id,
			@RequestBody Filme filme){
		Filme f = daoFilme.save(filme);
		if(f!=null) {
			return new ResponseEntity<>(filme, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(filme, HttpStatus.OK);
	}
	
	//PESSOA
	@GetMapping("/api/pessoa/{id}")
	public Pessoa getPessoa(@PathVariable Long id) {
		return daoPessoa.getById(id);
	}
	
	@GetMapping(value = "/api/pessoas")
	public Iterable<Pessoa> getPessoas(){
		return daoPessoa.findAll();
	}
	
	@PostMapping("/api/pessoa")
	public Pessoa postPessoa(@RequestBody Pessoa pessoa) {
		daoPessoa.save(pessoa);
		return pessoa;
	}
	
	@DeleteMapping("/api/pessoa/{id}")
	void deletePessoa(@PathVariable Long id) {
		daoPessoa.deleteById(id);
	}
	
	//O responseentity retorna os resultados da requisição, como 200, 201 500 etc
	@PutMapping("/api/pessoa/{id}")
	ResponseEntity<Pessoa> putPessoa(@PathVariable Long id,
			@RequestBody Pessoa pessoa){
		Pessoa p = daoPessoa.save(pessoa);
		if(p!=null) {
			return new ResponseEntity<>(pessoa, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(pessoa, HttpStatus.OK);
	}
		
	
}
