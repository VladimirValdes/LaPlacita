package testcase.sanity;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.home.TopHeaderPage;
import testCaseImplements.TestCase;

public class LoginTest extends TestCase{

	
	@Test
	
	public void userLoginTest() {
		
		TopHeaderPage header = new TopHeaderPage(browser);
		header.navigateToLogin();
		
		
		LoginPage login = new LoginPage(browser);
		
		login.setEmailInput("juantest16@gmail.com");
		login.setPasswordInput("12345T3st");
		login.clickLogin();
		login.getSuccessRegisterMessage("Freddy Flores");
	}
}
