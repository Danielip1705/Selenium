package reflex;

import static org.junit.jupiter.api.Assertions.assertEquals; 

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prueba1 {
	static WebDriver driver1;

	@BeforeAll
	static void setURL() {
		driver1 = new ChromeDriver();
	}

	
	@Test
	void test1() {
		driver1.get("http://localhost:3000/");
		WebElement enlace1 = driver1.findElement(By.id("Linkedin"));
		enlace1.click();
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/", url);
	}
	
	@Test
	void test2() {
		driver1.get("http://localhost:3000/");
		WebElement enlace2 = driver1.findElement(By.id("Github"));
		enlace2.click();
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/", url);
	}
	
	@Test
	void test3() {
		driver1.get("http://localhost:3000/");
		WebElement enlace1 = driver1.findElement(By.id("Curriculum"));
		enlace1.click();
		
		String url = driver1.getCurrentUrl();
		assertEquals("http://localhost:3000/cv/", url);
	}

}
