package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends Page {

	public SignUpPage(WebDriver browser) {
		super(browser);
		PageFactory.initElements(browser, this);
	}

}
