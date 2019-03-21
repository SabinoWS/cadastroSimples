package com.sabinows.web.controllerers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sabinows.domain.Person;
import com.sabinows.services.PersonServiceInterface;

@Controller
public class PersonController {

	@Autowired
	private PersonServiceInterface service;
	
	@GetMapping("/")
	public String register(Person person) {
		return "/person/register";
	}
	
	@PostMapping("/save")
	public String save(@Valid Person person, BindingResult result, RedirectAttributes attr) {
		
		if (result.hasErrors()) {
			attr.addFlashAttribute("fail", "Erro ao cadastrar.");
			return "redirect:/";
		}
		
		service.save(person);
		attr.addFlashAttribute("success", "Pessoa cadastrada com sucesso.");
		
		return "redirect:/";
	}
}
