package basics;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Bases {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		 // TODO Auto-generated method stub
		
		 AndroidDriver<AndroidElement>  driver;

		 // TODO Auto-generated method stub
		 File appDir = new File("C:\\Users\\SHARMSX14\\Documents\\MobileAutomation\\APK\\");
	     File app = new File(appDir, "com.giftcards.android.config.pro.apk");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Sushil");
	     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
	     capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.giftcards.android.config.pro");
	     capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.giftcards.android.ui.linking.LaunchDelegateActivity");
	     driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	    
	     return driver;
	}

}
