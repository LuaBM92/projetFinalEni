package fr.eni.pizzaOnLine.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import ch.qos.logback.classic.Logger;
import fr.eni.pizzaOnLine.entity.Commande;
import fr.eni.pizzaOnLine.entity.DetailCommande;
import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.services.CommandeService;
import fr.eni.pizzaOnLine.services.ProduitService;

@Controller
@SessionAttributes("panier")
public class CommandeController {
	
    Logger logger = (Logger) LoggerFactory.getLogger(CommandeController.class);
	
	private Long index = 0L;

	@Autowired
	private ProduitService produitService;
	@Autowired
	private CommandeService commandeService;
	
	
	
	@PostMapping("/ajouterPanier")
	public String ajouterPanier(@RequestParam Long id, @RequestParam("quantite") Integer quantite, @ModelAttribute Produit produit, Model model) {
	
		logger.debug("An INFO Message");
		Commande panier = (Commande)model.getAttribute("panier");
		
		if(panier==null) {
			panier = new Commande();
			model.addAttribute("panier",panier);
			}
		
		List<DetailCommande> lstDetailCommande = panier.getDetailCommande();
		boolean produitExisteDansPanier = false;
		for(DetailCommande detailCommande : lstDetailCommande) {
				if(detailCommande.getProduit().getId().equals(id)) {
				int nouvelleQuantite = detailCommande.getQuantite()+ quantite;
				detailCommande.setQuantite(nouvelleQuantite);
				//commandeService.enregistrerDetailCommande(detailCommande);
				produitExisteDansPanier = true;
				break;
		}
	}
		if(!produitExisteDansPanier) {
			//TODO verifier que la qualtite n'est pas négative
			DetailCommande nouveauProduitCommande = new DetailCommande();
			nouveauProduitCommande.setCommande(panier);
			nouveauProduitCommande.setProduit(produitService.consulterProduitParId(id));
			nouveauProduitCommande.setQuantite(quantite);
			lstDetailCommande.add(nouveauProduitCommande);
			//commandeService.enregistrerDetailCommande(nouveauProduitCommande);
		
}
		return "redirect:/commander";
	}
	
	@PostMapping("/enregistrerCommande")
	public String enregistrerCommande(@RequestParam Long id, @RequestParam("quantite") Integer quantite, @ModelAttribute Produit produit, Model model) {
		Commande panier = (Commande)model.getAttribute("panier");
		List<DetailCommande> lstDetailCommande = panier.getDetailCommande();
		
//		//ENREGISTRER CHAQUE PIZZA DANS LA COMMANDE
//		for(DetailCommande detailCommande : lstDetailCommande) {
//			commandeService.enregistrerDetailCommande(detailCommande);
//		}

		//ENREGISTRER LA COMMANDE EN BDD	
		commandeService.enregistrerCommande(panier);
		
		
		//boolean produitExisteDansPanier = false;
//		for(DetailCommande detailCommande : lstDetailCommande) {
//				if(detailCommande.getProduit().getId().equals(id)) {
//				int nouvelleQuantite = detailCommande.getQuantite()+ quantite;
//				detailCommande.setQuantite(nouvelleQuantite);
//				commandeService.enregistrerDetailCommande(detailCommande);
//				//produitExisteDansPanier = true;
//				break;
//		}
//	}
//		if(!produitExisteDansPanier) {
//			//TODO verifier que la qualtite n'est pas négative
//			DetailCommande nouveauProduitCommande = new DetailCommande();
//			nouveauProduitCommande.setCommande(panier);
//			nouveauProduitCommande.setProduit(produitService.consulterProduitParId(id));
//			nouveauProduitCommande.setQuantite(quantite);
//			lstDetailCommande.add(nouveauProduitCommande);
//			commandeService.enregistrerDetailCommande(nouveauProduitCommande);
//		
//}
		return "redirect:/panier";
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
}

