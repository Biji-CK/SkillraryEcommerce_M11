package scripts;

import org.testng.annotations.Test;

import generic_Library.BaseClass;
import pom.DemoSkillraryPage;
import pom.DownloadInvoicePage;
import pom.SkillraryHomePage;

public class TestCase2 extends BaseClass 
{
	@Test
	public void tc2() throws Throwable
	{
		SkillraryHomePage hp=new SkillraryHomePage(driver);
		hp.gearsButton();
		hp.skillraryDemoApp();
		utilities.childBrowser(driver);
		DemoSkillraryPage sp=new DemoSkillraryPage(driver);
		sp.feedBackBtn();
		DownloadInvoicePage ip=new DownloadInvoicePage(driver);
		ip.downloadInvoiceBtn();
	}

}
