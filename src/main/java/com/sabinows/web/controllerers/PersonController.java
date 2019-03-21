package com.sabinows.web.controllerers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sabinows.domain.Person;

@Controller
public class PersonController {

	@GetMapping("/")
	public String register(Person person) {
		return "/person/register";
	}
	
	@PostMapping("/save")
	public String save(RedirectAttributes attr) {
		// TO DO
		attr.addFlashAttribute("success", "Em construção.");
		return "redirect:/";
	}
}
