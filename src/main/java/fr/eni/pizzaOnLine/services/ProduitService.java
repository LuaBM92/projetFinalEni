package fr.eni.pizzaOnLine.services;

import java.util.List;

import fr.eni.pizzaOnLine.entity.Produit;


public interface ProduitService {

	public List<Produit> consulterProduits();
	public Produit consulterProduitParId(Long id);
	public void enregistrerProduit(Produit produit);
	public void supprimerProduit(Long id);
}
