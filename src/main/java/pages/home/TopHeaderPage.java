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
	 
	 @FindBy(xpath = "//a[ text() = 'Cerrar sesión']")
	 private WebElement logoutLink;
	 
	 @FindBy(xpath = "(//a[@href='https://www.instagram.com/laplacitasv'])[1]")
	 private WebElement instagramLink;
	 
	 @FindBy(xpath = "(//a[@href='https://www.facebook.com/LaPlacita_Market_Place'])[1]")
	 private WebElement facebookLink;


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
	
	public void logout() {
		this.scrollAndClickElement(logoutLink);
	}
	
	public Boolean validateRegisterLink(String text) {
		return this.validateTextPresent(registerLink, text);
	}
	
	public Boolean validateLoginLink(String text) {
		return this.validateTextPresent(loginLink, text);
	}

}
