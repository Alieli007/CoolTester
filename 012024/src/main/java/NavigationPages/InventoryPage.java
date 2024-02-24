package NavigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonMethods.WrapClass;

public class InventoryPage {
	
	
	
	public  InventoryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addBtn;
	
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement rmoveBtn;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement SelecrCar;
	

	
	public  boolean verifyRemoveButton() {
		WrapClass.click(addBtn);
		return WrapClass.verifyelementdisplayed(rmoveBtn);
	
	}
	
	public  void SelectShopcar() {
		WrapClass.click(SelecrCar);
		
	}
	

}
