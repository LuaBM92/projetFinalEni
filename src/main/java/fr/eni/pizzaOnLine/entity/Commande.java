package fr.eni.pizzaOnLine.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dateHeureLivraison;
	private LocalDateTime dateHeurePreparation;
	
	//assoc. bidirectionnele donc mapper pour éviter la double table d'intersection
	@OneToMany(mappedBy="commande", cascade = CascadeType.PERSIST)
	private List<DetailCommande> lstDetailCommande = new ArrayList<DetailCommande>();
	@ManyToOne
	private Etat etat;
	
		
	public Commande() {
		// TODO Auto-generated constructor stub
	}

	
	public Commande(Long id, LocalDateTime dateHeureLivraison, LocalDateTime dateHeurePreparation,
			List<DetailCommande> detailCommande, Etat etat) {
		super();
		this.id = id;
		this.dateHeureLivraison = dateHeureLivraison;
		this.dateHeurePreparation = dateHeurePreparation;
		this.lstDetailCommande = detailCommande;
		this.etat = etat;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getDateHeureLivraison() {
		return dateHeureLivraison;
	}
	public void setDateHeureLivraison(LocalDateTime dateHeureLivraison) {
		this.dateHeureLivraison = dateHeureLivraison;
	}
	public LocalDateTime getDateHeurePreparation() {
		return dateHeurePreparation;
	}
	public void setDateHeurePreparation(LocalDateTime dateHeurePreparation) {
		this.dateHeurePreparation = dateHeurePreparation;
	}
	public List<DetailCommande> getDetailsCommande() {
		return lstDetailCommande;
	}
	public void setDetailsCommande(List<DetailCommande> detailCommande) {
		this.lstDetailCommande = detailCommande;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}


	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateHeureLivraison=" + dateHeureLivraison + ", dateHeurePreparation="
				+ dateHeurePreparation + ", lstDetailCommande=" + lstDetailCommande + ", etat=" + etat + "]";
	}
	
	
	
	
	
	
}
