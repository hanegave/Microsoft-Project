package TestScript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLiberaries.BaseClass;

public class FourthTest extends BaseClass {
	@Test
	public void FourthTest1() {
		SoftAssert soft = new SoftAssert();
		
		home.clickGears();
		home.clickSkillrarydemoAoo();
		web.handleChiledBrowser();
		
		soft.assertTrue(SkillraryDemo.getPageHeader().isDisplayed());
		
		web.scrollToElement(SkillraryDemo.getContactUs());
		SkillraryDemo.clickContactUs();
		
		soft.assertTrue(contact.getPageHeader().isDisplayed());
		
		List<String> data = excel.FetchDataFromExcel("Sheet1");
		contact.submitDetails(data.get(0), data.get(1), data.get(2), data.get(3));
		
		soft.assertAll();
	}

}
