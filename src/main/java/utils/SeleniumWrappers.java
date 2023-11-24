package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers extends BaseTest{
	
	public void click(By locator) {
		
		try {
			//WebElement element = driver.findElement(locator);
			waitForElementToBeVisible(locator);
			returnElement(locator).click();
		}catch (StaleElementReferenceException e) {
			
			returnElement(locator).click();
		}
		
	}

	
	public void sendKeys(By locator, String text) {
		//WebElement element = driver.findElement(locator);
		waitForElementToBeVisible(locator);
		returnElement(locator).clear();
		returnElement(locator).sendKeys(text);
	}
		//returnElement(locator).sendKeys(text);
		
	public WebElement returnElement(By locator) {
		return driver.findElement(locator);

	}
	
	public void waitForElementToBeVisible(By locator) {
		
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
		
	public boolean elementIsDisplayed(By locator) {
		waitForElementToBeVisible(locator);
		return driver.findElement(locator).isDisplayed();	
		
	}
	
		
}
	
