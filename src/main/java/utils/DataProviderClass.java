package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name="bookPictures")
	
	public Object[][] bookPicturesDataProvider(){
		
		Object[][] data =  new Object[4][2];
		
		data[0][0] = "The forest";
		data[0][1] = "book2.jpg";
		
		data[1][0] = "Life in the garden";
		data[1][1] = "book4.jpg";
		
		data[2][0] = "The long road to the deep Silence";
		data[2][1] = "book5.jpg";
		
		//data[3][0] = "It’s a really strange story";
		//data[3][1] = "book12.jpg";
		
		data[3][0] = "Storm";
		data[3][1] = "books7.jpg";
		
		return data;
	}

}
