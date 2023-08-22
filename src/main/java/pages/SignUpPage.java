package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends Page {
	
 @FindBy(id = "firstName")
 private WebElement firstNameInput;

 @FindBy(id = "lastName")
 private WebElement lastNameInput;
	
 @FindBy(id = "phone")
 private WebElement phoneInput;
	
 @FindBy(id = "email")
 private WebElement emailInput;
	
 @FindBy(id = "password")
 private WebElement passwordInput;
	
 @FindBy(id = "confirmPassword")
 private WebElement confirmPasswordInput;
	
 @FindBy(id = "acceptTerms")
 private WebElement acceptTermsCheckbox;
	
 @FindBy(xpath = "//button[text() ='Regístrate']")
 private WebElement registerBtn;

 @FindBy(id = "swal2-title")
 private WebElement successRegisterText;


 public SignUpPage(WebDriver browser) {
		super(browser);
		PageFactory.initElements(browser, this);
 }
 
 public void setfirstNameInput(String firstName) {
   firstNameInput.sendKeys(firstName);
  }

 public void setLastNameInput(String lastName) {
    lastNameInput.sendKeys(lastName);
   }

 public void setPhoneInput(String phone) {
     phoneInput.sendKeys(phone);
}

public void setEmailInput(String email) {
     emailInput.sendKeys(email);
}

public void setPasswordInput(String password) {
     passwordInput.sendKeys(password);
}

public void setPasswordConfirmInput(String confirmPassword) {
     confirmPasswordInput.sendKeys(confirmPassword);
}

public void checkAcceptTerms() {
     acceptTermsCheckbox.sendKeys(Keys.SPACE);;
}

public void clickRegister() {
     this.findElementAndClick(registerBtn);
}

public String getSuccessRegisterMessage(String text) {
     return this.validateTextPresent(successRegisterText, text);
}      


}
