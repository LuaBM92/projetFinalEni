package fr.eni.pizzaOnLine.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.services.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService {
	
	private static List<Produit> lstProduit = new ArrayList<>();

	@Override
	public List<Produit> consulterProduits() {
		return lstProduit;
	}

	@Override
	public Produit consulterProduitParId(Long id) {
		return lstProduit.stream().filter(item -> item.getId() == id).findAny().orElse(null);;
	}

	@Override
	public void enregistrerProduit(Produit produit) {
		
	}

	@Override
	public void supprimerProduit(Long id) {
		
	}

}
