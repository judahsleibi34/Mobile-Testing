package NewMaven.NewMaven;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class CitiesJenin {

	public AndroidDriver driver;

	public int startX, startY, endY, screenHeight, screenWidth;


	public CitiesJenin() {
		this.driver = Settings.getDriver();

		screenHeight = driver.manage().window().getSize().getHeight();
		screenWidth = driver.manage().window().getSize().getWidth();

		startX = screenWidth / 2;  
		startY = screenHeight / 2;
		endY = (int) (screenHeight * 0.2); 
	}

	public void TestCaseOne() throws InterruptedException {
		WebElement CitiesClick = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Jenin\"]"));
		CitiesClick.click();	

		WebElement PromoVideoClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Promo video\"]"));
		PromoVideoClick.click();
		Thread.sleep(1500);
		// Exit by the X marker: 
		WebElement ExitX = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"));
		ExitX.click();
		Thread.sleep(1500);

		// Exit by the <== marker: 
		PromoVideoClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Promo video\"]"));
		PromoVideoClick.click();
		Thread.sleep(1500);
		WebElement Exitindecator = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)"));
		Exitindecator.click();
		Thread.sleep(1500);

	}

	public void TestCaseTwo() throws InterruptedException {

		WebElement VirtualTourClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Virtual Tour\"]"));
		VirtualTourClick.click();
		Thread.sleep(500);

		WebElement VirtualTourImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)"));
		VirtualTourImageClick.click();
		Thread.sleep(500);

		// Image 1:
		WebElement VirtualTourImage = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)"));
		VirtualTourImage.click();
		Thread.sleep(500);

		// Image 2:
		VirtualTourImage = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"));
		VirtualTourImage.click();
		Thread.sleep(500);

		// Image 3:
		VirtualTourImage = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)"));
		VirtualTourImage.click();
		Thread.sleep(500);

		// Exit by the X: 
		VirtualTourImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(4)"));
		VirtualTourImageClick.click();
		Thread.sleep(500);


		VirtualTourImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"));
		VirtualTourImageClick.click();
		Thread.sleep(500);

	}

	public void TestCaseThree() throws InterruptedException {

		WebElement ReadMoreClick = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.ImageView[2]"));
		ReadMoreClick.click();
		Thread.sleep(500);

		ReadMoreClick = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.ImageView[2]"));
		ReadMoreClick.click();
		Thread.sleep(500);

	}

	public void TestCaseFour() throws InterruptedException {

		WebElement ReadMoreClick = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.ImageView[2]"));
		ReadMoreClick.click();
		Thread.sleep(500);

		ReadMoreClick = driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.widget.ImageView[2]"));
		ReadMoreClick.click();
		Thread.sleep(500);

	}
	public void TestCaseFive() throws InterruptedException {

		WebElement AlbumClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Album Images\")"));
		AlbumClick.click();

		WebElement ExitClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\")"));

		WebElement ImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(2)"));
		ImageClick.click();

		Thread.sleep(500);
		ExitClick.click();

		ImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)"));
		ImageClick.click();

		Thread.sleep(500);
		ExitClick.click();

		ImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(4)"));
		ImageClick.click();

		Thread.sleep(500);
		ExitClick.click();

		ImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(5)"));
		ImageClick.click();

		Thread.sleep(500);
		ExitClick.click();

		ImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(1)"));
		ImageClick.click();

		Thread.sleep(500);
		ExitClick.click();

	}

	public void TestCaseSix() throws InterruptedException {

		WebElement FunGameClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Fun Game\"]"));
		FunGameClick.click();
		Thread.sleep(500);

		WebElement GameOneClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Balama tunnel\")"));
		GameOneClick.click();
		Thread.sleep(1000);

		WebElement ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		WebElement GameTwoClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Burqin Church\")"));
		GameTwoClick.click();
		Thread.sleep(1000);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		WebElement GameThreeClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Jenin Great Mosque\")"));
		GameThreeClick.click();
		Thread.sleep(1000);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

	}

	public void TestCaseSeven() throws InterruptedException {

		Thread.sleep(500);
		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		//		// Basima Abu Ali Jenin
		//		WebElement BasimaAbuAliJenin = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Basima Abu Ali Jenin"]"));
		//		BasimaAbuAliJenin.click();
		//		Thread.sleep(1000);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		//		// Tel Taanak Jenin
		//		WebElement TelTaanakJenin = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Tel Taanak Jenin"]"));
		//		TelTaanakJenin.click();
		//		Thread.sleep(1000);
		//		

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		//		Al-Aqsa pastries and taboon Jenin
		//		WebElement Al-AqsapastriesandtaboonJenin = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Al-Aqsa pastries and taboon Jenin"]"));
		//		AqsapastriesandtaboonJenin.click();
		//		Thread.sleep(1000);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		//		// Freedom Theatre Jenin
		//		WebElement FreedomTheatreJenin = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Freedom Theatre Jenin"]"));
		//		FreedomTheatreJenin.click();
		//		Thread.sleep(1000);

		WebElement ExitClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitClick.click();
		Thread.sleep(1000);

	}
}







