package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ScrollExample extends BaseTest{
	
	//@Test
		public void scrollExample() {
			
			//JsExecutor scroll
			
			
			//Action class scroll
			Actions action = new Actions(driver);
			action.scrollByAmount(0, 2500).perform();
			
		}
		
		
		//@Test
		public void scrollToWebElement() {
			
			//JSExecutor scroll
			
			
			WebElement signUp = driver.findElement(By.cssSelector("input[value='Sign up']"));
			
			//Action class scroll
			Actions action = new Actions(driver);
			action.scrollToElement(signUp).perform();
			
		}
		
		
		@Test
		public void scrollTopAndDown() throws InterruptedException {
			
			//JSExecutor scroll
			
			
			//Action class scroll
			Actions action = new Actions(driver);		
			action.sendKeys(Keys.END).perform();
			Thread.sleep(4000);
			action.sendKeys(Keys.HOME).perform();
		
		}
		
	

}
