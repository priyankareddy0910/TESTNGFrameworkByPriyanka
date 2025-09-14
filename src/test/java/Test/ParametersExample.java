package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Analyzer.RetryAnalyzer;
public class ParametersExample {

	 WebDriver driver;

	 @BeforeClass
	 @Parameters({"browser","url"})
	 void setup(String browser,String app) throws InterruptedException
	 {
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 
	 driver=new ChromeDriver();
	 }
	 else if(browser.equalsIgnoreCase("firefox"))
	 {
	 driver=new FirefoxDriver();

	 }
	 driver.get(app);
	 driver.manage().window().maximize();
	 Thread.sleep(5000);	 }

	 @Test(priority = 1)
	 void logoTest()
	 {
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");

	 }

	 @Test(priority = 2)
	 void homePageTitle()
	 {
	 String title= driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals(title,"OrangeHRM","Title is not matched");
	 }

	 @AfterClass
	 void tearDown()
	 {
	 driver.quit();
	 }


	}





