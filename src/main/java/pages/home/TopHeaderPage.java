package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.Page;

public class TopHeaderPage extends Page{
	
	 @FindBy(xpath = "//a[@routerlink=\"/signup\"]")
	 private WebElement registerLink;
	 
	 @FindBy(xpath = "//a[@routerlink=\"/login\"]")
	 private WebElement loginLink;


	public TopHeaderPage(WebDriver browser) {
		super(browser);
		PageFactory.initElements(browser, this);
	}
	
	public void navigateToRegister() {
		this.findElementAndClick(registerLink);
    }
	
	public void navigateToLogin() {
		this.findElementAndClick(loginLink);
	}

}
