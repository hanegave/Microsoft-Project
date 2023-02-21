package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class coreJavaVideoPage {
	//declaration
	@FindBy(xpath ="//h1" )
	private WebElement pageHeader;
	@FindBy(xpath = "//button[@aria-lable='Play']")
	private WebElement playButton;
	@FindBy(xpath = "//button[@aria-lable='Pouse']")
	private WebElement pouseButton;
	@FindBy(xpath = "//span[text()='Add To Wishlist']")
	private WebElement addToWishlistTab;
	@FindBy(xpath = "//a[text()='X']")
	private WebElement cancelCookies;
	
	//initialization
	public coreJavaVideoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickPlayButton() {
		playButton.click();
	}
	public void clickPouseButton() {
		pouseButton.click();
	}
	public void addToWishlist() {
		addToWishlistTab.click();
	}
	public void cancelCookies() {
		cancelCookies.click();
	}
	

}
