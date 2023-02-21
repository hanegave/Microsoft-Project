package GenericLiberaries;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.util.Assert;

import pomPages.ContactUsPage;
import pomPages.SeleniumTrainingPage;
import pomPages.SkillRaryHomePage;
import pomPages.SkillraryDemoAppPage;
import pomPages.TestingPage;
import pomPages.coreJavaForSeleniumPage;
import pomPages.coreJavaVideoPage;

public class BaseClass {
	protected PropertiesFileUtility property;
	protected ExcelUtility excel;
	protected WbDriverUtility web;
	protected WebDriver driver;
	protected SkillRaryHomePage home;
	protected SkillraryDemoAppPage SkillraryDemo;
	protected SeleniumTrainingPage Selenium;
	protected TestingPage testing;
	protected coreJavaForSeleniumPage coreJava;
	protected coreJavaVideoPage javaVideo;
	protected ContactUsPage contact;
	protected long time;
	
	//@BeforeSuite
	//@BeforeTest
	@BeforeClass
	public void classConfigration() {
		 property = new PropertiesFileUtility();
		 excel = new ExcelUtility();
		 web =new WbDriverUtility();
		 
		property.PropertyFileInitialization(IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
		
	}
	@BeforeMethod
	public void methodConfigration() {
		time= Long.parseLong(property.FetchProperty("timeouts"));
		driver = web.openApplication(property.FetchProperty("browser"), property.FetchProperty("url"), time);
		
	home = new SkillRaryHomePage(driver);
	
	
	
	SkillraryDemo = new SkillraryDemoAppPage(driver);
	Selenium = new SeleniumTrainingPage(driver);
	coreJava = new coreJavaForSeleniumPage(driver);
	javaVideo = new coreJavaVideoPage(driver);
	testing = new TestingPage(driver);
	contact = new ContactUsPage(driver);
	}
	@AfterMethod
	public void methodTearDown() {
		web.quitBrowsee();
	}
	@AfterClass
	public void classTearDown() {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite
}
