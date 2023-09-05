package fr.eni.pizzaOnLine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class DetailCommande {

	@Id
	private int id;
	private int quantite;
	
	@OneToOne
	private Produit produit;
	@OneToOne
	private Commande commande;
	
	
	public DetailCommande() {
		// TODO Auto-generated constructor stub
	}

	public DetailCommande(int quantite, Produit produit, Commande commande) {
		super();
		this.quantite = quantite;
		this.produit = produit;
		this.commande = commande;
	}

	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public Produit getProduit() {
		return produit;
	}


	public void setProduit(Produit produit) {
		this.produit = produit;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "DetailCommande [quantite=" + quantite + ", produit=" + produit + ", commande=" + commande + "]";
	}
	
	
	
	
}
