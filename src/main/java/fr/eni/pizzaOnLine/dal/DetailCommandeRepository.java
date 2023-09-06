package fr.eni.pizzaOnLine.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.DetailCommande;

public interface DetailCommandeRepository extends JpaRepository<DetailCommande, Long>{

}
