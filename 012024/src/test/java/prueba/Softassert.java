package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
  @Test
  public void f() {
	  
	  SoftAssert softAssert = new SoftAssert();
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  
	  String actualTitle= driver.getTitle();
	  String expectedTitle="Swag Labs";
	  String badTitle="Swagn Labs";
	  
	  
	  softAssert.assertEquals(actualTitle,expectedTitle);
	  softAssert.assertEquals(badTitle,expectedTitle);
	  driver.quit();
	  softAssert.assertAll();
	  
  }
}
