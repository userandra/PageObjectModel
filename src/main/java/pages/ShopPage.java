package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import utils.SeleniumWrappers;

public class ShopPage extends SeleniumWrappers {
	
	public By dropdown = By.name("orderby");
	
	public By sliderInitialPosition = By.cssSelector("span[style='left: 0%;']");
	public By sliderFinalPostition = By.cssSelector("span[style='left: 100%;']");

	public void selectByValue(String value) {

		Select select = new Select(returnElement(dropdown));
		select.selectByValue(value);

	}

	public void selectByIndex(int index) {

		Select select = new Select(returnElement(dropdown));
		select.selectByIndex(index);

	}

	public void selectByVisibleText(String text) {

		Select select = new Select(returnElement(dropdown));
		select.selectByVisibleText(text);
	}

	public String getSelectedOption() {
		Select select = new Select(returnElement(dropdown));
		return select.getFirstSelectedOption().getText();
	}

}
