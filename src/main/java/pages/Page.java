package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

	protected WebDriver browser;
	
	public Page(WebDriver browser) {
		this.browser = browser;
	}
	
	public WebElement findElement(By loc) {
		return browser.findElement(loc);
	}
	
	public void findElementAndClick(WebElement element) {
		WebElement link = fluentWaitElement(element);
		link.click();	
	}
	
	
	public void scrollAndClickElement(WebElement element) {
		scrollToElement(element);
		WebElement link = fluentWaitElement(element);
		link.click();
	}
	
	
	public WebElement fluentWaitElement(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(this.browser)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public WebElement fluentWait(By loc) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(this.browser)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	
	 public Boolean validateTextPresent(WebElement element, String text){
		     Wait<WebDriver> wait = new FluentWait<WebDriver>(this.browser)
		                   .withTimeout(Duration.ofSeconds(5))
                           .pollingEvery(Duration.ofSeconds(5))
		                   .ignoring(NoSuchElementException.class);
		
		    return wait.until(ExpectedConditions.textToBePresentInElement(element,text));
	}
	 
	 
	 private void scrollToElement(WebElement element) {
	((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);", element);
		 
	}
	 
	

	
	
}
