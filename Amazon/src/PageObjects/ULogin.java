package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ULogin {
	
  @Test
  public static WebElement userName(WebDriver driver)
	  {
		WebElement element=driver.findElement(By.id("ap_email"));
		return element;
	  }
  
  @Test
  public static WebElement econtinue(WebDriver driver) 
	  {
		WebElement element=driver.findElement(By.id("continue"));
		return element;
	  }
  
  @Test
  public static WebElement passWord(WebDriver driver)
	  {
		WebElement element=driver.findElement(By.id("ap_password"));
		return element;
	  }
  
  @Test
  public static WebElement signIn(WebDriver driver) 
	  {
		WebElement element=driver.findElement(By.id("signInSubmit"));
		return element;
	  }
  
}
