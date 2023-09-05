package fr.eni.pizzaOnLine.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import fr.eni.pizzaOnLine.converter.StringToCategorie;


public class ConverterConfig implements WebMvcConfigurer {

	@Autowired 
	private StringToCategorie stringToCategorie;
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(stringToCategorie);
	}
	
}
