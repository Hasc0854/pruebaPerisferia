package com.prueba.pageobjects;

import org.openqa.selenium.Alert;

import net.serenitybdd.core.pages.PageObject;

public class Utlidades extends PageObject{

	
	public void aceptarAlertas() {
	Alert alert = getDriver().switchTo().alert();
	alert.dismiss();
	}
	
}
