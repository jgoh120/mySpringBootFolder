package com.spring.apps.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {
	
	@GetMapping("/")
	public String showhome() {
		return "index";
	}
	
}
