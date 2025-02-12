package ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class TestsReflexej2 {

	 static WebDriver driver1;


	    @BeforeAll
	    static void setURL() {
	        driver1 = new ChromeDriver();
	        driver1.get("http://localhost:3000/");

	    }

	    //Test para comprobar que existe el titulo "Formulario de registro"
	    @Test
	    void comprobarTitulo() {
	        WebElement elemento = driver1.findElement(By.id("titulo-form"));
	        String tituloTexto = elemento.getText();
	        assertEquals("Formulario de registro", tituloTexto);
	    }
	    
	    //Test para comprbar que existe el texto nombre
	    @Test
	    void comprobarTextoNombre() {
	        WebElement elemento = driver1.findElement(By.id("nombre"));
	        String nombreTexto = elemento.getText();
	        assertEquals("Nombre:", nombreTexto);
	    }
	    //Test para comprobar que existe el input de nombre
	    @Test
	    void comprobarInputNombre() {
	        WebElement elemento = driver1.findElement(By.id("nombre-input"));
	        String inputNombre = elemento.getText();
	        assertEquals("", inputNombre);
	    }
	    //Test para comprobar que existe el texto apellido
	    @Test
	    void comprobarTextoApellido() {
	        WebElement elemento = driver1.findElement(By.id("apellido"));
	        String apellidoTexto = elemento.getText();
	        assertEquals("Apellido:", apellidoTexto);
	    }
	    
	    //Test para comprobar que existe el input de apellido
	    @Test
	    void comprobarInputApellido() {
	        WebElement elemento = driver1.findElement(By.id("apellido-input"));
	        String inputApellido = elemento.getText();
	        assertEquals("", inputApellido);
	    }
	    
	    //Test para comprobar que existe el texto de sexo
	    @Test
	    void comprobarTextoSexo() {
	        WebElement elemento = driver1.findElement(By.id("sexo"));
	        String textoSexo = elemento.getText();
	        assertEquals("Sexo:", textoSexo);
	    }
	    
	    //Test para comprobar que existe el texto hombre en el check
	    @Test
	    void comprobarSexoHombre() {
	        WebElement elemento = driver1.findElement(By.id("hombre"));
	        String textoSexo = elemento.getAttribute("value");
	        assertEquals("hombre", textoSexo);
	    }
	    //Test para comprobar que si se ha presionado el check de hombre
	    @Test
	    void comprobarSexoHombrePresionado() {
	        WebElement elemento = driver1.findElement(By.id("hombre"));
	        elemento.click();
	        String presionado = elemento.getAttribute("aria-checked");
	        assertEquals("true", presionado);
	    }
	    
	    //Test para comprobar que existe el texto hombre en el check
	    @Test
	    void comprobarSexoMujer() {
	        WebElement elemento = driver1.findElement(By.id("mujer"));
	        String textoSexo = elemento.getAttribute("value");
	        assertEquals("mujer", textoSexo);
	    }
	    
	    //Test para comprobar que si se ha presionado el check de mujer
	    @Test
	    void comprobarSexoMujerPresionado() {
	        WebElement elemento = driver1.findElement(By.id("mujer"));
	        elemento.click();
	        String presionado = elemento.getAttribute("aria-checked");
	        assertEquals("true", presionado);
	    }
	  //Test para comprobar que existe el texto correo
	    @Test
	    void comprobarTextoCorreo() {
	        WebElement elemento = driver1.findElement(By.id("correo"));
	        String correoTexto = elemento.getText();
	        assertEquals("Correo:", correoTexto);
	    }
	    
	    //Test para comprobar que existe el input de correo
	    @Test
	    void comprobarInputCorreo() {
	        WebElement elemento = driver1.findElement(By.id("correo-input"));
	        String inputCorreo = elemento.getText();
	        assertEquals("", inputCorreo);
	    }
	    
	    //Test para comprobar que existe el informacion en el check
	    @Test
	    void comprobarTextoCasillaInformacion() {
	        WebElement elemento = driver1.findElement(By.id("info"));
	        String textoCheck = elemento.getAttribute("value");
	        String info = "Deseo recibir información sobre novedades y ofertas";
	        assertEquals(info, textoCheck);
	    }
	    
	    //Test para comprobar que el check de la info esta presionado por defecto
	    @Test
	    void comprobarCasillaInformacionPresionado() {
	    	WebElement elemento = driver1.findElement(By.id("info"));
	    	String presionado = elemento.getAttribute("aria-checked");
	    	assertEquals("true", presionado);
	    }
	    
	    //Test para comprobar en el check el texto de la normativa
	    @Test
	    void comprobarTextoCasillaNormativa() {
	    	WebElement elemento = driver1.findElement(By.id("normativa"));
	    	String textoCheck = elemento.getAttribute("value");
	    	String normativa = "Declaro haber leido y aceptar las condiciones generales del programa y la normativa sobre protección de datos";
	    	assertEquals(normativa, textoCheck);
	    }
	    
	  //Test para comprobar que el check de la info esta presionado por defecto
	    @Test
	    void comprobarCasillaNormativaPresionado() {
	    	WebElement elemento = driver1.findElement(By.id("normativa"));
	    	elemento.click();
	    	String presionado = elemento.getAttribute("aria-checked");
	    	assertEquals("true", presionado);
	    }
	    
	    //Test para comprobar el texto del boton
	    @Test
	    void comprobarBoton() {
	    	WebElement elemento = driver1.findElement(By.id("texto-btn"));
	    	String presionado = elemento.getText();
	    	assertEquals("Enviar", presionado);
	    }
}
