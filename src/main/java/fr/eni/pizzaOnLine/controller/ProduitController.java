package fr.eni.pizzaOnLine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProduitController {

	
	@GetMapping("/ajouterPizza")
	public String formulaire() {
			return "/home/ajouterPizza";
		}

	@PostMapping("/enregistrerPizza")
	public String ajouterPizza() {
		return "redirect:/carte";
	}
	
}
