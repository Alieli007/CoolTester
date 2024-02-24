package LoginTestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.GlobalVariables;
import CommonMethods.WrapClass;
import NavigationPages.LoginPage;
import SetupDriver.SetupDriver;

public class TC03_LoginJsonData {
	
	
	//delara e inicializar el webdriver y le da la espera de 10 segundos
	
	
	WebDriver driver= SetupDriver.setupDiver();
	
	
	//pageObjects
	LoginPage loginPage= new LoginPage(driver);
	
	
	 @BeforeTest 
	 public void starWebDriver() {
		 driver.get(GlobalVariables.HOME_PAGE);
	 }
	
	 
	
  @Test
  public void TC03() {
	  
	  String user= WrapClass.getJsonValue("TC_05", "username");
	  String pwd= WrapClass.getJsonValue("TC_05", "password");
	  
	  System.out.println("usuario"+user +" pwd"+pwd);
	  loginPage.login(user,pwd);
  }
  @AfterTest
  
  public void closeDriver() {
	  WrapClass.takescreenshot(driver, "TC01_Login");
	  driver.quit();
  }
}
