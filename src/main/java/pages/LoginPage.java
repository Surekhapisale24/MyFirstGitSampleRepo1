package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

    //Webelement of page
	
	
	@FindBy(id="txtUsername")
	private WebElement username;
	
	@FindBy(id="txtPassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement button;
	
	//constructor
	
	public LoginPage(WebDriver driver) {
		
		
		PageFactory.initElements(driver, this);
	}
	
	//action
	
	public String  buttonText() {
		
		String text=button.getText();
		
		return  text;
	}
	
	public void enterCred(String user, String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
	}
	
	public void submit() {
		
		button.click();
	}

}
