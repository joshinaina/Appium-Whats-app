package whatsapp;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class appiumwhatsappp 
{
	public static AndroidDriver driver;
	public static String appLocation="D:\\eclipsework\\Appiumwhatsapp\\apk\\WhatsApp Messenger_v2.18.105_apkpure.com.apk";
	
	public static String devicename="127.0.0.14:4728";
	public static String Contactname="Hubby";
	@Test()
	public void setUp()
		{
			try
			{
				File appDir=new File(appLocation);
				
			
				DesiredCapabilities capability=new DesiredCapabilities();
				capability.setCapability(CapabilityType.BROWSER_NAME, "");
                capability.setCapability("deviceName","Galaxy J3");//inside capabity what you are typing is case sensetive.So do not write small or capital.
				capability.setCapability("platformName","Android");
				capability.setCapability("platformVersion","5.1.1");
				File file=new File("D:\\eclipsework\\Appiumwhatsapp\\apk\\WhatsApp Messenger_v2.18.105_apkpure.com.apk");
			capability.setCapability("app",file.getAbsolutePath());
				driver =new AndroidDriver(new URL("http://127.0.0.14:4728/wd/hub"),capability);
				capability.setCapability("noReset", "true");
				
				driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
				}
						catch(IOException e)
								{
									e.printStackTrace();
								}
		
		}
	/*@AfterTest
	public void teardown()
		{
		driver.quit();
		}*/
	@Test
	public void test()
	{
		driver.findElement(By.id("com.whatsapp:id/menuitem_search")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.whatsapp:id/search_src_text")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("com.whatsapp:id/search_src_text\"")).sendKeys("Hubby");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.whatsapp:id/conversations_row_contact_name")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.whatsapp:id/entry")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.whatsapp:id/entry")).sendKeys("hi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("com.whatsapp:id/send")).click();
		
		
	}
}



