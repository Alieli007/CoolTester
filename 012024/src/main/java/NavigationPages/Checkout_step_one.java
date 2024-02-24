package NavigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.WrapClass;

public class Checkout_step_one {
	
	
	public   Checkout_step_one(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(id = "first-name")
	private WebElement firstname;
	@FindBy(id = "last-name")
	private WebElement lastname;
	@FindBy(id = "postal-code")
	private WebElement postalcode;
	@FindBy(id = "continue")
	private WebElement continuebtn;
	

	
	public  void YourInformation(String first, String last, String postal) {
		
		WrapClass.sendKeys(firstname, first);
		WrapClass.sendKeys(lastname, last);
		WrapClass.sendKeys(postalcode, postal);
		WrapClass.click(continuebtn);
		
	}

}
