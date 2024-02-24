package seleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) {
		// findelements en prluaral es traer todo los elementos con essos atributos
		
		WebDriver driver = new ChromeDriver();
		// 	driver.get("https://www.google.com");
		
		driver.get("https://www.saucedemo.com/");
		// user-name, password, login-button
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement LoginBtn = driver.findElement(By.id("login-button"));
		
		//hacr login.
		
		username.sendKeys("standard_user");
		//Thread.sleep(500);
		passwordTxt.sendKeys("secret_sauce");
		//Thread.sleep(500);
		LoginBtn.click();
		
		
		// findelements, variable de lista, todo los elemnetos los guarda ahi.
		
		List<WebElement> prodlists=  driver.findElements(By.className("inventory_item_name"));
		System.out.println("Numero   "+prodlists.size());
		
		String primer= prodlists.get(0).getText();
		
		
		for( int i=0; i< prodlists.size(); i++) {
			System.out.println("Numero   "+prodlists.get(i).getText());
			
		}
			
		// esperas en selenium webdriver soluciona o evita fecuetnes errores de tiempo. immpricit wait todoe en general explisit para elemento ene specifico.
		
		
		
		
		
		
		
		

	}

}
