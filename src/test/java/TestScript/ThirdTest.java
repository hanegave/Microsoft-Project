package TestScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLiberaries.BaseClass;

public class ThirdTest extends BaseClass{
@Test
public void ThirdTest() {
	SoftAssert soft = new SoftAssert();
	home.searchFor("core java for selenium");
	soft.assertEquals(coreJava.getPageHeader(), "CORE JAVA FOR SELENIUM");
	coreJava.clickCoreJavaForSeleniumLink();
	soft.assertEquals(javaVideo.getPageHeader(), "Core Java For Selenium Training");
	web.switchToFrame();
	javaVideo.clickPlayButton();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	javaVideo.clickPouseButton();
	web.switchBackFromFrame();
	javaVideo.addToWishlist();
	soft.assertAll();
}


}
