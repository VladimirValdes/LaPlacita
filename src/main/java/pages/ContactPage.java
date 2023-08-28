package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends Page {
	
	@FindBy(id = "name")
	 private WebElement nameInput;
	
	@FindBy(id = "email")
	 private WebElement emailInput;
	
	@FindBy(id = "phone")
	 private WebElement phoneInput;
	
	@FindBy(id = "subject")
	 private WebElement subjectInput;

	@FindBy(id = "message")
	 private WebElement messageInput;
	
	@FindBy(xpath = "//button[contains(text(), 'Enviar mensaje')]")
	 private WebElement sendMessageBtn;
	
	@FindBy(id = "swal2-title")
	 private WebElement successContactMessage;
		
	public ContactPage(WebDriver browser) {
		super(browser);
		PageFactory.initElements(browser, this);
	}
	
	public void setName(String name) {
		nameInput.sendKeys(name);
	}
	
	public void setEmail(String email) {
		emailInput.sendKeys(email);
	}
	
	public void setPhoneNumber(String phone) {
		phoneInput.sendKeys(phone);
	}
	
	public void setSubject(String subject) {
		subjectInput.sendKeys(subject);
	}
	
	public void setMessage(String message) {
		messageInput.sendKeys(message);
	}
	
	public void clickMessageBtn() {
		this.scrollAndClickElement(sendMessageBtn);
	}
	
	public Boolean getSuccessContactMessage(String text) {
		
	    return this.validateTextPresent(successContactMessage, text);
	}

}
