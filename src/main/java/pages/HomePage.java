package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage<WebElements> {
	
	@FindBy(xpath="//*[@id='menu_admin_viewAdminModule']")
	private WebElement admin;
	
	@FindBy(xpath="//*[@id='mainMenuFirstLevelUnorderedList']//child::a[@class='firstLevelMenu']")
	private WebElements tabs;
	
	@FindBy(xpath="//*[@id='branding']//a[2]")
	private WebElement userLink;
	
	@FindBy (xpath="//*[@id='welcome-menu']//ul//li//a[text()='Logout']")
	private WebElement logoutLink;
	
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void adminMenu() {
		
		admin.click();
	}
	
	public void logout() {
		
		userLink.click();
		logoutLink.click();
	}
	
}
