package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.googleLoginPage;
import generic.Lib;
import generic.WebBase;

public class jenkin extends WebBase
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	
	@Test
	public void google() throws InterruptedException
	{
		String url = Lib.getProperty(CONFIG_PATH, "url");
		driver.get(url);
		googleLoginPage google=new googleLoginPage(driver);
		
		google.gbox();
		google.span();
		Reporter.log("This is a test mail sent from Jenkins");
	}

}
