package fr.eni.pizzaOnLine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Etat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	
	//public enum libelle{CREE, PAYEE, PREPAREE, EN_LIVRAISON, LIVREE};
	
	@OneToOne
	private Commande commande;
	
	public Etat() {
		// TODO Auto-generated constructor stub
	}

	public Etat(String libelle, Commande commande) {
		this.libelle = libelle;
		this.commande = commande;
	}

	public Etat(Long id, String libelle, Commande commande) {
		this.id = id;
		this.libelle = libelle;
		this.commande = commande;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "Etat [id=" + id + ", commande=" + commande + "]";
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
	
	
	
}
