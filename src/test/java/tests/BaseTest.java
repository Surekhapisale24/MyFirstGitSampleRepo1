package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public static WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	String path=System.getProperty("user.dir")+"\\src\\test\\files\\config.properties";
	
	@BeforeSuite
	public void init() throws IOException {
		
		WebDriverManager.chromedriver().setup();
		
		//step-1 launch browser
		 driver=new ChromeDriver();
		
		//step-2 maximize window
		driver.manage().window().maximize();
		
		//get property from properties file
		prop=new Properties();
		
		System.out.println(path);
		//create object of input stream
		fis=new FileInputStream(path);
		
		//to load file
		prop.load(fis);
		
		System.out.println(prop.getProperty("url"));
		
		//step-3 open webpage
		driver.get(prop.getProperty("url"));
		
		//step-4 wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.close();
	}

}
