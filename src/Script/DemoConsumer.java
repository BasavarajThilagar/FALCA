package Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

//import POM.ConsumerLoginPage;
import POM.googleLoginPage;
import generic.Lib;
import generic.WebBase;

public class DemoConsumer extends WebBase
{
	@Test(priority=1)
	public void login()
	{
		try
		{
			Reporter.log("Inside login page");
			String url = Lib.getProperty(CONFIG_PATH, "url");
			driver.get(url);
			Thread.sleep(3000);
			googleLoginPage google=new googleLoginPage(driver);
			google.gbox();
			/*Reporter.log("Inside login page");
			String url = Lib.getProperty(CONFIG_PATH,"CosumerUrl");
			driver.get(url);
			ConsumerLoginPage login= new ConsumerLoginPage(driver);
			String un = Lib.getProperty(CONFIG_PATH, "ConsumerUN");
			login.SendUserName(un);
			String pwd = Lib.getProperty(CONFIG_PATH, "ConsumerPwd");
			login.SendPassword(pwd);
			login.ClickLoginBtn();
			Thread.sleep(8000);*/
			Reporter.log("Admin loged-in Successfully.");
			//System.out.println("Admin loged-in Successfully.");
		}catch(Exception e)
		{
		Reporter.log(e.getMessage(),true);
		Assert.fail();
		}

	}
	
	/*@Test(priority=2)
	public void testProfile()
	{
		try
		{
			ConsumerExtraPage addaddress= new ConsumerExtraPage(driver);
			addaddress.Username();
			addaddress.Profile();
			Reporter.log("Profile clicked Successfully.");
			//System.out.println("Profile clicked Successfully.");
			
		}catch(Exception e)
		{
		Reporter.log(e.getMessage(),true);
		Assert.fail();
		}
	}*/

}
