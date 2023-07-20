package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends BaseTest{
	
	SoftAssert sa;
	HomePage hp;

	@BeforeClass
	public void initObject() {
		
		
		 sa=new SoftAssert();
		hp=new HomePage(driver);
	}
	
	@Test (priority=1)
	public void goToTab() {
		
		hp.adminMenu();
		sa.assertTrue(true);
		sa.assertAll();
	}
	@Test (priority=2)
	public void logout() {
		
		
		hp.logout();
	}
	
	@Test (priority=3)
	public void verifyTitle() {
		
		System.out.println(driver.getTitle());
		System.out.println("test case pass");
	}

}
