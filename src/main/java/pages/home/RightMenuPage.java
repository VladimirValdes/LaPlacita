package pages.home;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pages.Page;

public class RightMenuPage extends Page {
	
	@FindBy(xpath = "//div[@id=\"navbarNavDropdown\"]/div/ul[2]/li/a")
	 private List<WebElement> menuItems;

	public RightMenuPage(WebDriver browser) {
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
					}     
		            
		           
			}
	}
	
	

}
