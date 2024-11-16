package core;

import static utility.Report.generateReport;
import static utility.Report.test;
import static utility.Report.report;
import static utility.ScreenShot.takeScreenShot;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
public class Page 
{
	
	public static WebDriver driver = null;
 
  
  public void openBrowser(String browser,String url,String reportname,String testname) throws Exception 
  {
	  		  // init report..
		  generateReport(reportname,testname);
		  
		  // init WebDriver
		  
		  if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				driver = new FirefoxDriver();
			}
			driver.get(url);
			
			PageFactory.initElements(driver, this);  // to use external xpath
			
			// comment in report
			
			test.log(Status.PASS, MarkupHelper.createLabel("Browser "+browser+" opens with url "+url,ExtentColor.GREEN));
			
			// screen shot..
			takeScreenShot("browseropen");
			
			
			// implicit wait - set common timeout for all elements on url
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			driver.manage().window().maximize();  // full screen
	  
  }

  
  public void closeBrowser() 
  {
	  driver.quit();  // ending browser session..
	  
	  report.flush();  // ending report..
  }

}
