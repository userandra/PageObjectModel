package utils;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.google.common.io.Files;

public class ScreenShot {
public static void screenshot(WebDriver driver) {
		
		TakesScreenshot file = (TakesScreenshot)driver;
		File picture = file.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date(0));
		
		try {
			Files.copy(picture, new File("poze/"+timestamp+".png"));
		} catch (IOException e) {
			System.out.println("Picture could not be saved!");
			e.printStackTrace();
		}
		
	}
}
