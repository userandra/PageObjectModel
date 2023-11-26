package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	
	@Parameters({"user", "pass"})
	@Test(priority = 1, groups = "loginFunctionality")

	public void validLogin(String username, String password) {

		// MenuPage menu = new MenuPage(driver);
		// menu.navigateTo(menu.shopLink);
		//app.menu.navigateTo(app.menu.loginLink);face exact acelasi lucru ca la L21
		// menu.search("Why");
	
		app.click(app.menu.loginLink);

		// LoginPage login = new LoginPage(driver);
		app.login.loginInApp(username, password);

		app.login.click(app.login.logoutButton);
	}

	@Test(priority = 2,  groups = "loginFunctionality")
	public void invalidLogin() {

		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);

		LoginPage login = new LoginPage(driver);
		login.loginInApp("blabla", "blabla");
	}

}
