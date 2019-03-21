package com.sabinows.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

	@GetMapping("/")
	public String home() {
		return "/person/register";
	}
}