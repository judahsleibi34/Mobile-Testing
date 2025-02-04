package NewMaven.NewMaven;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class Cities {

	public AndroidDriver driver;

	public Cities() {
		this.driver = Settings.getDriver();
	}


	public void TestCaseOne() throws InterruptedException {		
		WebElement EnterClick = driver.findElement(AppiumBy.accessibilityId("Let's Go"));
		EnterClick.click();

	}

	public void TestCaseTwo() throws InterruptedException {

		WebElement AppClick = driver.findElement(AppiumBy.accessibilityId("Predicted app: Tour Palestine"));
		AppClick.click();

		WebElement LanguageClick = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"English\"]"));
		LanguageClick.click();

		Thread.sleep(1000);
		LanguageClick = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"العربية\"]"));
		LanguageClick.click();

		Thread.sleep(500);

		LanguageClick = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"العربية\"]"));
		LanguageClick.click();

		LanguageClick = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"English\"]"));
		LanguageClick.click();	

	}

	public void TestCaseThree() throws InterruptedException {
		WebElement CitiesClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Cities\"]"));
		CitiesClick.click();	

	}

	public void TestCaseFour() throws InterruptedException {
		WebElement CitiesClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Cities\"]"));
		CitiesClick.click();
		CitiesClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Home\"]"));
		CitiesClick.click();	

	}

	public void TestCaseFive() throws InterruptedException {
		WebElement CitiesClick = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Cities\"]"));
		CitiesClick.click();	

	}

	public void TestCaseSix() throws InterruptedException {
		WebElement BethlehemClick = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Bethlehem\"]"));
		BethlehemClick.click();	
		Thread.sleep(1000);

		WebElement BackClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		BackClick.click();	
	}

	public void TestCaseSeven() throws InterruptedException {
		WebElement CitiesClick = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Jenin\"]"));
		CitiesClick.click();	
		Thread.sleep(1000);

		WebElement BackClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		BackClick.click();	

	}

	public void TestCaseEight() throws InterruptedException {
		WebElement CitiesClick = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Hebron\"]"));
		CitiesClick.click();	
		Thread.sleep(1000);

		WebElement BackClick = driver.findElement(AppiumBy.xpath("//android.widget.Button"));
		BackClick.click();	

	}




	}



