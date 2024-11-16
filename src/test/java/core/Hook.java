package core;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hook extends Page
{
	
	 public void openBrowser(String browser,String url,String reportname,String testname) throws Exception 
	  {
		 super.openBrowser(browser, url, reportname, testname);
	  }
	
	// mapping of login xpath..
		@FindBy(xpath=externalXpath.AmazonXpath.signin)
		public static WebElement signin;
		
		@FindBy(xpath=externalXpath.AmazonXpath.userid)
		public static WebElement userid;
		
		@FindBy(xpath=externalXpath.AmazonXpath.ctnbtn)
		public static WebElement ctnbtn;
		
		@FindBy(xpath=externalXpath.AmazonXpath.err1)
		public static WebElement err1;
		
		@FindBy(xpath=externalXpath.AmazonXpath.password)
		public static WebElement password;
		
		@FindBy(xpath=externalXpath.AmazonXpath.submit)
		public static WebElement submit;
		
		@FindBy(xpath=externalXpath.AmazonXpath.err2)
		public static WebElement err2;
		
		// search products
		@FindBy(xpath=externalXpath.AmazonXpath.searchtxtbox)
		public static WebElement searchtxtbox;
		
		@FindBy(xpath = externalXpath.AmazonXpath.productdcp)
		public static List <WebElement> searchresult;
		
		// new customer
		@FindBy(xpath=externalXpath.AmazonXpath.starthere)
		public static WebElement starthere;
		
		@FindBy(xpath=externalXpath.AmazonXpath.name)
		public static WebElement name;
		
		
	
}
