package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JavascriptExecutorExample extends BaseTest{
	
		//@Test
		public void example() {
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			jse.executeScript("window.location='http://emag.ro'");
			//driver.get(url);
			//driver.navigate().to(url);
			
			jse.executeScript("window.history.go(-1)");
			//driver.navigate().back();
		
			jse.executeScript("window.history.forward(-1)");
			//driver.navigate().forward();
		
			//1
			driver.navigate().refresh();
			//2
			Actions action = new Actions(driver);
			action.sendKeys(Keys.F5).perform();
			//3
			jse.executeScript("window.history.go(0)");
			//4
			driver.get(driver.getCurrentUrl());	
		}
		
		@Test
		public void example2() {
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			//alternativa pentru click()
			jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
			//alternativa pentru sendKeys()
			jse.executeScript("arguments[0].value='cooking'", app.returnElement(app.menu.searchField));	
			jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));

			jse.executeScript("arguments[0].click();arguments[1].value='cooking;arguments[0].click();", 
					app.returnElement(app.menu.searchIcon),app.returnElement(app.menu.searchField));
			
			
		
			jse.executeScript("document.getElementsByClassName('icon-search')[0].click();");
			
			
			
		
		}


	
	
	
	

}
