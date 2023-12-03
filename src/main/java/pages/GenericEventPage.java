package pages;

import org.openqa.selenium.By;

import utils.SeleniumWrappers;

public class GenericEventPage extends SeleniumWrappers{
	
	//facem un element
	public By largerMapLink = By.partialLinkText("map");
	//pagina noua creata o mutam in BasePage
	public By iframeElement = By.tagName("iframe");
	
	public void clickLargerMap() {
		
		driver.switchTo().frame(returnElement(iframeElement));
		click(largerMapLink);
		driver.switchTo().defaultContent();
	}
}
