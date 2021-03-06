package com.sabinows.web.controllerers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sabinows.domain.Person;
import com.sabinows.services.PersonServiceInterface;
import com.sabinows.web.validators.PersonValidator;

@Controller
public class PersonController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.addValidators(new PersonValidator());
	}
	
	@Autowired
	private PersonServiceInterface service;
	
	@GetMapping("/")
	public String register(Person person) {
		return "/person/register";
	}
	
	@PostMapping("/save")
	public String save(@Valid Person person, BindingResult result, RedirectAttributes attr) {
		
		if (result.hasErrors()) {
			return "/person/register";
		}
		
		service.save(person);
		attr.addFlashAttribute("success", "Pessoa cadastrada com sucesso.");
		
		return "redirect:/";
	}
}
