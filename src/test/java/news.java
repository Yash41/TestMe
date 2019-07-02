import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class news {
	WebDriver driver;
	String exp ="Find a Flight: Mercury Tours:";
	@Given("^user is on the homepage$")
	public void user_is_on_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "C:\\NexGenTesting\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demoaut.com/");
		 
	}

	@When("^user enter correct details$")
	public void user_enter_correct_details() throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^user does successful login$")
	public void user_does_successful_login() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		Assert.assertEquals(exp, driver.getTitle());
	    // Write code here that turns the phrase above into concrete actions
	  // new PendingException();
	}
}
