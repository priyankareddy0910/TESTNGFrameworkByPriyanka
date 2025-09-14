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

public class ParallelTest1 {

 WebDriver driver;

 @Test
 void logoTest() throws InterruptedException {
 System.out.println("logoTest. Thread id -->: " + Thread.currentThread().getId());
 driver = new ChromeDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/");
 driver.manage().window().maximize();
 Thread.sleep(5000);
 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
 
 }

 @Test
 void homePageTitle() throws InterruptedException {
 System.out.println("homePageTitle. Thread id -->: " + Thread.currentThread().getId());
 driver = new ChromeDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/");
 String title = driver.getTitle();
 Assert.assertEquals(title, "OrangeHRM", "Title is not matched");
 Thread.sleep(5000);
 }

 @AfterTest
 void tearDoown()
 {
 driver.quit();
 }
}

