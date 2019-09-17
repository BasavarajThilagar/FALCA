package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class googleLoginPage
{
	@FindBy(xpath="//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
	private WebElement input;
	
	@FindBy(xpath="//div[@data-attrid=\"title\"]")
	private WebElement span;
	
	public googleLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void gbox() throws InterruptedException
	{
		input.sendKeys("Testers mind of o2");
		input.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	public void span() throws InterruptedException
	{
		String a = span.getText();
		System.out.println(a);
		Assert.assertEquals(a,"B");
		
		Thread.sleep(3000);
	}
	
}
