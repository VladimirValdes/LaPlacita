package testcase.sanity;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.home.TopHeaderPage;
import testCaseImplements.TestCase;

public class LogoutTest extends TestCase{

	@Test
	
	public void logoutUserTest() {
		
		TopHeaderPage header = new TopHeaderPage(browser);
		header.navigateToLogin();
		
		
		LoginPage login = new LoginPage(browser);
		
		login.setEmailInput("juantest16@gmail.com");
		login.setPasswordInput("12345T3st");
		login.clickLogin();
		login.getSuccessRegisterMessage("Freddy Flores");
		
		header.logout();
		
		assertTrue(header.validateRegisterLink("Regístrate"));
		assertTrue(header.validateLoginLink("Iniciar sesión"));
		
	}
}
