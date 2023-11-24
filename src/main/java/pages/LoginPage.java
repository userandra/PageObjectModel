package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers{
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By usernameField = By.id("log");
	public By passwordField = By.name("pwd");
	public By sumbitButton = By.className("submit_button");
	public By closePopUpButton = By.className("popup_close");
	public By logoutButton = By.linkText("Logout");
	public By loginSucessMsg = By.cssSelector("div[class*='sc_infobox_style_success']");
	public By loginErrorMsg = By.cssSelector("div[class*='sc_infobox_style_error']");
	
	public void loginInApp(String user, String pass) {
		
		sendKeys(usernameField, user);
		sendKeys(passwordField, pass);
		click(sumbitButton);
	}
	
	public void closePopUp() {
		click(closePopUpButton);
	}
	
}
	
	
