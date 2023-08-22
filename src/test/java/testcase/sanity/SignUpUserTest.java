package testcase.sanity;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.SignUpPage;
import pages.home.TopHeaderPage;
import testCaseImplements.TestCase;

public class SignUpUserTest extends TestCase {

	@Test
    public void signUpTest() {
            TopHeaderPage header = new TopHeaderPage(browser);
            header.navigateToRegister();


            SignUpPage signUp = new SignUpPage(browser);
            signUp.setfirstNameInput("Freddy");
            signUp.setLastNameInput("Flores");
            signUp.setPhoneInput("77777799");
            signUp.setEmailInput("juantest14@gmail.com");
            signUp.setPasswordInput("12345T3st");
            signUp.setPasswordConfirmInput("12345T3st");
            signUp.checkAcceptTerms();
            signUp.clickRegister();
            assertTrue(signUp.getSuccessRegisterMessage("Registro exitoso!"));
    }

}
