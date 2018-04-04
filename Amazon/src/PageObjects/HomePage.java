package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage
	{
	
	public static WebElement element=null;
		
	  @Test
	  	public static WebElement MyAccount(WebDriver driver)
		  {
			element= driver.findElement(By.id("nav-link-accountList"));  
			return element;
					  
		  }

	}
