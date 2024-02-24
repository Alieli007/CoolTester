package LoginTestCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.GlobalVariables;
import NavigationPages.LoginPage;
import SetupDriver.SetupDriver;

public class TC02_Login {
	
	
	//delara e inicializar el webdriver y le da la espera de 10 segundos
	
	
	WebDriver driver= SetupDriver.setupDiver();
	
	
	//pageObjects
	LoginPage loginPage= new LoginPage(driver);
	
	
	 @BeforeTest 
	 public void starWebDriver() {
		 driver.get(GlobalVariables.HOME_PAGE);
	 }
	
	 
	
  @Test
  public void TC02() {
	  loginPage.login(GlobalVariables.LOCKED_USER,GlobalVariables.PASSWORD);
  }
  @AfterTest
  
  public void closeDriver() {
	  driver.quit();
  }
}
