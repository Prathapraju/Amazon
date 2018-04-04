package Base;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import org.testng.TestNG;
import org.testng.annotations.BeforeClass;

public class MainClass {
	public WebDriver driver;

  @Test
  public void callTestsuit() 
  {
	// Create object of TestNG Class
	  TestNG runner=new TestNG();
 	 // Create a list of String to add more than one testsuites
	  List<String> suitefiles=new ArrayList<String>();
	  // Add xml file which you have to execute
	  String filename= "src\\Test\\testsuit.xml";
	  suitefiles.add(filename);
	  // now set xml file for execution
	  runner.setTestSuites(suitefiles);
	  // finally execute the runner using run method
	  runner.run();
	  }
  }
