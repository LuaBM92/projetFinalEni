package fr.eni.pizzaOnLine.entity;


public class Produit {
	
	private Long id;
	private String nom;
	private String description;
	
	
	public Produit() {
	}
	
	public Produit(String nom, String description) {
		this.nom = nom;
		this.description = description;
	}
	
	public Produit(Long id, String nom, String description) {
		this.id = id;
		this.nom = nom;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + "]";
	}
	

	
	
	
}
