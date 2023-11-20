package utils;
	
	import java.time.Duration;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;

import pages.BasePage;

	public class BaseTest {
		
		public static WebDriver driver;
		public BasePage app;
		
		@BeforeClass
		public void setup() {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize(); //se maximizeaza fereastra de browser
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.get("https://keybooks.ro");
			app = new BasePage();
		}
		
		@AfterClass
		public void tearDown() throws InterruptedException {
			Thread.sleep(4000);
			//driver.close(); //se inchide tabul curent
			driver.quit(); //se inchide instanta de browser
					
		}

	}


