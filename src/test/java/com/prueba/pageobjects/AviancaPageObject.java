package com.prueba.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;

@DefaultUrl("https://www.avianca.com/co/es/")
public class AviancaPageObject extends PageObject {


	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	
	@FindBy(xpath = "//*[contains(@id,'pbOrigen_1_1')]")
	public WebElementFacade TXT_BOX_DESDE;

	@FindBy(xpath = "//*[contains(@id,'pbDestino_1_1')]")
	public WebElementFacade TXT_BOX_HACIA;

	@FindBy(xpath = "//td[@data-date='2021-05-15']")
	public WebElementFacade TXT_BOX_FECHASALIDA;

	@FindBy(xpath = "//*[contains(@id,'pbFechas_1_1')]")
	public WebElementFacade CALENDARIO;

	@FindBy(xpath = "//td[@data-date='2021-05-15']")
	public WebElementFacade TXT_BOX_REGRESO;

	@FindBy(xpath = "//*[contains(@class,'btn primary btn-codepromo pull-btn rojo')]")
	public WebElementFacade BTN_BUSCAR_VUELOS;

	@FindBy(xpath = "//h1[contains(@class,'calendar-container-heading')]")
	public WebElementFacade LBL_SELECCIONA_TU_VUELO;

	
    String ciudad= "//li[@class='item']//*[contains(text(),'%s')]";
	
	public void escribirOrigen(String desde) {
		TXT_BOX_DESDE.click();
		TXT_BOX_DESDE.sendKeys(desde);
		//getDriver().findElement(By.xpath(String.format(ciudad, desde))).click();
		
	}

	public void escribirDestino(String hacia) {
		TXT_BOX_HACIA.click();
		TXT_BOX_HACIA.sendKeys(hacia);
	// getDriver().findElement(By.xpath(String.format(ciudad, hacia))).click();	
        
	}

	public void seleccionarFecha(String fechaSalida) {
		CALENDARIO.click();
		TXT_BOX_REGRESO.click();

	}

	public void seleccionarRegreso(String fechaRegreso) {
		TXT_BOX_REGRESO.click();
	}

	public void buscaVuelos() {
		System.out.println("click en boton");
		waitFor(3000);
		BTN_BUSCAR_VUELOS.click();
		System.out.println("sssssssss");
	}

	public void seleccionarSegundoVuelo() {
		LBL_SELECCIONA_TU_VUELO.isVisible();
		List<WebElement> vuelo = getDriver().findElements(By.xpath("//*[@class='select-cabin-button']"));
		for (int i = 0; i < vuelo.size(); i++) {
			System.out.println(vuelo.get(i).getAttribute("aria-label"));
			
		//	js.executeScript ("alert ('Aquí el vuelo que se seleccionó'"); esto es un ejemplo 
		}
		
		
		
			
			
	}

}
