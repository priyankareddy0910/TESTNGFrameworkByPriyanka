package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

  int counter =0;
  
  int retrylimit=3;

public boolean retry(ITestResult result) {
	
	if(counter<retrylimit) {
		
		//0<3
		
		counter++; 
		return true;//retry the test 
		
	}
	return false;//dont retry after limit 
}



}
