package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	 int count = 0;
	    int maxRetry = 2; // retry failed test 2 times

	    @Override
	    public boolean retry(ITestResult result) {

	        if (count < maxRetry) {
	            count++;
	            return true;
	        }
	        return false;
	    }
	

}
