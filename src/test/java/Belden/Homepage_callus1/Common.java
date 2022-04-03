package Belden.Homepage_callus1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Common {
	WebDriver driver;
	public Common(Shared shared)
	{
		
		driver = shared.driver;
	}
	
	@Given("user should be on belden home page")
	public void user_should_be_on_belden_home_page() {
	    driver.get("https://www.belden.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("//*[@id='bdn-region-setting-modal']/div/div/div[3]/a[2]")).click();
	}


}
