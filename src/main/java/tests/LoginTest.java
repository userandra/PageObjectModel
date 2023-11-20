package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {

	@Test(priority = 1)

	public void validLogin() {

		// MenuPage menu = new MenuPage(driver);
		// menu.navigateTo(menu.shopLink);
		app.menu.navigateTo(app.menu.loginLink);
		// menu.search("Why");
	

		app.click(app.menu.loginLink);

		// LoginPage login = new LoginPage(driver);
		app.login.loginInApp("TestUser", "12345@67890");

		app.login.click(app.login.logoutButton);
	}

	@Test(priority = 2)
	public void invalidLogin() {

		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);

		LoginPage login = new LoginPage(driver);
		login.loginInApp("blabla", "blabla");
	}

}
