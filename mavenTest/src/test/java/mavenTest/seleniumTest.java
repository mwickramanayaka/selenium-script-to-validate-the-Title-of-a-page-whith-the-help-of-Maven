package mavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class seleniumTest {
	
	

	@Test
	public void test() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseurl = "https://ikman.lk/";
		String expectedTitle = "ikman.lk - Electronics, Cars, Property and Jobs in Sri Lanka";
		
		String actualTitle = "";
		
		driver.get(baseurl);
		Thread.sleep(3000);
		
		actualTitle = driver.getTitle();
		Thread.sleep(3000);
		
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		driver.close();
		
	}
	
}
