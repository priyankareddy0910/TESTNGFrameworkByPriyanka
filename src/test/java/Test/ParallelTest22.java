package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
	public class ParallelTest22 {

	 WebDriver driver;

	 @Test
	 void LoginTest() throws InterruptedException {
	 System.out.println("LoginTest. Thread id -->: " + Thread.currentThread().getId());
	 driver = new ChromeDriver();

	 driver.get("https://opensource-demo.orangehrmlive.com/");
	 Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	 Thread.sleep(5000);
	 }

	 @AfterTest
	 void tearDoown()
	 {
	 driver.quit();
	 }
	}







	




