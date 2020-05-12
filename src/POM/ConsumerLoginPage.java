package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsumerLoginPage 
{
	@FindBy(id="loginuser")
	private WebElement usn;
	
	@FindBy(id="loginpassword")
	private WebElement password;
	
	@FindBy(id="btnlogin")
	private WebElement Login;
	
	public ConsumerLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void SendUserName(String un)
	{
		usn.sendKeys(un);
	}
	
	public void SendPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void ClickLoginBtn() throws InterruptedException
	{
		Login.click();
		Thread.sleep(3000);
	}

}
