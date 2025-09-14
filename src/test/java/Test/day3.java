package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;

public class day3  {
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void regression() {
		
	Assert.assertTrue(false);
		
		System.out.println("regression");
		
	}	
	
	@Test()
	public void Logout() {
		
		System.out.println("Timeout");
		
	}
	
	
	@Test()
	public void Login() {
		
		System.out.println("Test Method");
				
	}
	

	
	@Test(enabled=false)
	public void Case() {
		
		System.out.println("false");
		
	}
	
	
	
	@Test(dependsOnMethods= {"Login"})
	public void LoginHome() {
		
		System.out.println("before this login should execute");
		
	}
	
	
	

	@Test
	public void WebloginMobileLogin() {
		
		System.out.println("second Mobile");
		
	}
	@Test
	public void WebloginwarLoan() {
		
		System.out.println("third");
		
	}

}
