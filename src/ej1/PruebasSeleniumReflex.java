package ej1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

class PruebasSeleniumReflex {

    static WebDriver driver1;


    @BeforeAll
    static void setURL() {
        driver1 = new ChromeDriver();
        driver1.get("http://localhost:3000/");

    }

    // En el primer test verificamos que el texto "Enlaces Favoritos" esté presente en el enlace correspondiente en el header
    @Test
    void test1() {
        WebElement enlace1 = driver1.findElement(By.id("enlaces"));    
        String texto = enlace1.getText();
        assertEquals("Enlaces Favoritos", texto);
    }
    
    
    // En el segundo test comprobamos si existe un enlace con el texto "Buscadores"
    @Test
    void test2() {
        WebElement enlace1 = driver1.findElement(By.id("buscadores"));
        String texto = enlace1.getText();
        assertEquals("Buscadores", texto);
    }

    // En el tercer test comprobamos si existe un enlace con el texto "Redes Sociales"
    @Test
    void test3() {
        WebElement enlace1 = driver1.findElement(By.id("redes"));
        String texto = enlace1.getText();
        assertEquals("Redes Sociales", texto);
    }

    // Comprobamos que al hacer clic en el enlace de "Buscadores", la página muestra el texto "Buscadores"
    @Test
    void test4()  {
        WebElement buscador = driver1.findElement(By.id("buscadores"));
        buscador.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement paginaBuscadores = driver1.findElement(By.id("pageBus-buscadores"));
        String textoBuscadores = paginaBuscadores.getText();
        assertEquals("Buscadores", textoBuscadores);
        
    }
    
    //Comprobamos que al hacer click en el enlace de Google, se redirige a la url de Google
    @Test
    void test5() {
        WebElement buscador = driver1.findElement(By.id("buscadores"));
        buscador.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement google = driver1.findElement(By.id("google"));
        google.click();
        String url = driver1.getCurrentUrl();
        assertEquals("https://www.google.es/", url);
    }
    
 // Comprobamos que al hacer clic en el enlace de Bing, se redirige a la URL de Bing
    @Test
    void test6() {
        WebElement buscador = driver1.findElement(By.id("buscadores"));
        buscador.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement bing = driver1.findElement(By.id("bing"));
        bing.click();
        String url = driver1.getCurrentUrl();
        assertEquals("https://www.bing.com/", url);
    }

    // Comprobamos que al hacer clic en el enlace de Baidu, se redirige a la URL de Baidu
    @Test
    void test7() {
        WebElement buscador = driver1.findElement(By.id("buscadores"));
        buscador.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement baidu = driver1.findElement(By.id("baidu"));
        baidu.click();
        String url = driver1.getCurrentUrl();
        assertEquals("https://www.baidu.com/index.html", url);
    }

    // Comprobamos que al hacer clic en el enlace "Volver", la página vuelve a la URL inicial
    @Test
    void test8() {
        WebElement buscador = driver1.findElement(By.id("buscadores"));
        buscador.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement volver = driver1.findElement(By.id("volver"));
        volver.click();
        String url = driver1.getCurrentUrl();
        assertEquals("http://localhost:3000/", url);
    }

    // Comprobamos que al hacer clic en el enlace de "Redes Sociales", la página muestra el texto "Redes Sociales"
    @Test
    void test9() {
        WebElement buscadores = driver1.findElement(By.id("redes"));
        buscadores.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement redesHeader = driver1.findElement(By.id("pageRS-redessociales"));
        String textoRedes = redesHeader.getText();
        assertEquals("Redes Sociales", textoRedes);
    }

    // Comprobamos que al hacer clic en el enlace de Instagram, se redirige a la URL de Instagram
    @Test
    void test10() {
        WebElement buscadores = driver1.findElement(By.id("redes"));
        buscadores.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement insta = driver1.findElement(By.id("instagram"));
        insta.click();
        String og = driver1.getWindowHandle();
        for (String a : driver1.getWindowHandles()) {
			driver1.switchTo().window(a);
		}
        String url = driver1.getCurrentUrl();
        assertEquals("https://www.instagram.com/", url);
        driver1.close();
        setURL();
    }

    // Comprobamos que al hacer clic en el enlace de TikTok, se redirige a la URL de TikTok
    @Test
    void test11() {
        WebElement buscadores = driver1.findElement(By.id("redes"));
        buscadores.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement tiktok = driver1.findElement(By.id("tiktok"));
        tiktok.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        String url = driver1.getCurrentUrl();
        driver1.navigate().to("http://localhost:3000/");
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        assertEquals("https://www.tiktok.com/es/", url);
    }

    // Comprobamos que al hacer clic en el enlace de Facebook, se redirige a la URL de Facebook
    @Test
    void test12() {
        WebElement buscadores = driver1.findElement(By.id("redes"));
        buscadores.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement facebook = driver1.findElement(By.id("facebook"));
        facebook.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        String url = driver1.getCurrentUrl();
        driver1.navigate().to("http://localhost:3000/");
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        assertEquals("https://es-es.facebook.com/", url);
    }

    // Comprobamos que al hacer clic en el enlace "Volver", la página vuelve a la URL inicial de redes sociales
    @Test
    void test13() {
        WebElement buscadores = driver1.findElement(By.id("redes"));
        buscadores.click();
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement volver = driver1.findElement(By.id("volver"));
        volver.click();
        String url = driver1.getCurrentUrl();
        assertEquals("http://localhost:3000/", url);
    }
    
}
