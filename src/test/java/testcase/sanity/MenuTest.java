package testcase.sanity;

import org.testng.annotations.Test;

import pages.home.LeftMenuPage;
import pages.home.RightMenuPage;
import testCaseImplements.TestCase;

public class MenuTest extends TestCase{
	
	@Test
	public void leftMenuTest() {
		
		LeftMenuPage menuLeft = new LeftMenuPage(browser);
		menuLeft.getMenuOptions();
	}
	
	@Test
	public void rightMenuTest() {
		
		RightMenuPage menuRight = new RightMenuPage(browser);
		menuRight.getMenuOptions();
	}

}
