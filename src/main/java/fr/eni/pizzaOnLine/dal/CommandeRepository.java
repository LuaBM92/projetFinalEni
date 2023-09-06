package fr.eni.pizzaOnLine.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.Commande;
import fr.eni.pizzaOnLine.entity.Produit;

public interface CommandeRepository extends JpaRepository<Commande, Long>{

}
