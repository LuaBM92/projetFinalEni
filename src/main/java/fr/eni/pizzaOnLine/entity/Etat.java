package fr.eni.pizzaOnLine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Etat {
	@Id
	private Long id;
	private String libelle;
	
	//public enum libelle{CREE, PAYEE, PREPAREE, EN_LIVRAISON, LIVREE};
	
	
	
	public Etat() {
		// TODO Auto-generated constructor stub
	}

	public Etat(Long id) {
		
	}

	public Etat(Long id, String libelle) {
		this.id = id;
		this.libelle = libelle;
		
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	

	@Override
	public String toString() {
		return "Etat [id=" + id + "]";
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
	
	
	
}
