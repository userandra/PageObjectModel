package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class ActionClassExample extends BaseTest{
	
	//@Test
	public void hoverExample() throws InterruptedException{
		
		app.hooverElement(app.menu.blogLink);
		Thread.sleep(4000);
		app.hooverElement(app.menu.masonryLink);
		Thread.sleep(5000);
		app.hooverElement(app.menu.portfolioLink);
		Thread.sleep(5000);
		app.hooverElement(app.menu.aboutLink);
		Thread.sleep(3000);
		
	}

	@Test
	
	public void dragAndDropExample() {
		
		app.click(app.menu.shopLink);
		
		app.scrollVertically(350);
		
		app.dragAndDrop(app.shop.sliderInitialPosition, 100, 0);
		app.dragAndDrop(app.shop.sliderFinalPostition, -100, 0);
		
	}
}
