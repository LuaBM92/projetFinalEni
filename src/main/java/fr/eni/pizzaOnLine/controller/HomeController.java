package fr.eni.pizzaOnLine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.eni.pizzaOnLine.services.ProduitService;

@Controller
public class HomeController {
	

	@Autowired
	private ProduitService produitService;
	
	@GetMapping("/carte")
	public String tousLesProduits(Model model) {
		model.addAttribute("produits", produitService.consulterProduits());
			return "/home/index";
		}
	
	@GetMapping("/panier")
	public String panier() {
		return "/home/panier";
	}
	
	
}
