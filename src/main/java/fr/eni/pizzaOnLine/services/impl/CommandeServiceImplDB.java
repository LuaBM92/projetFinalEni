package fr.eni.pizzaOnLine.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.dal.CommandeRepository;
import fr.eni.pizzaOnLine.dal.DetailCommandeRepository;
import fr.eni.pizzaOnLine.entity.Commande;
import fr.eni.pizzaOnLine.entity.DetailCommande;
import fr.eni.pizzaOnLine.entity.Etat;
import fr.eni.pizzaOnLine.services.CommandeService;

@Service
public class CommandeServiceImplDB  implements CommandeService{
	
	@Autowired
	private CommandeRepository commandeRepo;
	@Autowired
	private DetailCommandeRepository detailCommandeRepo;
	
	
	@Override
	public List<Commande> consulterCommandes() {
		return commandeRepo.findAll();
	}

	@Override
	public Commande consulterCommandeParId(Long id) {
			Optional<Commande> commandeOptional = commandeRepo.findById(id);
			return commandeOptional.orElse(null);
		}
	
	@Override
	public void enregistrerCommande(Commande commande) {
		commandeRepo.save(commande);
		
	}

	@Override
	public void supprimerCommande(Long id) {
		commandeRepo.deleteById(id);
		
	}
///////
	@Override
	public List<DetailCommande> consulterDetailCommande() {
		return detailCommandeRepo.findAll();
	}

	@Override
	public DetailCommande consulterDetailCommandeParId(Long id) {
		Optional<DetailCommande> detailCommandeOptional = detailCommandeRepo.findById(id);
		return detailCommandeOptional.orElse(null);
	}
	
	
	@Override
	public void enregistrerDetailCommande(DetailCommande detailcommande) {
		detailCommandeRepo.save(detailcommande);
		
	}

	@Override
	public void supprimerDetailCommande(Long id) {
		detailCommandeRepo.deleteById(id);
		
	}

	@Override
	public void enregistrerEtat(Etat etat) {
		commandeRepo.save(etat);
		
	}

	
	
}
