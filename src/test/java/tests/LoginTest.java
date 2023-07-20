package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	

	LoginPage lp;
	SoftAssert sa;
	

	@BeforeClass
	public void initObject() {
		
		lp= new LoginPage(driver);
		 sa=new SoftAssert();
		
	}
	
	@Test (priority=1)
	public void verifybuttontext() {
		
		sa.assertTrue(true);
		sa.assertAll();
	}
	
	@Test (priority=2)
	public void login() {
		
		lp.enterCred("Admin", "admin123");
		lp.submit();
	}
	
	

}
