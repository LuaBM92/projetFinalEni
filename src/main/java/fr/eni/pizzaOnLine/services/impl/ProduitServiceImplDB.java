package fr.eni.pizzaOnLine.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.pizzaOnLine.dal.ProduitRepository;
import fr.eni.pizzaOnLine.dal.TypeProduitRepository;
import fr.eni.pizzaOnLine.entity.Produit;
import fr.eni.pizzaOnLine.entity.TypeProduit;
import fr.eni.pizzaOnLine.services.ProduitService;

@Service
public class ProduitServiceImplDB implements ProduitService {
	
	@Autowired
	private ProduitRepository produitRepo;
	@Autowired
	private TypeProduitRepository typeProduitRepo;

	
	public List<TypeProduit> consulterCategories(){
		return typeProduitRepo.findAll();
	}
	
	public TypeProduit consulterTypeProduitParId(Long id) {
		return typeProduitRepo.getOne(id);
	}

	
	@Override
	public List<Produit> consulterProduits() {
		return produitRepo.findAll();
	}

	@Override
	public Produit consulterProduitParId(Long id) {
		return produitRepo.getOne(id);
	}

	@Override
	public void enregistrerProduit(Produit produit) {
		 Produit produitExistant = produitRepo.findById(produit.getId()).orElse(null);
		 
		 if (produitExistant != null) {
			 produitExistant.setNom(produit.getNom());
			 produitExistant.setDescription(produit.getDescription());
	            produitRepo.save(produitExistant);
	        } else {
		  produitRepo.save(produit);
	        }
	}

	@Override
	public void supprimerProduit(Long id) {
		produitRepo.deleteById(id);
	}

}