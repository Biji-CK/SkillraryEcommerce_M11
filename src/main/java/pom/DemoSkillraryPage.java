package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryPage {
// DECLARATION

	// Address of Select Category
	@FindBy(name = "addresstype")
	private WebElement selectDd;

	// Address of FeedBack
	@FindBy(xpath = "//a[.='FEEDBACK']")
	private WebElement feedBackBtn;

//INITIALIZATION
	public DemoSkillraryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

// UTILIZATION
	public WebElement getSelectDd() {//for getting the address
		return selectDd;
	}

	public WebElement getFeedBackBtn() {
		return feedBackBtn;
	}

//BUSINESS LIBRARY
	public void feedBackBtn() {//if you want to perform some actions like click on the element
		feedBackBtn.click();

	}

}
