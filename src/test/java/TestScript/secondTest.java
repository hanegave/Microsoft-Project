package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLiberaries.BaseClass;


public class secondTest extends BaseClass {
	@Test
	public void secondTest1() {
		
	SoftAssert soft = new SoftAssert();
	home.clickGears();
	home.clickSkillrarydemoAoo();
	web.handleChiledBrowser();
	
	soft.assertTrue(SkillraryDemo.getPageHeader().isDisplayed());
	
	SkillraryDemo.SeleniumCategory(1, web);
	soft.assertEquals(testing.getPageHandler(), "Testing");
	
	web.dragAndDropElement(testing.getSeleniumImage(), testing.getCartArea());
	web.scrollToElement(testing.getFacebookIcon());
	testing.clickFacebookIcon();
	
	soft.assertAll();
}
}