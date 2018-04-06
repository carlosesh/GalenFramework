package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import pom.Login;
import pom.MyNotes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSuite {
	
	protected WebDriver driver;
	protected String baseURL;
	public Login loginPF() {
		Login loginPF = new Login(driver, test);
		return loginPF;
	};
	public MyNotes notes(){
		MyNotes notes = new MyNotes(driver, test);
		return notes;
	};
	protected ExtentReports reports;
	protected ExtentTest test;

  @BeforeMethod
  public void beforeMethod(ITestResult testResult) {
	  reports = new ExtentReports("C:\\Users\\36775\\Desktop\\ExtentReportsResults\\WizeLine_Suite.html", false);
	  test = reports.startTest(testResult.getMethod().getMethodName().toString());
	  baseURL= "http://testapp.galenframework.com/";
	  driver = new ChromeDriver();
	  test.log(LogStatus.INFO, "Browser is Open");
	  driver.manage().window().maximize();
	  test.log(LogStatus.INFO, "Browser maximized");
	  driver.get(baseURL);
  }

  @AfterMethod
  public void afterMethod(ITestResult testResult){
	  if(testResult.getStatus() == testResult.FAILURE) 
	  {
		  test.log(LogStatus.FAIL, "Test: " + testResult.getMethod().getMethodName().toString() + " Failed");
	  }
	  
	  else 
	  {
		  test.log(LogStatus.PASS, "Test: " + testResult.getMethod().getMethodName().toString() + " Passed");
	  }
	  
	  if (driver != null) 
	  {
			driver.quit();
			driver = null;
			test.log(LogStatus.INFO, "Driver was closed successfully");
		}
	  else 
	  {
			test.log(LogStatus.INFO, "Driver is already null");		
	  }
	  
	  	reports.endTest(test);
	  	reports.flush();
  }

}
