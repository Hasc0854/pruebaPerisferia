package com.prueba.definition;

import com.prueba.steps.AviancaSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AviancaDefinition {

	@Steps
	AviancaSteps aviancaSteps; 
	@Given("^hugo ingrese a la pagina de avanca$")
	public void hugo_ingrese_a_la_pagina_de_avanca()   {
		aviancaSteps.ingresarAviancaPage();
	}

	@When("^hugo busca \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"el segundo vuelo del resultado de busqueda$")
	public void hugo_busca_el_segundo_vuelo_del_resultado_de_busqueda(String desde, String hacia, String fechaSalida, String fechaRegreso) {
		aviancaSteps.llenarDatosDeVuelo(desde,hacia,fechaSalida,fechaRegreso);
	}
    
	@When("^hugo ingresa datos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"(\\d+)$")
	public void hugo_ingresa_datos(String tarifa, String nombre, String apellido, String correo, int celular) {
		aviancaSteps.seleccionaTuVuelo();
	}


	@Then("^hugo verifica mensaje\"([^\"]*)\"$")
	public void hugo_verifica_mensaje(String mensaje)   {
	 
	    
	}
	
	
}
