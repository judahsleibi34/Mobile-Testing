package NewMaven.NewMaven;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Settings {

	public static AndroidDriver driver;

	private Settings() {} //avoid recreation of driver-path

	public static AndroidDriver getDriver() {
		if (driver == null) { 
			try {
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability("appium:deviceName", "emulator-5554");
				capabilities.setCapability("appium:platformVersion", "15");
				capabilities.setCapability("appium:platformName", "Android");
				capabilities.setCapability("appium:automationName", "UiAutomator2");
				capabilities.setCapability("appium:app", "C:\\Users\\Admin\\Documents\\Axsos\\QA Programs\\ApiDemos-debug.apk");
				capabilities.setCapability("orientation", "PORTRAIT");
				capabilities.setCapability("noReset", false); 

				driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
				driver.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.pressKey(new KeyEvent(AndroidKey.HOME));

			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null; 
		}
	}
}
