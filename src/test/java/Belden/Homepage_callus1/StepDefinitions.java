package Belden.Homepage_callus1;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
	WebDriver driver;
	
	public StepDefinitions(Shared shared)
	{
	
		driver = shared.driver;
		
	}
	
	@Then("user clicks on call us button")
	public void user_clicks_on_call_us_button() {
		driver.findElement(By.xpath("//*[@id='header']/div/div[2]/div/div/div[1]/div/p/a")).click();
	}

}
