//open skillrarydemoapp then mousehover to course click on seleniumTraining select the catogary click on contact us
package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLiberaries.WbDriverUtility;

public class SkillraryDemoAppPage {
	//Declaration
	@FindBy(xpath = "//div[@class='navbar-header']")
	private WebElement pageHeader;
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath = "//span[@class='wrappers']/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	@FindBy(name="addresstype")
	private WebElement categoryDropdown;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//Initilization
	public SkillraryDemoAppPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getPageHeader() {
		return pageHeader;
	}
	public void mouseHoverTocourse(WbDriverUtility web) {
		web.mouseHover(courseTab);
	}
	public void clickSeleniumTraining() {
		seleniumTrainingLink.click();
	}
	public void SeleniumCategory(int index, WbDriverUtility web) {
		web.dropdown(index, categoryDropdown);
	}
	public WebElement getContactUs() {
		return contactUsLink;
	}
	public void clickContactUs() {
		contactUsLink.click();
	}

}
