package fr.eni.pizzaOnLine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.services.CommandeService;
import fr.eni.pizzaOnLine.services.ProduitService;

@Controller
@SessionAttributes("panier")
public class HomeController {
	

	@Autowired
	private ProduitService produitService;
	
	@Autowired
	private CommandeService commandeService;
	
	@GetMapping("/carte")
	public String tousLesProduits(Model model) {
		model.addAttribute("produits", produitService.consulterProduits());
			return "/home/index";
		}
	
	@GetMapping("/panier")
	public String panier(Model model) {
		//model.addAttribute("lstDetailCommande", commandeService.consulterDetailCommande());
		return "/home/panier";
	}
	
	@GetMapping("/commander")
	public String afficherCatalogueCommander(Model model) {
		model.addAttribute("produits", produitService.consulterProduits());
		return "/home/commander";
	}
	
	@GetMapping("/ajouterProduit")
	public String afficherFormulaire(Model model) {
		model.addAttribute("produit", new Produit());
			return "/home/ajouterProduit";
		}
	
	
	
}
