package scripts;

import org.testng.annotations.Test;

import generic_Library.BaseClass;
import pom.DemoSkillraryPage;
import pom.SkillraryHomePage;
import pom.TestingPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() throws Throwable
	{
		SkillraryHomePage hp=new SkillraryHomePage(driver);
		hp.gearsButton();
		hp.skillraryDemoApp();
		utilities.childBrowser(driver);
		DemoSkillraryPage sp=new DemoSkillraryPage(driver);
		utilities.dropDown(sp.getSelectDd(),pdata.getPropertyData("courseDd"));
		TestingPage tp=new TestingPage(driver);
		utilities.scrollingWithElementAddress(driver,tp.getFacebook());
		Thread.sleep(3000);
		tp.facebookWebElement();
	}
}
