package com.prueba.steps;


import com.prueba.pageobjects.AviancaPageObject;

import net.thucydides.core.annotations.Step;

public class AviancaSteps {
	AviancaPageObject aviancaPageObject;
	@Step
	public void ingresarAviancaPage() {
		aviancaPageObject.open();	
	}
	public void llenarDatosDeVuelo(String desde, String hacia,String fechaSalida,String fechaRegreso)  {
		
		aviancaPageObject.escribirOrigen(desde);
		aviancaPageObject.escribirDestino(hacia);
		aviancaPageObject.seleccionarFecha(fechaSalida);
		aviancaPageObject.seleccionarRegreso(fechaRegreso);
		aviancaPageObject.buscaVuelos();
			
	}
	public void seleccionaTuVuelo() {
		aviancaPageObject.seleccionarSegundoVuelo();
		
	}	
	
	

}
