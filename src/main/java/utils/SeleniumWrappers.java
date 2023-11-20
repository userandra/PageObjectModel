package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers extends BaseTest{
	
	public void click(By locator) {
		WebElement element = driver.findElement(locator);
		
		
	}

	
	public void sendKeys(By locator, String text) {
		WebElement element = driver.findElement(locator);
		returnElement(locator).sendKeys(text);
		
		
	}
	public WebElement returnElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public void waitForElementToBeVisible(By locator) {
		
		WebDriverWait wait = new WebDriverWait(driver, durationOfSeconds)
		
	}
	
}
