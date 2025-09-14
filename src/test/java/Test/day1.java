		package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class day1  {
	

	@BeforeTest()
	public void zoo() {
		System.out.println("BeforeTest");
		
	}
	
	@AfterTest()
	public void zoo1() {
		System.out.println("AfterTest");
	}
				
	
	@AfterClass
	public void demoCar() {
		System.out.println("AfterClass");
		
	}
	
	@BeforeClass
	public void demoAuto() {
		
		System.out.println("BeforeClass");

	}
	
	@BeforeSuite
	public void demo() {
		
		System.out.println("BeforeSuite");

	}
	@AfterSuite
	public void dem() {
		
		System.out.println("AfterSuite");

	}

	
	@Parameters({"browsername","url"})
	@Test()
	public void demoSch(String browsername,String url) {
		switch(browsername) {
		case "chrome":
		break;
		case "edge":
			break;
		
		default:
			break;
		}
		System.out.println(url);
		System.out.println("test");
		
	}
	
	@Test
	void m1() {
		
		System.out.println("Method");	
	}
	
	
	@Test
	public void testmethod1() {
		
		System.out.println("should not execute");	
	}
	
	
	
	
	
	
	
	@BeforeMethod
	public void demoHomeLast() {
		
		System.out.println("Before Method");
		
	}
	
	
	@AfterMethod
	public void demoHomeLasts() {
		
		System.out.println("After Method");
		
	}
}
