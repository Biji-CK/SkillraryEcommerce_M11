package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	//DECLARATION

		// Address of FaceBook 
		@FindBy(xpath="(//i[@class=\"fa fa-facebook\"])[2]")
		private WebElement facebook;

	//INITIALIZATION
		public TestingPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
	//UTILIZATION

		public WebElement getFacebook() {
			return facebook;
		}
		
		
	//BUSINESS LIBRARY
		public void facebookWebElement()
		{
			facebook.click();	
		}


		

}
