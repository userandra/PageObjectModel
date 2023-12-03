package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class WindowHandle extends BaseTest{

		@Test
		public void windowHandleTest() throws InterruptedException {
			
			app.click(app.menu.eventsLink);
			app.click(app.events.seminarOfModernArtLink);
			
			app.scrollVertically(800);
			
			System.out.println("Selenium tab : " + driver.getWindowHandle());
					
			app.genericEvent.clickLargerMap();
			
			System.out.println("Selenium tab after click: " + driver.getWindowHandle());
			System.out.println("All tabs : " + driver.getWindowHandles());
			
			List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(browserTabs.get(1));
			
			driver.findElement(By.xpath("//span[contains(text(), 'Accept all')]")).click();
			
			Thread.sleep(3000);
			
			driver.close();
			
			driver.switchTo().window(browserTabs.get(0));
			
			app.genericEvent.clickLargerMap();

		}
		
		
		/* 
		 * for(int i = 0, i<browserTabs.size(); i++){
		 *	
		 *  driver.switchTo().window(browserTabs.get(i));

		 *   if(driver.getCurrentUrl().equals("My url")){
		 *   	app.click()
		 *   
		 *   } 
		 * }
		 */
		
}
	

