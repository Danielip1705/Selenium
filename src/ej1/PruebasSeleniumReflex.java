package ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class PruebasSeleniumReflex {

	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
		driver1.get("http://localhost:3000/");
	}

	
	//En el primer teste tendremos que buscar en el header el texto
	//Haremos un assertEquals para comprobar el texto("Enlaces Favoritos")
	@Test
	void test1() {
		WebElement enlace1 = driver1.findElement(By.id("enlaces"));
		
		String texto = enlace1.getText();
		assertEquals("Enlaces Favoritos", texto);
	}
	
	//en el segundo test comprobamos si existe un enlace buscadores
	@Test
	void test2() {
		WebElement enlace1 = driver1.findElement(By.id("buscadores"));
		
		String texto = enlace1.getText();
		assertEquals("Buscadores", texto);
	}
	//en el segundo test comprobamos si existe un enlace buscadores
		@Test
		void test3() {
			WebElement enlace1 = driver1.findElement(By.id("redes"));
			
			String texto = enlace1.getText();
			assertEquals("Redes Sociales", texto);
		}
	//Comprobar si existe el enlace de redes
	@Test
	void test4() {
		WebElement buscadores = driver1.findElement(By.id("buscadores"));
		buscadores.click();
		WebElement paginaBuscadores = driver1.findElement(By.id("page-buscadores"));
		String textoBuscadores = paginaBuscadores.getText();
		assertEquals("Buscadores", textoBuscadores);
	}

}
