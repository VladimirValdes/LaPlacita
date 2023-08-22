package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.Page;

public class TopHeaderPage extends Page{

	public TopHeaderPage(WebDriver browser) {
		super(browser);
		PageFactory.initElements(browser, this);
	}

}
