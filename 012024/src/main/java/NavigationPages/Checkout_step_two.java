package NavigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.WrapClass;

public class Checkout_step_two {

	
	
	
	public  Checkout_step_two (WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(id = "finish")
	private WebElement Finishbtn;
	
	
	

	
	public  void finishbtnClick() {
		WrapClass.click(Finishbtn);
	
	}
	

	
	
	
}
