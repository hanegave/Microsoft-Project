//Open the browser enter Skillrary.com  Mouse hover to GEAR click on SKILLRARY DEMO APP 
package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryHomePage {
	//Declaration
	@FindBy(xpath ="//img[@alt='SkillRary']")
	private WebElement logo;
	@FindBy(xpath  ="//input[@placeholder='Search for Courses']")
	private WebElement searchTF;
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchButton;
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsTab;
	@FindBy(xpath = "//ul[contains(@class,'dropdown-menu')]/descendant::a[text()=' SkillRary Demo APP']")
	private WebElement demoAppLink;
	
	//Initialization
	public SkillRaryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getLogo() {
		return logo;
	}
	public void searchFor(String data) {
		searchTF.sendKeys(data);
		searchButton.click();
	}
	public void clickGears() {
		gearsTab.click();
	}
	public void clickSkillrarydemoAoo() {
		demoAppLink.click();
	}
}
