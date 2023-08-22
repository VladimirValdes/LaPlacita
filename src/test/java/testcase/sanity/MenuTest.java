package testcase.sanity;

import org.testng.annotations.Test;

import pages.home.LeftMenuPage;
import testCaseImplements.TestCase;

public class MenuTest extends TestCase{
	
	@Test
	public void menuTest() {
		
		LeftMenuPage firstMenu = new LeftMenuPage(browser);
		firstMenu.getMenuOptions();
	}

}
