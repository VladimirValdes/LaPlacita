package testcase.sanity;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.ContactPage;
import pages.home.LeftMenuPage;
import testCaseImplements.TestCase;

public class ContactTest extends TestCase{

	@Test
	public void FormContactTest() {
		
		LeftMenuPage menu = new LeftMenuPage(browser);
		menu.navigateToOption(2);
		
		ContactPage contact = new ContactPage(browser);
		contact.setName("Test1");
		contact.setEmail("juantest10@gmail.com");
		contact.setPhoneNumber("77777777");
		contact.setSubject("Pruebas la placita");
		contact.setMessage("pruebas la placita, desde formulario de contacto");
		contact.clickMessageBtn();
		assertTrue(contact.getSuccessContactMessage("Mensaje enviado, pronto te contactaremos"));

	}
}
