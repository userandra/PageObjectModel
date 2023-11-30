package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class IframeExample extends BaseTest{
	
	@Test
	public void iframeExampleTest() throws InterruptedException {
	
	app.click(app.menu.contactsLink);
	Thread.sleep(5000);
	app.contacts.zoomMap(app.contacts.zoomOutMap);
	
	
	driver.switchTo().defaultContent();
	app.sendKeys(app.contacts.nameField, "Test Ceva");
	}
	
	

}
