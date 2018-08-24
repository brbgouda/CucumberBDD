package stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.util.ConfigFileReader;
import com.qa.util.WebEventListener;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {
	
	WebDriver driver;
	ConfigFileReader configReader;
	EventFiringWebDriver e_driver;
	WebEventListener eventListener;
	public LoginStepDefinition(){
		configReader = new ConfigFileReader();
	}
	
	@Before
	public void initialization(){
//		String browser = configReader.getBrowserName();
//		System.out.println(browser);
		System.setProperty("webdriver.chrome.driver", "C://HomeProjects//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//For event logs on console, helps viewing each event based on actions on web pages
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.get(configReader.getAppUrl());
	}
	@Given("^user is on Login page$")
	public void user_on_login_page(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
		
	}
	@When("^title of Login page is Free CRM$")
	public void title_login_page_Free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
	}
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
	    driver.findElement(By.name("username")).sendKeys("brbgouda");
	    driver.findElement(By.name("password")).sendKeys("fc@123");
	}
	@Then("^user enters credentials$")
	public void user_enters_credentials(DataTable credentials){
		List<List<String>> creds = credentials.raw();
	    driver.findElement(By.name("username")).sendKeys(creds.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(creds.get(0).get(1));
	}
	@Then("^user enters login credentials$")
	public void user_enters_login_credentials(DataTable credentials){
		for(Map<String, String> data : credentials.asMaps(String.class, String.class)){
	    driver.findElement(By.name("username")).sendKeys(data.get("username"));
	    driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password){
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException{
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	    Thread.sleep(3000);
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException{
	    String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("CRMPRO", title);
	}
	@Then("^the user moves to new contact page$")
	public void the_user_moves_to_new_contact_page(){
	    driver.switchTo().frame("mainpanel");
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}
	@Then("^the user moves to new deal page$")
	public void the_user_moves_to_new_deal_page(){
		driver.switchTo().frame("mainpanel");
	    Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
	    driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String firstname, String lastname, String position){
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
	    
	}
	@Then("^user creates deals$")
	public void user_creates_deals(DataTable dealDetails){
		for(Map<String, String> deal : dealDetails.asMaps(String.class, String.class)){
		    driver.findElement(By.id("title")).sendKeys(deal.get("title"));
		    driver.findElement(By.id("amount")).sendKeys(deal.get("amount"));
		    driver.findElement(By.id("probability")).sendKeys(deal.get("probability"));
		    driver.findElement(By.id("commission")).sendKeys(deal.get("comission"));
		    driver.findElement(By.xpath("//input[@value='Save']")).click();
		    Actions act = new Actions(driver);
		    act.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"))).build().perform();
		    driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
		}
	}
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealDetails){
	    List<List<String>> deal = dealDetails.raw();
	    driver.findElement(By.id("title")).sendKeys(deal.get(0).get(0));
	    driver.findElement(By.id("amount")).sendKeys(deal.get(0).get(1));
	    driver.findElement(By.id("probability")).sendKeys(deal.get(0).get(2));
	    driver.findElement(By.id("commission")).sendKeys(deal.get(0).get(3));
	}
	@Then("^user clicks on Save button$")
	public void user_clicks_Save_button(){
		driver.findElement(By.xpath("//input[@value='Save']")).click();
	}
	@Then("^close the browser$")
	public void close_the_browser(){
		driver.close();
	}
	@After
	public void tearDown(){
		driver.quit();
	}
}
