package testCaseImplements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestCase {

	protected static WebDriver browser;
	
	@BeforeClass
	public static void setUp() {
		browser = new EdgeDriver();
	}
	
	@BeforeMethod
	public static void setUpBrowser() {
		browser.get("https://ezone-web.uat.creativaconsultores.com/signup");
		browser.manage().window().maximize();
	}
	
	  @AfterClass
	    public void tearDown() {
	        if (browser != null) {
	        	//browser.quit();
	        }
	    }
}
