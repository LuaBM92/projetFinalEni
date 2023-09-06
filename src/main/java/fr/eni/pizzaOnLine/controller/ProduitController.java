package fr.eni.pizzaOnLine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.services.ProduitService;

@Controller
public class ProduitController {
	
	private Long index = 0L;

	@Autowired
	private ProduitService produitService;
	
	
// Avant mise en place de la BDD
//	@PostMapping("/enregistrerProduit")
//	public String ajouterPizza(@ModelAttribute Produit produit) {
//		produit.setId(index++);
//		produitService.enregistrerProduit(produit);
//		System.out.println(produit);
//		return "redirect:/carte";
//	}
//	
//	@PostMapping("/modifierProduit/{id}")
//	public String enregistrerModificationProduit(@PathVariable long id, Produit produit, Model model) {
//		Produit produitExistant = produitService.consulterProduitParId(id);
//		if(produitExistant==null) {
//			return "erreur";
//		}
//		produitExistant.setNom(produit.getNom());
//		produitExistant.setDescription(produit.getDescription());
//		produitService.enregistrerProduit(produitExistant);
//		return "redirect:/carte";
//	}
	
	
	@GetMapping("/supprimerProduit/{id}")
	public String supprimerProduit(@PathVariable Long id) {
		produitService.supprimerProduit(id);
		return "redirect:/carte";
	}
	
	
	
	@PostMapping("/enregistrerProduit")
	public String enregistrerProduit(@RequestParam (required=false)Long id, @ModelAttribute Produit produit, Model model) {
		if(id == null) {
			produitService.enregistrerProduit(produit);
		}else {
			Produit produitExistant = produitService.consulterProduitParId(id);
			if(produitExistant==null) {
				return "erreur";
			}
			produitExistant.setNom(produit.getNom());
			produitExistant.setDescription(produit.getDescription());
			produitExistant.setPrix(produit.getPrix());
			produitService.enregistrerProduit(produitExistant);
				
		}
			return "redirect:/carte";
		
	}
	
		
	@GetMapping("/modifier/{id}")
	public String modifierProduit(@PathVariable Long id, Model model) {
		Produit produit = produitService.consulterProduitParId(id);
		if(produit == null) {
			produit = new Produit();
		}
		model.addAttribute("produit", produit);
		return "home/ajouterProduit";
	}
	
	
}
