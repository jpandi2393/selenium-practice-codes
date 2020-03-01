package stepDefinition;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
    WebDriver driver;
    
    @Given("^user is in upgrade page$")
    
    public void login_page() throws Throwable
    
    {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	    driver = new ChromeDriver();
	    

    	driver.get("upgrade-qa2.enphase.com/");
    	
    	driver.manage().window().maximize();
    }

    @When("^user enters username and Password$")
    
    public void u_name() throws Throwable
    
    {
	  
     String title =driver.getTitle();  
     System.out.println(title);
     driver.findElement(By.name("email")).sendKeys("jpandi2393@gmail.com");        
     driver.findElement(By.name("pass")).sendKeys("Pandi23$Kumar");
    	
    }
    
  @Then("^click the submit button$") 
   
    
 public void submit() throws Throwable
 
 {  
	 
     WebElement submit = driver.findElement(By.id("u_0_a"));
     
   /*  JavascriptExecutor js =(JavascriptExecutor)driver;
     
     js.executeScript("arguments[0].click();", submit);
     
     js.executeScript("alert('Welcome to fb page')");*/
     
     submit.click();
     

 }
  
  
}
