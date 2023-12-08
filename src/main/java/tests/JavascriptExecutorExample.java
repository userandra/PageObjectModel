package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JavascriptExecutorExample extends BaseTest{
	
		//@Test
		public void example() {
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			
			jse.executeScript("window.location='http://emag.ro'");
			//driver.get(url);
			//driver.navigate().to(url);
			
			jse.executeScript("window.history.go(-1)");
			//driver.navigate().back();
		
			jse.executeScript("window.history.forward(-1)");
			//driver.navigate().forward();
		
			//1
			driver.navigate().refresh();
			
			//2
			Actions action = new Actions(driver);
			action.sendKeys(Keys.F5).perform();
			
			//3
			jse.executeScript("window.history.go(0)");
			
			//4
			driver.get(driver.getCurrentUrl());	
		}
		
		@Test
		public void example2() throws InterruptedException {
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			/*//alternativa pentru click()
			jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));
			
			//alternativa pentru sendKeys()
			jse.executeScript("arguments[0].value='cooking'", app.returnElement(app.menu.searchField));	
			jse.executeScript("arguments[0].click()", app.returnElement(app.menu.searchIcon));

			jse.executeScript("arguments[0].click();arguments[1].value='cooking';arguments[0].click();", 
					app.returnElement(app.menu.searchIcon),app.returnElement(app.menu.searchField));*/
			
		
			
			//alternativa ptr click()
			jse.executeScript("document.getElementsByClassName('icon-search')[0].click();");
			
			//alternativa pentru sendkeys()
			jse.executeScript("document.getElementsByClassName('search_field')[0].value='cooking';");
			
			//alernativa pentru click()
			jse.executeScript("document.getElementsByClassName('icon-search')[0].click();");

			//selenium getTitle()
			String title =  driver.getTitle();
			System.out.println(title);
		
			//alternativa pentru getTitle()
			String title2 = jse.executeScript("return document.title").toString();
			System.out.println(title2);
			
			//selenium getCurrentUrl
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			//alternativa pentru getCurrentUrl()
			String url2 = jse.executeScript("return document.URL").toString();
			System.out.println(url2);
		
			//alternativa pentru isDisplayed()
			String isVisible =jse.executeScript("return document.getElementsByClassName('post_title')[0].checkVisibility()").toString();
			System.out.println(isVisible);
			assertEquals(isVisible, "true");
			boolean visible = Boolean.valueOf(isVisible);
			System.out.println(visible);
			assertTrue(visible);
			
			//alternativa pentru getText()
			String bookTitle = jse.executeScript("return document.getElementsByClassName('post_title')[4].childNodes[0].innerText").toString();
			System.out.println(bookTitle);
			assertEquals(bookTitle, "Healthy Lifestyle");
			
			
			jse.executeScript("document.getElementsByClassName('popup_link')[0].click()");
		
			//alternativa pentru isSelected()
			String isSelected = jse.executeScript("return document.getElementsByName('rememberme')[0].checked").toString();
			assertEquals(isSelected, "false");
			jse.executeScript("document.getElementsByName('rememberme')[0].click()");
			String isSelected2 = jse.executeScript("return document.getElementsByName('rememberme')[0].checked").toString();
			assertEquals(isSelected2, "true");
			
			//alternativa pentru isEnabled()
			String disabled =  jse.executeScript("return document.getElementsByName('log')[0].disabled").toString();
			assertEquals(disabled, "false");
			
			Thread.sleep(4000);
			//reset un fromular
			jse.executeScript("document.getElementsByName('log')[0].value='blablabla'");
			Thread.sleep(4000);
			jse.executeScript("document.getElementsByName('pwd')[0].value='blablabla'");
			Thread.sleep(4000);

			//ca sa putem face reset trebuie sa identificam elementul de tip form (formularul)
			
			//<form action="https://keybooks.ro/wp-login.php" method="post" name="login_form" class="popup_form login_form">
			jse.executeScript("document.getElementsByClassName('login_form')[0].reset()");
			
			//submit formular
			jse.executeScript("document.getElementsByName('log')[0].value='TestTest'");
			Thread.sleep(4000);
			
			jse.executeScript("document.getElementsByName('pwd')[0].value='TestTest'");
			Thread.sleep(4000);
			
			jse.executeScript("document.getElementsByClassName('login_form')[0].submit()");

			//intoarce OS pe care execut
			String platform = Platform.getCurrent().toString();
			System.out.println(platform);
			
			String platform2 = jse.executeScript("return navigator.platform").toString();
			System.out.println(platform2);
			
		}
		
		@Test
		public void example3() {
			
			JavascriptExecutor jse = (JavascriptExecutor) driver;

			System.out.println(driver.getTitle());

			jse.executeScript("window.schimbaTitlu = function() { document.title='Altceva'}; "
					+ "schimbaTitlu.call()");
			
			System.out.println(driver.getTitle());
			
			String jsHover = "var obj = document.createEvent('MouseEvent');"
					+ "obj.initMouseEvent('mouseover', true);"
					+ "arguments[0].dispatchEvent(obj)";
			
			jse.executeScript(jsHover, app.returnElement(app.menu.aboutLink));
			jse.executeScript(jsHover, app.returnElement(app.menu.blogLink));

		}


	
	
	
	

}
