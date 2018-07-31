package skeleton;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//new Code3
public class LoginNewToursStepDefs {
	private WebDriver driver;
	@Given("^user is on the login page of newtours$")
	public void user_is_on_the_login_page_of_newtours() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\KSINHA\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^user enters correct credentials in newtours$")
	public void user_enters_correct_credentials_in_newtours() throws Throwable {
	    driver.findElement(By.name("userName")).sendKeys("invalidUN");
	    driver.findElement(By.name("password")).sendKeys("invalidPW");
	    driver.findElement(By.name("login")).click();
	}

	@Then("^user can do successful login$")
	public void user_can_do_successful_login() throws Throwable {
	    Assert.assertEquals("Find a flight", driver.getTitle());
	}
}
