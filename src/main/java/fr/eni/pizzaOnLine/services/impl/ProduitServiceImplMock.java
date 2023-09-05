package fr.eni.pizzaOnLine.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.entity.TypeProduit;
import fr.eni.pizzaOnLine.services.ProduitService;


public class ProduitServiceImplMock implements ProduitService {
	
	private static List<Produit> lstProduit = new ArrayList<>();

	@Override
	public List<Produit> consulterProduits() {
		return lstProduit;
	}

	@Override
	public Produit consulterProduitParId(Long id) {
		return lstProduit.stream().filter(item -> item.getId() == id).findAny().orElse(null);
	}

	@Override
	public void enregistrerProduit(Produit produit) {
		 for (int i = 0; i < lstProduit.size(); i++) {
		        if (lstProduit.get(i).getId().equals(produit.getId())) {
		            lstProduit.set(i, produit);
		            return;
		        }
		}
		 lstProduit.add(produit);
	}

	@Override
	public void supprimerProduit(Long id) {
		 lstProduit.removeIf(produit -> produit.getId().equals(id));
		 //ou bien on utilise la méthode remove de Object mais du coup
		 //il faut redéfinir la méthode equals et le hashcode dans Produit
		 //lstProduit.remove(new Produit(id));
	}

	@Override
	public List<TypeProduit> consulterCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeProduit consulterTypeProduitParId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
