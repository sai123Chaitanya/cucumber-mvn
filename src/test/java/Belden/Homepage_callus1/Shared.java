package Belden.Homepage_callus1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Shared {
	
	WebDriver driver;
	@Before
	public void before_or_after(Scenario scenario)
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@After
	public void before_or_after() 
	{
		
		driver.close();
		
	}

}
