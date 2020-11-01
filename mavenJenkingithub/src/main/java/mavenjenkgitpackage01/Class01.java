package mavenjenkgitpackage01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class01 {
	@Test
	public void set()
	{
		 System.setProperty("webdriver.gecko.driver", "D:\\Selenium Notes\\geckodriver-v0.27.0-win64 (1)\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();		
			
			 
			driver.get("http://www.google.com");
			 
			driver.quit();
			 
	}
}

