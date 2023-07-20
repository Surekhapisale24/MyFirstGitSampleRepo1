package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	
	public static void captureScreen(WebDriver driver, String name) throws IOException {
		
		//step-1 
				TakesScreenshot tsc=(TakesScreenshot) driver;
				
				//step-2
				File source=tsc.getScreenshotAs(OutputType.FILE);
				
				String path=System.getProperty("user.dir")+"\\Screenshots\\"+name+".png";
				
				//step-3
				File dest=new File(path);
				
				//step-4
				FileHandler.copy(source, dest);
				
				System.out.println("Screenshot capture");
		
	}

}
