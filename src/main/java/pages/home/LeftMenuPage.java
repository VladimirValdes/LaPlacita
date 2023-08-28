package pages.home;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.Page;

public class LeftMenuPage extends Page {
	
	@FindBy(xpath = "//div[@id=\"navbarNavDropdown\"]/div/ul[1]/li/a")
	 private List<WebElement> menuItems;

	public LeftMenuPage(WebDriver browser) {
		super(browser);
		PageFactory.initElements(browser, this);
	}
	
	public void getMenuOptions() {
		
		for (WebElement item : menuItems) {
			 String menuText = item.getText();
	         String menuUrl = item.getAttribute("href");
	         
	         item.click();;
	            
	            if (browser.getCurrentUrl().contains(menuUrl)) {
					System.out.println("Menu item '" + menuText + "' navigates to the correct page. " + menuUrl);
				} else {
					System.out.println("Menu item '" + menuText + "' navigates to the incorrect page. " + menuUrl);

				}
	            
	           
		}
	}
	
	public void navigateToOption(int idx) {
		menuItems.get(idx).click();
	}

}
