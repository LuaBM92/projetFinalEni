package fr.eni.pizzaOnLine.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class TypeProduit {
	@Id
	private int id;
	private String libelle;
	
	
	public TypeProduit() {
		// TODO Auto-generated constructor stub
	}
	


	public TypeProduit(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	
	}






	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
	
	
}
