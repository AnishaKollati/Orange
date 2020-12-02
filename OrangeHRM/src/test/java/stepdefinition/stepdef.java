package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import PageObject.EssEmployeeDetails;
import PageObject.HomePage;
import PageObject.SearchESSemployee;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepdef {
	private WebDriver driver;
	String BaseUrl="https://opensource-demo.orangehrmlive.com/";
	String ActualTitle;
	String ExpectedTitle="OrangeHRM";
	private HomePage hp;
	private SearchESSemployee ess;
	private EssEmployeeDetails essd;
	static int count;
	    @Before
	    public void setup()
	    {
	        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("Starting.....");
		}
		@After(order = 1)
		public void attachScreenshots(Scenario scenario) throws IOException
		{
			count++;
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File destinationPath = new File(System.getProperty("user.dir")+"/target/screenshots/"+scenario.getName()+"_"+count+".png");
			Files.copy(sourcePath, destinationPath);
			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		}
		@After(order=0)
		public void TearDown() {
			driver.close();
			System.out.println("Completed....");
		}

	    @Given("^Open Portal$")
	    public void open_portal() throws Throwable {
	    	hp= new HomePage(driver);
	    	driver.get(BaseUrl);
	    	Thread.sleep(1000);
	    	ActualTitle= driver.getTitle();
	    	Assert.assertEquals(ExpectedTitle, ActualTitle);
		    System.out.println("HomePage Loaded Sucessfully...");
	    }
		@When("^Enter Username(.+),Password(.+) and click login$")
	    public void enter_usernamepassword_and_click_login(String uname, String pass) throws Throwable {
	    	Thread.sleep(1000);
	    	hp.username(uname);
	    	Thread.sleep(1000);
	    	hp.password(pass);
	    	hp.clickLogin();
	    	System.out.println("Sucessful Login...");
	    }

	    @Then("^click PIM and fill (.+) and search$")
	    public void click_pim_and_fill_and_search(String empname) throws Throwable {
	    	ess= new SearchESSemployee(driver);
	    	Thread.sleep(1000);
	    	ess.ClickPIMModule();
	    	Thread.sleep(1000);
	    	System.out.println("Sucessfully Accessed PIM...");
	    	ess.EmpName(empname);
	    	Thread.sleep(1000);	
	    	ess.search();
	    	System.out.println("Employee Found"+empname);
	    }

	    @Then("^click on the name and view all details$")
	    public void click_on_the_name_and_view_all_details() throws Throwable {
	     	essd= new EssEmployeeDetails(driver);
	    	essd.ClickonEmpName();
	    	Thread.sleep(1000);
	    	System.out.println("Clicked on EmployeeName...");
	    	essd.ClickonPersonalDetails();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Personal Details...");
	    	essd.ClickonContactDetails();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Contact Details...");
	    	essd.ClickonEmergencyContactDetails();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Emergancy Contact Details...");
	    	essd.ClickonDependents();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Dependents Details...");
	    	essd.ClickonImmigration();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Immigration Details...");
	    	essd.ClickonJob();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Job Details...");
	    	essd.ClickonSalary();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Salary Details...");
	    	essd.ClickonTaxExemptions();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee TaxExemptions Details...");
	    	essd.ClickonReportto();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Reportto Details...");
	    	essd.ClickonQualifications();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Qualification Details...");
	    	essd.ClickonMemberships();
	    	Thread.sleep(1000);
	    	System.out.println("Accessed Employee Membership Details...");
	    }
}
