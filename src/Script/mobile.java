package Script;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.WebBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class mobile extends WebBase
{
	@Test(priority=1)
	public void FarmerRegistration() throws InterruptedException, MalformedURLException
	{
		System.out.println("Entered inside mobile class");
			File apk=new File(FARMERAPK);
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "FALCA-MobileTest");
			cap.setCapability(MobileCapabilityType.APP, apk.getAbsolutePath());
			cap.setCapability("noReset", true);
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
			System.out.println("Mobile launched");
			Thread.sleep(15000);
			String a = driver.getDeviceTime();
			System.out.println(a);
			Reporter.log(a);
			Reporter.log("Mobile Success");
			driver.closeApp();
			driver.quit();
	}

}
