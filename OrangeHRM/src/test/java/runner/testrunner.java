package runner;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features/essemployee.feature"},
		glue={"stepdefinition"},
				plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		
		monochrome=true
)
public class testrunner extends AbstractTestNGCucumberTests
{
	@AfterClass
	public static void writeExtentReport() {
			
		Reporter.loadXMLConfig("config/extent-configs.xml");
	    
	}
}
