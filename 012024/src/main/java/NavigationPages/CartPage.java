package NavigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.WrapClass;

public class CartPage {
	
	
	
	
	
	public   CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(id = "checkout")
	private WebElement Checkoutbtn;
	

	
	public  void Checkoutbtn() {
		WrapClass.click(Checkoutbtn);
		
	}

}
