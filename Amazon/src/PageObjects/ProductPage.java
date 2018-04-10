package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Util.WaitClass;

public class ProductPage
{
	
	public static class TopPage
	{
		
		@FindBy(id="twotabsearchtextbox")
		public static WebElement searchBox;
		
		@FindBy(xpath="//input[@class='nav-input']")
		public static WebElement searchClick;
		
		@FindBy(name="s-ref-checkbox-2470955011")
		public static WebElement primeCheckbox;
		
		@FindBy(xpath="//input[@name='s-ref-checkbox-8308921011']")
		public static WebElement deliveryCheckbox;
		
		@FindBy(linkText="$50 to $100")
		public static WebElement minMaxAmt;
				
		/* public static  WebElement searchBox(WebDriver driver)
		{
			WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
			return element;
		}
		
		public static  WebElement searchClick(WebDriver driver)
		{
			WebElement element=driver.findElement(By.xpath("//input[@class='nav-input']"));
			return element;
		}
	}

	public static class SidePage
	{
		public static  WebElement primeCheckbox(WebDriver driver)
		{
			WebElement element=driver.findElement(By.name("s-ref-checkbox-2470955011"));
			return element;
		}
		
		public static  WebElement deliveryCheckbox(WebDriver driver)
		{
			//JavascriptExecutor js=(JavascriptExecutor) driver;
			//WebElement element = (WebElement) js.executeScript("document.getElementsByName('s-ref-checkbox-8308921011',[0];)");
			//WebElement element=driver.findElement(By.name("s-ref-checkbox-8308921011"));
			//WebElement element=driver.findElement(By.xpath("//input[@name='s-ref-checkbox-8308921011']"));
			//String xpath="//input[@name='s-ref-checkbox-8308921011']";
			By locator= By.xpath("//input[@name='s-ref-checkbox-8308921011']");
			WebElement element1= WaitClass.impWait(driver, locator);
			return element1;
		}
		
		public static  WebElement minMaxAmt(WebDriver driver)
		
		{
			By locator= By.linkText("$50 to $100");
			WebElement element1= WaitClass.impWait(driver, locator);
			//WebElement element=driver.findElement(By.linkText("$50 to $100"));
			return element1;
		}*/
	}
}
