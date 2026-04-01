package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ConfigReader;
import utils.LoggerUtil;

public class BaseClass {
	
	
	public static WebDriver driver;
	
	
	public static void initializeDriver() 
	{
		String browser = ConfigReader.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			 LoggerUtil.logger.info("Chrome browser launched ok");
			
		}
		driver.manage().window().maximize();
		driver.get(ConfigReader.getProperty("url"));
		LoggerUtil.logger.info("Navigated to URL");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
	
	public static void tearDown()
	{
		
		driver.quit();
	}

}
