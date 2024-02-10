package tarea1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class tareacompra1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		
		
		//Login
		username.sendKeys("standard_user");
		//Thread.sleep(500);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(500);
		LoginBtn.click();
		
		WebElement backp = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		backp.click();
		Thread.sleep(500);
		//carrito de comprar
		WebElement carrito= driver.findElement(By.className("shopping_cart_link"));
		Thread.sleep(500);
		carrito.click();
		
		WebElement cout= driver.findElement(By.id("checkout"));
		cout.click();
		Thread.sleep(500);
		//llenado del formulario
		WebElement nomb= driver.findElement(By.id("first-name"));
		nomb.sendKeys("Alicia");
		WebElement apell= driver.findElement(By.id("last-name"));
		apell.sendKeys("Medina");
		WebElement codigo= driver.findElement(By.id("postal-code"));
		codigo.sendKeys("Medina");
		Thread.sleep(500);
		WebElement cont= driver.findElement(By.id("continue"));
		cont.click();
		Thread.sleep(500);
		WebElement termin= driver.findElement(By.id("finish"));
		termin.click();
		
		//comparacion de cadena de confirmacion
		
		String texto= driver.findElement(By.className("complete-header")).getText();
		
		boolean correctText = texto.contains("Thank you for your order!");
		
		if(correctText) {
			System.out.println("correcto: Thank you for your order!");
		}else {
			System.out.println("incorecto  ");
			
		}
		
		
		
	}

}
