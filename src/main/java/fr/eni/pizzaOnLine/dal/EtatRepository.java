package fr.eni.pizzaOnLine.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.pizzaOnLine.entity.Etat;

public interface EtatRepository extends JpaRepository<Etat, Long>{

}
