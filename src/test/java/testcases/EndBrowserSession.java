package testcases;

import core.Hook;
import io.cucumber.java.en.Given;

public class EndBrowserSession extends Hook
{
	 @Given("all work complete close session")
     public void all_work_complete_close_session()
     {
    	 closeBrowser();
     }
}
