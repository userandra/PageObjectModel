package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathEx extends BaseTest{
	
	@Test(priority = 1)
	public void xpathExample1() throws InterruptedException {
		JavascriptExecutor jse  = (JavascriptExecutor) driver;

		//<li class="menu_user_login">
		/*
		 *  CSS --> tagname[atribut="valoare-atribut"]
		 *  	-->  li[class='menu_user_login']
		 * 
		 * xpath --> //tagname[@atribut="valoare-atribut"]
		 * 	     --> //li[@class='menu_user_login']
		 * 
		 */
		
		WebElement loginLink = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", loginLink);
		loginLink.click();
		
		//folosim 2 elemente
		WebElement username = driver.findElement(By.xpath("//ul[@id='menu_user']//input[@name='log']"));
		jse.executeScript(
				"arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", username);
		username.sendKeys("TestUser");
		
		//logical OR
		WebElement password = driver.findElement(By.xpath("//ul//input[@name='pwd' or @type='password']"));
		jse.executeScript(
				"arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", password);
		password.sendKeys("12345@67890");
		
		//logical AND
		WebElement remmemebrMe = driver.findElement(By.xpath("//ul//input[@id='rememberme' and @type='checkbox']"));
		remmemebrMe.click();
		
		WebElement submit =  driver.findElement(By.xpath("//ul//input[@value='Login']"));
		submit.click();
		
		Thread.sleep(4000);
	
	}
	
	@Test(priority = 2)
	public void xpathExample2() {
		JavascriptExecutor jse  = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//span[@class='user_name']")).click();
		
		//<a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
		/*
		 * in xpath functia text() stie sa acceseze textul dintre tagurile HTML
		 * 
		 * //a[text()='Settings']
		 * 
		 */		
		driver.findElement(By.xpath("//a[text()='Settings']")).click();
		
		//<a href="https://keybooks.ro/account/orders/">recent orders</a>
		driver.findElement(By.xpath("//a[text()='recent orders']")).click();
		
		/*
		 * in xpath functia contains() o folosim pentru a lua doar bucati din valorile unui atribut 
		 * sau bucati din textul ditre tagurile HMTL
		 * 
		 * //th[contains(@class, 'woocommerce-orders-table__header-order-number')]
		 */
		
		WebElement orderTableHeader =  driver.findElement(By.xpath
				("//th[contains(@class, 'woocommerce-orders-table__header-order-number')]"));
		jse.executeScript(
				"arguments[0].setAttribute('style', 'background:orange; border:4px solid red')", orderTableHeader);		
		
		WebElement actionsTableHeader = driver.findElement(By.xpath("//span[contains(text(), 'Acti')]"));
		jse.executeScript(
				"arguments[0].setAttribute('style', 'background:blue; border:4px solid red')", actionsTableHeader);		
		//index
		/*
		 * indentificarea pe baza de index se face dupa urmatoarea sintaxa:
		 * 
		 * (experesie -xpath)[index] 
		 * (//th[contains(@class, 'woocommerce-orders-table__header')])[3]
		 */
		
		WebElement statusTableHeader =  driver.findElement(
				By.xpath("(//th[contains(@class, 'woocommerce-orders-table__header')])[3]"));
		jse.executeScript(
				"arguments[0].setAttribute('style', 'background:green; border:4px solid red')", statusTableHeader);		
		
		/*
		 * functia not() in xpath ne ajuta sa selectam un element pe baza negarii anumitor conditii pe care
		 * alte elemente similare le au
		 * Ex :
		 * <a href="https://keybooks.ro/account/view-order/1721/">#1721</a>
		 * <a href="https://keybooks.ro/account/view-order/1720/">#1720</a>
		 * <a href="https://keybooks.ro/account/view-order/1719/">#1719</a>
		 * 
		 * //td[@data-title='Order']/a[not(contains(text(), '172'))]
		 * 
		 */
		WebElement order1719 =  driver.findElement
				(By.xpath("//td[@data-title='Order']/a[not(contains(text(), '172'))]"));
		
		jse.executeScript(
				"arguments[0].setAttribute('style', 'background:pink; border:4px solid red')", order1719);		
		
		order1719.click();
		
		assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/account/view-order/1719/");
		
	}
	
	

}
