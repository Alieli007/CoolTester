package seleniumPrac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		// 	implicitwait.
	
		driver.get("https://www.saucedemo.com/");
		// user-name, password, login-button
		
		WebElement username= new WebDriverWait(driver,Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.id("user-name")));
		//WebElement username = driver.findElement(By.id("user-name"));
		
		driver.quit();

	}

}
