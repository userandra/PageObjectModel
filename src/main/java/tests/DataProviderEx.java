package tests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.devtools.v116.io.IO;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.ScreenShot;

public class DataProviderEx extends BaseTest {

	@DataProvider(name = "loginTestData")
	public Object[][] loginTestData() {

		Object data[][] = new Object[4][3];

		data[0][0] = "TestUser";
		data[0][1] = "12345@67890";
		data[0][2] = true;

		data[2][0] = "TestUser";
		data[2][1] = "12345@67890";
		data[2][2] = true;

		data[1][0] = "gresit";
		data[1][1] = "gresit";
		data[1][2] = false;

		data[3][0] = "gresit";
		data[3][1] = "gresit";
		data[3][2] = false;

		return data;

	}

	@Test(dataProvider = "loginTestData")
	public void loginTest(String user, String pass, boolean success) throws IOException {
		ScreenShot.screenshot(driver);
		app.click(app.menu.loginLink);
		ScreenShot.screenshot(driver);
		app.login.loginInApp(user, pass);
		ScreenShot.screenshot(driver);

		if (success) {
			ScreenShot.screenshot(driver);
			assertTrue(app.elementIsDisplayed(app.login.loginSucessMsg));
			ScreenShot.screenshot(driver);
			app.click(app.login.logoutButton);
			
		} else if (!success) {
			assertTrue(app.elementIsDisplayed(app.login.loginErrorMsg));
			app.click(app.login.closePopUpButton);

		}

	}

}
