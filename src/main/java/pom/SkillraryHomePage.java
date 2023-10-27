package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage 
{
//DECLARATION
	
	//Address of Gears
	@FindBy(xpath="//a[.=' GEARS ']")
	private WebElement gearsbtn;
	
	//Address of SkillraryDemoapp
	@FindBy(xpath="(//a[.=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;
	
	//Address of Search text field
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtf;
	
	//Address of Search icon
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchIcon;
	
//INITIALIZATION
	public SkillraryHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//UTILIZATION
	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	public WebElement getSkillraryDemoApp() {
		return skillraryDemoApp;
	}

	public WebElement getSearchtf() {
		return searchtf;
	}
	
	public WebElement getSearchIcon() {
		return searchIcon;
	}

//BUSINESS LIBRARIES
	public void gearsButton()
	{
		gearsbtn.click();
		
	}
	public void skillraryDemoApp()
	{
		skillraryDemoApp.click();
		
		
	}
	public void searchTextField(String data)
	{
		searchtf.sendKeys(data);
		
	}
	
	
	
	
	
	
	
	
	
	

}
