package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumWrappers;

public class MenuPage extends SeleniumWrappers{
	
	//public WebDriver driver; //obiectul
	
	private WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
}
	
	//MenuPage menu = new MenuPage(driver);
	
	//WebElement shopLink = driver.findElement(By.cssSelector("div[class='menu_main_wrap'] a[href='https://keybooks.ro/shop/']"));
			
	//WebElement loginLink = driver.findElement(By.linkText("Login"));		
	
	public By shopLink = By.cssSelector("div[class='menu_main_wrap'] a[href='https://keybooks.ro/shop/']");
	public By loginLink = By.linkText("Login");
	public By searchIcon = By.cssSelector("button[class* ='icon-search']");
	public By searchField = By.cssSelector("input[class='search_field']");
		
	public void navigateTo(By locator) {
		//driver.findElement(locator).click();
		click(locator);
			
	}
		
	public void search(String text) {
		/*driver.findElement(searchIcon).click();
		driver.findElement(searchField).sendKeys(text);
		driver.findElement(searchIcon).click();*/
		
		click(searchIcon);
		sendKeys(searchField, text);
		click(searchIcon);
	}
	
	
}
		

