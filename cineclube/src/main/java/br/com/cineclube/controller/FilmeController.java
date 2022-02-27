package br.com.cineclube.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cineclube.dao.FilmeRepository;
import br.com.cineclube.model.Category;
import br.com.cineclube.model.Filme;

//anotaçao para servlet

@Controller
@RequestMapping("/filmes")
public class FilmeController {
	
	@Autowired
	private FilmeRepository dao;

	//http://localhost:8080/filmes/save
	@PostMapping("/save")
	public String save(@Valid Filme filme, BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("categories", Category.values());
			return "filmes/manter.html";
		}
		dao.save(filme);
		return "redirect:/filmes/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Filme> filmeList = dao.findAll();
		model.addAttribute("filmeList", filmeList);
		return "filmes/list.html";
	}

	
	@RequestMapping("/new")
	public String newForm(Model model) {
		//objeto filme será mapeado ao ${filme} na view
		Filme filme = new Filme();
		model.addAttribute("filme", filme);
		
		//criar lista de categorias
		model.addAttribute("categories", Category.values());
		
		return "filmes/manter.html";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete (Model model, 
			@PathVariable Long id) {
		dao.deleteById(id);
		return "redirect:/filmes/list";
	}
	
	@RequestMapping("/update/{id}")
	public String update (Model model,
			@PathVariable Long id) {
		model.addAttribute("filme", dao.getById(id));
		model.addAttribute("categories", Category.values());
		return "filmes/manter.html";
	}
	
	@PostMapping("/updatesave")
	public String updatesave(@Valid Filme filme, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			model.addAttribute("categories", Category.values());
			return "filmes/manter.html";
		}
		dao.save(filme);
		return "redirect:/filmes/list";
	}
	
}
