package inventoryTestCase;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.GlobalVariables;
import NavigationPages.InventoryPage;
import NavigationPages.LoginPage;
import SetupDriver.SetupDriver;

public class TC03_VerifyRemoveButton {
	
	
	//delara e inicializar el webdriver y le da la espera de 10 segundos
	
	
	WebDriver driver= SetupDriver.setupDiver();
	
	
	//pageObjects
	LoginPage loginPage= new LoginPage(driver);
	InventoryPage inventoryPage= new InventoryPage(driver);
	
	
	 @BeforeTest 
	 public void starWebDriver() {
		 driver.get(GlobalVariables.HOME_PAGE);
	 }
	
	 
	
  @Test
  
  public void TC03() {
	  loginPage.login(GlobalVariables.STANDAR_USER,GlobalVariables.PASSWORD);
	  boolean isDisplayed= inventoryPage.verifyRemoveButton();
	  Assert.assertTrue(isDisplayed);
  }
  

  @AfterTest
  
  public void closeDriver() {
	driver.quit();
  }
}
