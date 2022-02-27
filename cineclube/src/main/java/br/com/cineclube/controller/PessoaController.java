package br.com.cineclube.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cineclube.dao.PessoaRepository;
import br.com.cineclube.model.Pessoa;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {
	
	@Autowired
	private PessoaRepository dao;
	
	@RequestMapping("/new")
	public String newForm(Model model) {
		
		Pessoa pessoa = new Pessoa();
		model.addAttribute("pessoa", pessoa);
		
		return "pessoas/manter.html";
	}
	
	@PostMapping("/save")
	public String save(@Valid Pessoa pessoa, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "pessoas/manter.html";
		}
		dao.save(pessoa);
		return "redirect:/pessoas/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Pessoa> pessoaList = dao.findAll();
		model.addAttribute("pessoaList", pessoaList);
		return "pessoas/list.html";
	}

}
