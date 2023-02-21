package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLiberaries.BaseClass;

public class FirstTest extends BaseClass {
	@Test
	public void firstTest() {
	
		SoftAssert soft = new SoftAssert();
		home.clickGears();
		home.clickSkillrarydemoAoo();
		web.handleChiledBrowser();
		
		soft.assertTrue(SkillraryDemo.getPageHeader().isDisplayed());
		
		SkillraryDemo.mouseHoverTocourse(web);
		SkillraryDemo.clickSeleniumTraining();
		
		soft.assertEquals(Selenium.getPageHeader().getText(), "Selenium Training");
		Selenium.doubleClickPlusButton(web);
		Selenium.clickAddToCart();
		web.handleAlert();
		web.explicitWait(Selenium.getItemAddedMessage(), time);
		web.takeScreenshot();
		soft.assertTrue(Selenium.getItemAddedMessage().isDisplayed());
		
		soft.assertAll();
	}
	

}
