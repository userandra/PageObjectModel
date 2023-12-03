package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ActionClassExample extends BaseTest{
	

	//@Test
	public void hoverExample() throws InterruptedException{
		
		app.hoverElement(app.menu.blogLink);
		Thread.sleep(4000);
		app.hoverElement(app.menu.masonryLink);
		Thread.sleep(5000);
		app.hoverElement(app.menu.portfolioLink);
		Thread.sleep(5000);
		app.hoverElement(app.menu.aboutLink);
		Thread.sleep(3000);
		
	}

	
	//@Test
	
	public void dragAndDropExample() {
		
		app.click(app.menu.shopLink);
		
		app.scrollVertically(350);
		
		app.dragAndDrop(app.shop.sliderInitialPosition, 100, 0);
		app.dragAndDrop(app.shop.sliderFinalPostition, -100, 0);
		
	}
	
	public void sendKeysExample(){
		app.hoverElement(app.menu.blogLink);
		app.click(app.menu.postFormatsLink);
		
		WebElement searchField = app.returnElement(app.postFormat.searchField);
		
		Actions action = new Actions(driver);
		
		action
			.moveToElement(searchField)
			.click()
			.keyDown(Keys.SHIFT)
			.sendKeys(searchField, "abracadabra")
			.perform();
		
		
	}
	
	
	//@Test
		public void sendKeysExample2() throws InterruptedException {
			
			app.click(app.menu.contactsLink);
			
			Actions action =  new Actions(driver);
			
			action
				.sendKeys(app.returnElement(app.contacts.nameField), "Nume")
				.sendKeys(Keys.TAB, "email@email.com")
				.sendKeys(Keys.TAB, "My subject")
				.sendKeys(Keys.TAB, "My message")
				.sendKeys(Keys.TAB , Keys.ENTER)
				.perform();		
			
		}
		
		
		@Test
		public void keysExample() {
			
			app.click(app.menu.loginLink);
			
			Actions action = new Actions(driver);
			
			action.sendKeys(app.returnElement(app.login.usernameField), "Abracadabra").perform();
			
			action.doubleClick().perform();
		
			Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
					
			action
				//.keyDown(Keys.CONTROL)
				.keyDown(cmdCtrl)
				.sendKeys("c")
				//.keyUp(Keys.CONTROL)//.perform();
				.keyUp(cmdCtrl)	
				.sendKeys(Keys.TAB)
				//.keyDown(Keys.CONTROL)
				.keyDown(cmdCtrl)
				.sendKeys("v")
				//.keyUp(Keys.CONTROL).perform();
				.keyUp(cmdCtrl).perform();
		}

}
