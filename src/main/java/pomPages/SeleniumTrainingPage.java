//go to skillrary go to selenium training page double click on plus button click on addto cart and check if it is added or not
package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import GenericLiberaries.WbDriverUtility;

public class SeleniumTrainingPage {
	//Declaration
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(id="add")
	private WebElement plusButton;
	@FindBy(xpath = "//button[text()=' Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//span[text()='Item added to cart']")
	private WebElement getItemAddedMessage;
	
	//Initialization
	public SeleniumTrainingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getPageHeader() {
		return pageHeader;
	}
	public void doubleClickPlusButton(WbDriverUtility web) {
		web.doubleClick(plusButton);
	}
	public void clickAddToCart() {
		addToCartButton.click();
	}
	public WebElement getItemAddedMessage() {
		return getItemAddedMessage;
	}
	

}
