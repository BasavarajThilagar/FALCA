package Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.googleLoginPage;
import generic.Lib;
import generic.WebBase;

public class jenkin extends WebBase
{
	
	@Test
	public void google() throws InterruptedException
	{
		System.out.println("Started main");
		String url = Lib.getProperty(CONFIG_PATH, "url");
		driver.get(url);
		googleLoginPage google=new googleLoginPage(driver);
		
		google.gbox();
		google.span();
		Reporter.log("This is a test mail sent from Jenkins");
	}

}
