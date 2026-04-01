package runners;

import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.RetryListener;

@CucumberOptions(
		
		features ="src\\test\\resources\\features",
		glue = "stepdefinations",
		 plugin = {"pretty"}
		
		)

@Listeners(RetryListener.class)
public class TestRunner extends AbstractTestNGCucumberTests {

	
}
