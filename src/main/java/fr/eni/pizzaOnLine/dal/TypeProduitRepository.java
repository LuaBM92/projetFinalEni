package fr.eni.pizzaOnLine.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.TypeProduit;

public interface TypeProduitRepository extends JpaRepository<TypeProduit, Long>{

}
