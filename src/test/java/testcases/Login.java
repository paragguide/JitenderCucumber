package testcases;

import static utility.Report.report;
import static utility.Report.test;

import org.junit.Assert;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Hook
{
	
	public static boolean username = false;
	public static boolean x = false;
	public static boolean login = false;
	
	@Given("browser {string} is open with url {string} and initialize reportname {string} and testname {string}")
	public void browser_is_open_with_url_and_initialize_reportname_and_testname(String browser, String url, String reportname, String testname) throws Exception 
	{
		 
	    openBrowser(browser,url,reportname,testname);
	    test = report.createTest("Userid Test");
	}
	@Given("i click on signin link")
	public void i_click_on_signin_link() 
	{
	    signin.click();
	}
	@When("I enter valid username {string}")
	public void i_enter_valid_username(String email) 
	{
	    userid.sendKeys(email);
	}
	@When("click continue button")
	public void click_continue_button() 
	{
	   ctnbtn.click();
	}
	@Then("I validate the userid")
	public void i_validate_the_userid() 
	{
		try {
			  String txt = err1.getText();
			  test.log(Status.FAIL, MarkupHelper.createLabel("user id is not valid.."+txt, ExtentColor.RED));
			  Assert.fail(txt);
			    }
			    catch(Exception e)
			    {
			    	test.log(Status.PASS, MarkupHelper.createLabel("user id is valid..", ExtentColor.GREEN));
			    
			    	username = true;
			    }
			  
	}

	@Given("userid is valid")
	public void userid_is_valid() 
	{
		 test = report.createTest("Password Test");
	    if(username == true)
	    {
	    	x = true;
	    }
	    else
	    {
	    	Assert.fail("userid not valid hence password not working");
	    }
	}
	@When("enter the valid password which is {string}")
	public void enter_the_valid_password_which_is(String pass) 
	{
	    if(x == true)
	    {
	    	password.sendKeys(pass);
	    	submit.click();
	    }
	}
	@Then("i should login")
	public void i_should_login() 
	{
		try {
			  String txt = err2.getText();
			  test.log(Status.FAIL, MarkupHelper.createLabel("password is not valid.."+txt, ExtentColor.RED));
			  Assert.fail(txt);
			    }
			    catch(Exception e)
			    {
			    	test.log(Status.PASS, MarkupHelper.createLabel("password is valid..", ExtentColor.GREEN));
			   login = true;
			    }
		  
	}


}
