package fr.eni.pizzaOnLine.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import fr.eni.pizzaOnLine.entity.TypeProduit;
import fr.eni.pizzaOnLine.services.ProduitService;

public class StringToCategorie implements Converter<String, TypeProduit>{

	@Autowired
	private ProduitService produitService;
	
	@Override
	public TypeProduit convert(String source) {
		long id = Long.parseLong(source);
		return produitService.consulterTypeProduitParId(id);
	}

}
