package utils;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	public void hooverElement(By locator) {
		
		Actions action = new Actions(driver);
		action.moveToElement(returnElement(locator)).perform();

	}
	public void dragAndDrop(By locator, int x, int y) {
		Actions action = new Actions(driver);
		//action.dragAndDropBy(returnElement(locator), x, y).perform();
		action.moveToElement(returnElement(locator)).clickAndHold().moveByOffset(x, y).release().perform();
		
	}
	
	public void scrollVertically(int pixels) {
		Actions action = new Actions(driver);
		action.scrollByAmount(0, pixels).perform();
			
	}	
	
}
	
