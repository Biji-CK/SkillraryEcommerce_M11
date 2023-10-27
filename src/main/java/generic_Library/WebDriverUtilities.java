package generic_Library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	//1.HANDLING DROPDOWN
	public void dropDown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);

	}
	//2.HANDLING MOUSEHOVER
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//3.HANDLING RIGHTCLICK
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	//4.HANDLING DOUBLECLICK
	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();

	}
	//5.HANDLING DRAGANDDROP
	public void dragAndDrop(WebDriver driver, WebElement ele1, WebElement ele2) {
		Actions a = new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
	}

	// 6.HANDLING FRAME
	public void Frames(WebDriver driver, String value) {
		driver.switchTo().frame(value);
	}

	// 7.HANDLING DEFAULT CONTENT
	public void defaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// 8.HANDLING SCROLLING
	public void scrollingWithElementAddress(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	// 9.HANDLING ALERT POPUP
	public void alertPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	// 10.HANDLING CHILD BROWSER
	public void childBrowser(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String a : child) {
			driver.switchTo().window(a);
		}
	}

}
