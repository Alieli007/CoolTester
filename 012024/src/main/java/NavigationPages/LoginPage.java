package NavigationPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.WrapClass;


public class LoginPage {
	// constructor de la clase
	public  LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	/* Equivalente a esto:
	
			WebElement username = driver.findElement(By.id("user-name"));
			WebElement passwordTxt = driver.findElement(By.name("password"));
			WebElement LoginBtn = driver.findElement(By.id("login-button"));
			
	*/
	
	@FindBy(id = "user-name")
	private WebElement userNameText;
	
	@FindBy(id = "password")
	private WebElement PasswordText;
	
	@FindBy(id = "login-button")
	private WebElement BtnLogin;
	//buscar elemento de texto
	@FindBy(xpath = "//* [ @data-test = 'error' ]")
	private WebElement LockError;
	
	public void login(String user, String pwd) {
		WrapClass.sendKeys(userNameText, user);
		WrapClass.sendKeys(PasswordText, pwd);
		WrapClass.click(BtnLogin);
	}
	
	public  boolean validateLockerror() {
		
		boolean errorDisplayed = WrapClass.getText(LockError).contains("Sorry, this user has been loocked out.");
		return errorDisplayed;
	}
	
	
	
}
