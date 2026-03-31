package stepdefinations;

import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utils.ScreenshotUtil;

public class LoginSteps {
	
	LoginPage loginpage;
	
	@Before
	public void setUp() 
	{
		
		BaseClass.initializeDriver();
		loginpage = new LoginPage(BaseClass.driver);
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
		
	}
	@When("user enters valid username and password")
	public void user_enters_credintial()
	{
		
		loginpage.enterUsername("Admin");
		loginpage.enterPassword("admin123");
		
	}
	@And("clicks on login button")
	public void clicks_login()
	{
		
		loginpage.clickLogin();
	}
	@Then("user should be navigated to dashboard")
	public void verify_dashboard()
	{
		
		String currenturl = BaseClass.driver.getCurrentUrl();
		Assert.assertTrue(currenturl.contains("dashboard"),"Login Failed!");
	}
	
	@After
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	        ScreenshotUtil.captureScreenshot(scenario.getName());
	    }
	    BaseClass.tearDown();
	}

}
