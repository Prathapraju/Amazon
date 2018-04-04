package Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.ProductPage;
import Util.DriverClass;

public class ProductSearch {
 
	WebDriver driver;
	@BeforeClass
	public void getDriver()
	{
		this.driver=DriverClass.driver;
	}
	
  @Test (priority=1)
	public void searchProduct()
	{
	  ProductPage.TopPage.searchBox.sendKeys("Shoes");
	  ProductPage.TopPage.searchBox.sendKeys(Keys.ENTER);
	  /*ProductPage.TopPage.searchBox(driver).sendKeys("Shoes");
	  ProductPage.TopPage.searchBox(driver).sendKeys(Keys.ENTER);*/
	}
  @Test(enabled=false)
 	public void searchButton()
 	{
 	  ProductPage.TopPage.searchClick.submit();
 	}
  @Test (priority=3)
 	public void primeCCheck()
 	{
 	  ProductPage.SidePage.primeCheckbox(driver).click();
 	}
  @Test(priority=4)
 	public void deliveryCheck()
 	{
 	  ProductPage.SidePage.deliveryCheckbox(driver).click();
 	}
  @Test(priority=5)
 	public void minMaxClick()
 	{
 	  ProductPage.SidePage.minMaxAmt(driver).click();
 	 //ProductPage.TopPage.minMaxAmt.click();
 	}
  @AfterMethod
  public void tearDown(ITestResult result) {
     if (result.getStatus() == ITestResult.FAILURE) {
        System.out.println("Test failed in ProductSearch class");
     }        
  }
  
}
