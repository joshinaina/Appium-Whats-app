package whatsapp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;



public class sendingmsgonwhatsapp {
	
	AndroidDriver driver;
	
	@Test
	
	public void testwhatapp() throws MalformedURLException {
		
		DesiredCapabilities capability =new DesiredCapabilities();
		capability.setCapability("deviceName", "Galaxy J3");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformversion", "5.1.1");
		File file = new File("D:\\eclipsework\\Appiumwhatsapp\\apk\\WhatsApp Messenger_v2.18.105_apkpure.com.apk");
		capability.setCapability("app", file.getAbsolutePath());
		capability.setCapability("noReset", "true");
		
		driver = new AndroidDriver(new URL("http://192.168.99.1:4723/wd/hub"), capability);
		
		
		
		}
	
	
		

}
	




