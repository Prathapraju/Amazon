package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import Util.DriverClass;

public class Home {

	WebDriver driver;
	@BeforeClass
	public void getDriver()
	{
		driver=DriverClass.driver;
	}
	
	
  @Test
  public void signIN()
  {
	  HomePage.MyAccount(driver).click();
	  String title=driver.getTitle();
	  Assert.assertEquals(title, "Amazon Sign In");
	  System.out.println("Title pass");
	  
  }
  
 @AfterMethod
  public void tearDown(ITestResult result)
  {
     if (result.getStatus() == ITestResult.FAILURE) {
        System.out.println("Test failed in Home class");
     }
        else
        {
        	System.out.println("Test passed in Home class");
        }
        
     }
   
}
  
  
