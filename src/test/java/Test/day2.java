package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

//Groups
	
	@Test(groups= {"sanity"})
	public void Apple() {
		System.out.println("this is test1");
		
	}
	
	@Test(groups= {"regression","sanity"})
	public void test2() {
		System.out.println("this is test2");
		
	}
	
	@Test(groups= {"sanity"})
	public void Banana() {
		System.out.println("this is test3");
		
	}
	
	@Test(groups= {"regression"})
	public void test4() {
		System.out.println("this is test4");
		
	}
	
	@Test(groups= {"regression"})
	public void test5() {
		System.out.println("this is test5");
		
	}
	
	

	}

