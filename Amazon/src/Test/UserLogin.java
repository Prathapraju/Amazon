package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.ULogin;
import Util.DriverClass;
import Util.ExcelBase;

public class UserLogin  
	{
	public WebElement userName;
	public WebElement ContinueButton;
	public WebElement Password;
	public WebElement SignIn;
	String Uname;
	String pwd;
	WebDriver driver;
	
	@BeforeClass
	public void getDriver()
	{
		this.driver=DriverClass.driver;
	}
	
	
	@Test(priority=0)
	public void getupd()
	{
		ExcelBase.getExcel();
		 Uname=ExcelBase.getData(0, 0, 0);
		pwd=ExcelBase.getData(0, 0, 1);
	}
	
	
	@Test (priority=1)
	public void userName()
	{
		userName= ULogin.userName(driver);
		ContinueButton= ULogin.econtinue(driver);
	}
	
		
	@Test (priority=2)
	public void userNameData()
	  {
		  userName.sendKeys(Uname);
		  ContinueButton.click();
		 
	  }
	
	@Test (priority=3)
	public void passWord()
	{		
		Password= ULogin.passWord(driver);
		SignIn= ULogin.signIn(driver);
	}
		
	@Test (priority=4)
	public void passWordData()
	  {
		  Password.sendKeys(pwd);
		  SignIn.submit();
	  }
  
	@AfterMethod
	  public void UsertearDown(ITestResult result)
	  {
	     if (result.getStatus() == ITestResult.FAILURE) {
	        System.out.println("Test failed in UserLogin class");
	     }
	   }
	
	
	}
