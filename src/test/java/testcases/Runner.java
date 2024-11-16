package testcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\feature\\document.feature",
	//	tags = "(@uid or @pwd or @search or @data2) and not @data1",
		tags = "@amazon and not @data2",
	//	tags = "(@amazon and @uid) or (@amazon and @pwd)",
		glue = {"testcases"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty",
					"junit:src/test/java/reports/report.xml",
					"json:src/test/java/reports/report.json",
					"html:src/test/java/reports/report.html"
					},
		publish = true
		        )
public class Runner 
{
   // empty
}
