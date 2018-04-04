package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;

import PageObjects.ProductPage;


public class DriverClass {
		public static WebDriver driver;
  @BeforeSuite
  public static  void webDriverInitiate() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_workspace\\chromedriver_Win32\\chromedriver_Win32\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  PageFactory.initElements(driver, ProductPage.TopPage.class);
	  //return driver;
	  }
}



