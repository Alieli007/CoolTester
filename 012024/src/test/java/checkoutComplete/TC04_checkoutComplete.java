package checkoutComplete;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import CommonMethods.GlobalVariables;
import CommonMethods.WrapClass;
import NavigationPages.CartPage;
import NavigationPages.Checkout_step_one;
import NavigationPages.Checkout_step_two;
import NavigationPages.InventoryPage;
import NavigationPages.LoginPage;
import SetupDriver.SetupDriver;

public class TC04_checkoutComplete {
	

	
	//delara e inicializar el webdriver y le da la espera de 10 segundos
	
	
	WebDriver driver= SetupDriver.setupDiver();
	
	
	//pageObjects
	LoginPage loginPage= new LoginPage(driver);
	InventoryPage inventoryPage= new InventoryPage(driver);
	CartPage cartpage= new CartPage(driver);
	Checkout_step_one Checkout= new Checkout_step_one(driver);
	Checkout_step_two Checkout2= new Checkout_step_two(driver);
	
	
	 @BeforeTest 
	 public void starWebDriver() {
		 driver.get(GlobalVariables.HOME_PAGE);
	 }
	 
	
	 
  @Test
  public void Tc04() {
	  
	  loginPage.login(GlobalVariables.STANDAR_USER,GlobalVariables.PASSWORD);
	  boolean isDisplayed= inventoryPage.verifyRemoveButton();
	  Assert.assertTrue(isDisplayed);
	  inventoryPage.SelectShopcar();
	  cartpage.Checkoutbtn();
	  Checkout.YourInformation("Alicia", "Mednina", "92243");
	  Checkout2.finishbtnClick();
  }
  
  
 @AfterTest
  
  public void closeDriver() {
	  WrapClass.takescreenshot(driver, "TC04_Login");
	  driver.quit();
  }
}
