package NewMaven.NewMaven;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Main {

	private Cities cities;
	private CitiesBethlehem citiesbethlehem;
	private CitiesJenin citiesjenin;
	private CitiesHebron citieshebron;
	private int TestCounter = 0;

	@BeforeMethod
	public void setUpTest() throws Exception {
		cities = new Cities(); 
		citiesbethlehem = new CitiesBethlehem(); 
		citiesjenin = new CitiesJenin(); 
		citieshebron = new CitiesHebron(); 
	}

	@Test(priority = 1)
	public void Cities() throws InterruptedException {
		if(TestCounter == 0) {
			cities.TestCaseTwo();
			cities.TestCaseOne();
			cities.TestCaseThree();
			cities.TestCaseFour();
			cities.TestCaseFive();
			cities.TestCaseSix();
			cities.TestCaseSeven();
			cities.TestCaseEight();
			TestCounter += 1;
		}
	}

	@Test(priority = 2)
	public void TestTwo() throws InterruptedException {
		if(TestCounter == 1) {
			System.out.println("Bethlehem");
			citiesbethlehem.TestCaseOne();
			citiesbethlehem.TestCaseTwo();
			citiesbethlehem.TestCaseThree();
			citiesbethlehem.TestCaseFour();	
			citiesbethlehem.TestCaseFive();
			citiesbethlehem.TestCaseSix();
			citiesbethlehem.TestCaseSeven();
			TestCounter += 1;

		}
	}

	@Test(priority = 3)
	public void TestThree() throws InterruptedException {
		if(TestCounter == 2) {
			System.out.println("Jenin");
			citiesjenin.TestCaseOne();
			citiesjenin.TestCaseTwo();
			citiesjenin.TestCaseThree();
			citiesjenin.TestCaseFour();	
			citiesjenin.TestCaseFive();
			citiesjenin.TestCaseSix();
			citiesjenin.TestCaseSeven();
			TestCounter += 1;

		}
	}

	@Test(priority = 4)
	public void TestFour() throws InterruptedException {
		if(TestCounter == 1) {
			System.out.println("Hebron");
			citieshebron.TestCaseOne();
			citieshebron.TestCaseTwo();
			citieshebron.TestCaseThree();
			citieshebron.TestCaseFour();	
			citieshebron.TestCaseFive();
			citieshebron.TestCaseSix();
			citieshebron.TestCaseSeven();
			TestCounter += 1;

		}
	}
}
