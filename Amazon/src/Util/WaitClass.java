package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitClass {
  @Test
  public static WebElement impWait(WebDriver driver,By locator) {
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
	  //WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element));
	  return element;
  }
}
