package NewMaven.NewMaven;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class CitiesBethlehem{

	public AndroidDriver driver;

	public int startX, startY, endY, screenHeight, screenWidth;


	public CitiesBethlehem() {
		this.driver = Settings.getDriver();

		screenHeight = driver.manage().window().getSize().getHeight();
		screenWidth = driver.manage().window().getSize().getWidth();

		startX = screenWidth / 2;  
		startY = screenHeight / 2;
		endY = (int) (screenHeight * 0.2); 
	}

	public void TestCaseOne() throws InterruptedException {
		WebElement CitiesClick = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Bethlehem\"]"));
		CitiesClick.click();	

		//		WebElement PromoVideoClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Promo video\"]"));
		//				PromoVideoClick.click();
		//		Thread.sleep(1500);
		//		// Exit by the X marker: 
		//		WebElement ExitX = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(1)"));
		//		ExitX.click();
		//		Thread.sleep(1500);
		//
		//		// Exit by the <== marker: 
		//		PromoVideoClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Promo video\"]"));
		//				PromoVideoClick.click();
		//		Thread.sleep(1500);
		//		WebElement Exitindecator = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.Button\").instance(0)"));
		//		Exitindecator.click();
		//		Thread.sleep(1500);

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

		ImageClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(6)"));
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

		WebElement GameOneClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Battir town\")"));
		GameOneClick.click();
		Thread.sleep(1000);

		WebElement ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		WebElement GameTwoClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Church of the Nativity\")"));
		GameTwoClick.click();
		Thread.sleep(1000);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		WebElement GameThreeClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Olive wood craft\")"));
		GameThreeClick.click();
		Thread.sleep(1000);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();

		WebElement GameFourClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Omar Mosque\")"));
		GameFourClick.click();
		Thread.sleep(1000);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();

		WebElement GameFiveClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Shepherds field\")"));
		GameFiveClick.click();
		Thread.sleep(1000);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();

		WebElement GameSixClick = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"Solomon's Pools\")"));
		GameSixClick.click();
		Thread.sleep(1000);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);

		ExitGameClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitGameClick.click();
		Thread.sleep(500);


	}

	// Beit Ibrahim Bethlehem
	public void TestCaseSeven() throws InterruptedException {

		Thread.sleep(500);
		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		//		// Beit Ibrahim Bethlehem
		//		WebElement BeitIbrahimBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc= 'Abraham's Herberge/Beit Ibrahim Bethlehem']"));
		//		BeitIbrahimBethlehem.click();
		//		Thread.sleep(1000);
		//		
		//		
		//		// Dar Al Majus
		//		WebElement DarAlMajusClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Dar Al-Majus Community Home Bethlehem']"));
		//		DarAlMajusClick.click();
		//		Thread.sleep(1000);
		//		
		//		// Jacir Palce Hotel
		//		WebElement JacirPalceHotel = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Jacir Palace Hotel']"));
		//		JacirPalceHotel.click();
		//		Thread.sleep(1000);
		//		
		//		// The Walled Off Hotel Bethlehem
		//		WebElement TheWalledOffHotelBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc= 'The Walled Off Hotel Bethlehem']"));
		//		TheWalledOffHotelBethlehem.click();
		//		Thread.sleep(1000);
		//		
		//		// Hosh Al Syrian Bethlehem
		//		WebElement HoshAlSyrianBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc= 'Hosh Al Syrian Bethlehem']"));
		//		HoshAlSyrianBethlehem.click();
		//		Thread.sleep(1000);
		//		
		//		// Hosh Mar Jeriyes Bethlehem
		//		WebElement HoshMarJeriyesBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Hosh Mar Jeriyes Bethlehem\"]"));
		//		HoshMarJeriyesBethlehem.click();
		//		Thread.sleep(1000);
		//		
		//		// Casanova Bethlehem
		//		WebElement CasanovaBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc= 'Casanova Bethlehem']"));
		//		CasanovaBethlehem.click();
		//		Thread.sleep(1000);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		//		// Palestinian Heritage Center Bethlehem
		//		WebElement PalestinianHeritageCenterBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Palestinian Heritage Center Bethlehem"]"));
		//		PalestinianHeritageCenterBethlehem.click();
		//		Thread.sleep(1000);
		//		
		//		// The International Nativity Museum Bethlehem
		//		WebElement TheInternationalNativityMuseumBethlehem = driver.findElement(AppiumBy.xpath("/android.widget.ImageView[@content-desc="The International Nativity Museum Bethlehem"]"));
		//		DarAlMajusClick.click();
		//		Thread.sleep(1000);
		//				
		//		// The Children’s Museum of Natural History Bethlehem
		//		WebElement TheChildrensMuseumofNaturalHistoryBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="The Children’s Museum of Natural History Bethlehem"]"));
		//		TheChildrensMuseumofNaturalHistoryBethlehem.click();
		//		Thread.sleep(1000);
		//		
		//		// The Palestinian Museum of Natural History Bethlehem
		//		WebElement ThePalestinianMuseumofNaturalHistoryBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="The Palestinian Museum of Natural History Bethlehem"]"));
		//		ThePalestinianMuseumofNaturalHistoryBethlehem.click();
		//		Thread.sleep(1000);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		//		Abu Dawood Restaurant Bethlehem
		//		WebElement AbuDawoodRestaurantBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Abu Dawood Restaurant Bethlehem"]"));
		//		AbuDawoodRestaurantBethlehem.click();
		//		Thread.sleep(1000);
		//		
		//		// Afteem restaurant Bethlehem
		//		WebElement AfteemrestaurantBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Afteem restaurant Bethlehem"]"));
		//		DarAlMajusClick.click();
		//		Thread.sleep(1000);
		//				
		//		// Abu Aliss Restaurant Bethlehem
		//		WebElement AbuAlissRestaurantBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Abu Aliss Restaurant Bethlehem"]"));
		//		AbuAlissRestaurantBethlehem.click();
		//		Thread.sleep(1000);
		//		
		//		// Qabar Restaurant Bethlehem
		//		WebElement QabarRestaurantBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Qabar Restaurant Bethlehem"]"));
		//		QabarRestaurantBethlehem.click();
		//		Thread.sleep(1000);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		//		// Dar Al-Nadwa International Center Bethlehem
		//		WebElement DarAlNadwaInternationalCenterBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Dar Al-Nadwa International Center Bethlehem"]"));
		//		DarAlNadwaInternationalCenterBethlehem.click();
		//		Thread.sleep(1000);
		//
		// 		// Bethlehem Peace Center Bethlehem
		//		WebElement BethlehemPeaceCenterBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Bethlehem Peace Center Bethlehem"]"));
		//		BethlehemPeaceCenterBethlehem.click();
		//		Thread.sleep(1000);

		new TouchAction(driver).press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(startX, endY)).release().perform();
		Thread.sleep(500);

		// 		//Tree of Life Olivewood Sculptures & Art Bethlehem
		//		WebElement TreeofLifeOlivewoodSculptures&ArtBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="Tree of Life Olivewood Sculptures & Art Bethlehem"]"));
		//		TreeofLifeOlivewoodSculptures&ArtBethlehem.click();
		//		Thread.sleep(1000);
		//
		// 		//Johnny's souvenir shop Bethlehem
		//		WebElement JohnnySouvenirShopBethlehem = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc="johnny's souvenir shop Bethlehem"]"));
		//		DarAlNadwaInternationalCenterBethlehem.click();
		//		Thread.sleep(1000);
		//

		WebElement ExitClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		ExitClick.click();
		Thread.sleep(1000);

	}
}





