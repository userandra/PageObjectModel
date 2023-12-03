package pages;

import utils.SeleniumWrappers;
import org.openqa.selenium.WebDriver;


public class BasePage extends SeleniumWrappers{
	
			public MenuPage menu =  new MenuPage(driver); //are parametru pe constructor
			public LoginPage login =  new LoginPage(driver);
			public ShopPage shop =  new ShopPage(); //nu are parametru pe constructor
			public SearchResultPage searchResult = new SearchResultPage();
			public PostFormatsPage postFormat =  new PostFormatsPage();
			public ContactsPage contacts =  new ContactsPage();
			public EventsPage events =  new EventsPage(); //ii permite locatorului sa ma duca in pag de Event
			public GenericEventPage genericEvent =  new GenericEventPage();
			
	}
	


















