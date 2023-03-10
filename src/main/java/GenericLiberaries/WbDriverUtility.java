package GenericLiberaries;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WbDriverUtility {
	WebDriver driver;
	public WebDriver openApplication(String browser, String url, long time) {
		switch(browser) {
		case "chrome" : driver = new ChromeDriver(); break;
		case "firefox": driver = new FirefoxDriver(); break;
		case "edge"   : driver = new EdgeDriver();   break;
		default:System.out.println("Invalid browser data");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		return driver;
	}
	public void mouseHover(WebElement element) {
		Actions a = new Actions (driver);
		a.moveToElement(element).perform();
	}
	public void dragAndDropElement(WebElement src, WebElement dest) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	public void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element);
	}
	public void dropdown(int index, WebElement element) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public void dropdown(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}
	public void dropdown(String value ,WebElement element) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public void switchToFrame() {
		driver.switchTo().frame(0);
	}
	public void switchBackFromFrame() {
		driver.switchTo().defaultContent();
	}
	public void handleAlert() {
		driver.switchTo().alert().accept();
	}
	public void handleChiledBrowser() {
		Set<String> windowIDs = driver.getWindowHandles();
		for(String string : windowIDs){
			driver.switchTo().window(string);
		}
	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public void takeScreenshot() {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/picture.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void explicitWait(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void closeCurrentWindow() {
		driver.close();
	}
	public void quitBrowsee() {
		driver.quit();
	}
	

}
