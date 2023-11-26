package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.BaseTest;

public class StaleElementEx extends BaseTest{
	@Test
	
	public void staleElementExample() throws InterruptedException {
		
		app.click(app.menu.shopLink);
		//incarca in memorie un element cu nume dropdown pe sesiunea curenta de browser
		WebElement dropdown = driver.findElement(By.name("orderby"));
		//instantiez clasa select si pasez elementul de mai sus
		Select select =  new Select(dropdown);
		//se foloseste de element si face refresh (cand face refresh applicatia, selenium isi ia alt session id
		//pentru browser)
		select.selectByIndex(2);
		
		Thread.sleep(3000);
		
		//start fix stale element
		dropdown = driver.findElement(By.name("orderby"));
		select =  new Select(dropdown);
		//end fix stale element
		
		//incerc sa ma folosesc de un element pe care selenium il are asociat cu alt session id la browser
		//si crapa 100% cu stale element reference
		
		select.selectByValue("date");
		
	}

}


