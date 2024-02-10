package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		//metodo del explorador
		//obtener el titulo de la paginaget
		String titulo=driver.getTitle();
		
		System.out.println("titulo  "+titulo);
		
		//obtener url
		
		String url = driver.getCurrentUrl();
		System.out.println("url  "+url);
		
		//metodos navegacion
		/*
		 * navigate().back();
		 
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		*/
		
		//obtener elemendo desplegado en pagona
		
		boolean producto= driver.findElement(By.className("inventory_item_name")).isDisplayed();
		System.out.println("prdodcut  "+producto);
		
		String prodtext= driver.findElement(By.className("inventory_item_name")).getText();
	
		boolean correctText = prodtext.contains("Sauce Labs Backpack");
		
		if(correctText) {
			System.out.println("correcto");
		}else {
			System.out.println("incorecto  ");
			
		}
	
		
		// select dropdow,class="product_sort_container"
		//Thread.sleep(2000);
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByValue("lohi");
	
		
		//cerrar navegador
		
		driver.close();//cierra ventana actual con la que se esta interactuando. solo una ventana 
		driver.quit();//cierra toda las ventanas o pestañas que se abrieron durante la ejecucion.
	}

}
