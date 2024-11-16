package testcases;

import static utility.Report.report;
import static utility.Report.test;

import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSearch extends Hook
{
	public static boolean x = false;
	@Given("i am logged in")
	public void i_am_logged_in() 
	{
		 test = report.createTest("search Product Test");
		 
	    if(Login.login == true)
	    {
	    	x = true;
	    }
	}
	@When("^i search for product (.*) in range (.*)")
	public void i_search_for_product_in_range(String pname,int pprice) 
	{
	    if(x == true)
	    {
	    	searchtxtbox.clear();
	    	searchtxtbox.sendKeys(pname+" in price "+pprice);
	    	
	    	test.log(Status.PASS, MarkupHelper.createLabel("searching for .."+pname, ExtentColor.GREEN));
	  	  
	    	Actions a =new Actions(driver);
	    	a.sendKeys(Keys.ENTER).perform();
	    }
	}
	@Then("search results should come")
	public void search_results_should_come() 
	{
		test = report.createTest("search result ");
		Iterator <WebElement> it =  searchresult.iterator();
		
		 for(int i =1; i <= 5; i++)
		 {
			WebElement e = it.next();
		String dsp =	e.getText();
		test.log(Status.PASS, MarkupHelper.createLabel("searchresult .."+dsp, ExtentColor.GREEN));
		 }
	}

}
