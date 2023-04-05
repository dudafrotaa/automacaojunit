import static org.junit.Assert.*;

import javax.sql.rowset.WebRowSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bancointer {

	
	WebDriver driver;
    
	@Before
	public void setUp() throws Exception {
		// codigo para indicar o navegador
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    // comando para chamar o driver dentro do before
	       driver = new ChromeDriver();
	    	 // comando para indicar URL	   
	       driver.get("https://www.bancointer.com.br/");
			// comando para maximizar a tela
			driver.manage().window().maximize(); 
	        driver.findElement(By.cssSelector("#gatsby-focus-wrapper > div > header > section > div > div > div > div > div.styles__LogoNIcons-sc-1gbjc3e-6.gjJzHM > div.styles__SearchNFlags-sc-1gbjc3e-8.yVPnY > div.styles__ButtonsWrapper-sc-1gbjc3e-9.PKrxs > button:nth-child(1)\")).click();")).click();  	
	        Thread.sleep(6000);
	        driver.findElement(By.name("nome")).sendKeys("Teste flash code");
			driver.findElement(By.id("celular")).sendKeys("11111111111");
			driver.findElement(By.id("email")).sendKeys("teste@teste.com.br");
			driver.findElement(By.id("cpf")).sendKeys("56068906078");
			driver.findElement(By.id("dataNascimento")).sendKeys("21021999");
			driver.findElement(By.cssSelector("body > div.style_ModalContent-wuavw4-0.hOXgJK > div.style_Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div:nth-child(6) > div > label")).click();
		    driver.findElement(By.cssSelector("body > div.style_ModalContent-wuavw4-0.hOXgJK > div.style_Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center > div > div:nth-child(2) > form > div > div.col-12.text-center > button")).click();
	        
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	

	@Test
		public void test() throws InterruptedException {
		Thread.sleep(5000);
		String texto = driver.findElement(By.cssSelector("body > div.style_ModalContent-wuavw4-0.hOXgJK > div.style_Container-sc-138k8xa-0.dlLgSU.d-flex.align-items-center.sent > div > p")).getText();
	    System.out.println(texto);
	    assertEquals(texto,"Prontinho! Recebemos os seus dados.");
	}

}