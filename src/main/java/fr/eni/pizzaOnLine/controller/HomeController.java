package fr.eni.pizzaOnLine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping("/carte")
	public String home() {
			return "/home/index";
		}
	
	@GetMapping("/panier")
	public String panier() {
		return "/home/panier";
	}
	
	
}
