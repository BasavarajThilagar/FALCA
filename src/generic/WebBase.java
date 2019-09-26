package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebBase implements AutoConst
{
	static
	{
		System.setProperty(CHROME_KEY,"/usr/bin/chromedriver");
		//System.setProperty(CHROME_KEY,CHROME_VALUE);
	}
	public WebDriver driver;
	
	@BeforeClass
	public void openApplication() throws InterruptedException
	{
		try
		{
			System.out.println("entered webbase");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			System.out.println("Driver opened and max");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			Reporter.log("Server down retest",true);
			System.out.println(e);
		}
	}
	
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
	}	
}
