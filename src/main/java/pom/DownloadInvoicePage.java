package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownloadInvoicePage {
//DECLARATION

	// Address of DownLoad Invoice
	@FindBy(xpath = "//input[@name='downloadInvoice']")
	private WebElement downloadInvoiceBtn;

//INITIALIZATION
	public DownloadInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//UTILIZATION

	public WebElement getDownloadInvoiceBtn() {
		return downloadInvoiceBtn;
	}

//BUSINESS LIBRARY
	public void downloadInvoiceBtn() {
		downloadInvoiceBtn.click();

	}

}
