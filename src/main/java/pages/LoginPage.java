package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page{
	
	@FindBy(id = "email")
	 private WebElement emailInput;
		
	 @FindBy(id = "password")
	 private WebElement passwordInput;
		
	 @FindBy(id = "remember")
	 private WebElement rememberCredentials;
		
	 @FindBy(xpath = "//button[text() ='Iniciar sesión']")
	 private WebElement loginBtn;

	 @FindBy(xpath = "//div[@tooltip=\"Cuenta\"]/a/div/span")
	 private WebElement sucessLogin;
	 
	public LoginPage(WebDriver browser) {
		super(browser);
		PageFactory.initElements(browser, this);
	}
	
	
	public void setEmailInput(String email) {
	     emailInput.sendKeys(email);
	}

	public void setPasswordInput(String password) {
	     passwordInput.sendKeys(password);
	}


	public void checkRememberCredentials() {
	     rememberCredentials.sendKeys(Keys.SPACE);;
	}

	public void clickLogin() {
	     this.scrollAndClickElement(loginBtn);
	}

	public Boolean getSuccessRegisterMessage(String text) {
		
	    return this.validateTextPresent(sucessLogin, text);
	}      


}
