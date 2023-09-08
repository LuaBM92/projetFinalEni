package fr.eni.pizzaOnLine.services;

import java.util.List;

import fr.eni.pizzaOnLine.entity.Commande;
import fr.eni.pizzaOnLine.entity.DetailCommande;
import fr.eni.pizzaOnLine.entity.Etat;
import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.entity.TypeProduit;


public interface CommandeService {

	public List<Commande> consulterCommandes();
	public Commande consulterCommandeParId(Long id);
	public void enregistrerCommande(Commande commande);
	public void supprimerCommande(Long id);
	
	public List<DetailCommande> consulterDetailCommande();
	public DetailCommande consulterDetailCommandeParId(Long id);
	public void enregistrerDetailCommande(DetailCommande DetailCommande);
	public void supprimerDetailCommande(Long id);
	void enregistrerEtat(Etat etat);
	
	
	
}
