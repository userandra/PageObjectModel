package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	
	public void validLogin() {
		
		MenuPage menu = new MenuPage(driver);
		//menu.navigateTo(menu.shopLink);
		menu.navigateTo(menu.loginLink);
		//menu.search("Why");
	}
	
	
}
