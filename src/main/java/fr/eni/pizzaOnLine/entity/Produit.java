package fr.eni.pizzaOnLine.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	private float prix;
	private String urlImage;
	
	@ManyToOne
	private TypeProduit typeProduit;
	//@OneToMany
	//private List<DetailCommande> lstDetailCommande = new ArrayList<DetailCommande>();
	
	
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

	
	
	public Produit(Long id, String nom, String description, float prix, String urlImage, TypeProduit typeProduit) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.urlImage = urlImage;
		this.typeProduit = typeProduit;
		//this.lstDetailCommande = lstDetailCommande;
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

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public TypeProduit getTypeProduit() {
		return typeProduit;
	}

	public void setTypeProduit(TypeProduit typeProduit) {
		this.typeProduit = typeProduit;
	}

//	public List<DetailCommande> getLstDetailCommande() {
//		return lstDetailCommande;
//	}
//
//	public void setLstDetailCommande(List<DetailCommande> lstDetailCommande) {
//		this.lstDetailCommande = lstDetailCommande;
//	}
	

	
	
	
}
