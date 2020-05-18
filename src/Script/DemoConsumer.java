package Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.ConsumerExtraPage;
import POM.ConsumerLoginPage;
import generic.Lib;
import generic.WebBase;

public class DemoConsumer extends WebBase
{
	@Test(priority=1)
	public void login()
	{
		try
		{
			Reporter.log("Browser opened");
			
			//driver.get("https://falca.in/login");
			
			String url = Lib.getProperty(CONFIG_PATH, "url");
			driver.get(url);
			Reporter.log("Inside login page");
			/*Thread.sleep(6000);
			ConsumerLoginPage login= new ConsumerLoginPage(driver);
			String un = Lib.getProperty(CONFIG_PATH, "ConsumerUN");
			login.SendUserName(un);
			String pwd = Lib.getProperty(CONFIG_PATH, "ConsumerPwd");
			login.SendPassword(pwd);
			login.ClickLoginBtn();
			Thread.sleep(8000);
			Reporter.log("Admin loged-in Successfully.");
			
			ConsumerExtraPage addaddress= new ConsumerExtraPage(driver);
			addaddress.Username();
			addaddress.Profile();
			Reporter.log("Profile page landed Successfully.");*/
			
			
		}catch(Exception e)
		{
		Reporter.log(e.getMessage(),true);
		Assert.fail();
		}

	}
	

}
