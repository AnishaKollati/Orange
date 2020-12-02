package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class EssEmployeeDetails {
	WebDriver driver;
	private By ClickonEmpName= By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr/td[3]/a");
	private By ClickonPersonalDetail=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[1]/a");
	private By ClickonEditPersonalDetails=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input");
	private By ClickonSavePersonalDetails=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input");
	private By ClickonContactDetails=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[2]/a");
	private By ClickonEditContactDetails=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input");
	private By ClickonSaveContactDetails=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input");
	private By ClickonEmergencyContactDetails=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[3]/a");
	private By ClickonAddEmergencyContact=By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/p/input[1]");
	private By ClickonCancelEmergencyContact=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input[2]");
	private By ClickonAddAttachment=By.xpath("/html/body/div[1]/div[3]/div/div[5]/div[2]/form/p/input");
	private By ClickonCancelAttachment=By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[2]/form/fieldset/p/input[3]");
	private By ClickonDependents=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[4]/a");
	private By ClickonAddDependents=By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/p/input[1]");
	private By ClickonCancelDependents=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input[2]");
	private By ClickonImmigration=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[5]/a");
	private By ClickonAddImmigration=By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/p/input[1]");
	private By ClickonCancelImmigration=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input[2]");
	private By ClickonJob=By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/ul/li[6]/a");
	private By ClickonEditJob=By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[2]/form/fieldset/p/input[1]");
	private By ClickonSaveJob=By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/div[2]/form/fieldset/p/input[1]");
	private By ClickonSalary=By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/ul/li[7]/a");
	private By ClickonAddSalaryComponents=By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/p/input");
	private By ClickonAddSalaryAttachments=By.xpath("/html/body/div[1]/div[3]/div/div[5]/div[2]/form/p/input");
	private By ClickonTaxExemptions=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[8]/a");
	private By ClickonEditTaxExemptions=By.xpath("/html/body/div[1]/div[3]/div/div[3]/form/fieldset/p/input");
	private By ClickonSaveTaxExemptions=By.xpath("/html/body/div[1]/div[3]/div/div[3]/form/fieldset/p/input");
	private By ClickonReportto=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a");
	private By ClickonAddSupervisors=By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[1]/div[2]/form/p/input[1]");
	private By ClickonCancelSupervisors=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input[2]");
	private By ClickonAddSubordinates=By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/div[2]/form/p/input[1]");
	private By ClickonCancelSubordinates=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input[2]");
	private By ClickonQualifications=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[10]/a");
	private By ClickonAddWorkExperience=By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/p/input[1]");
	private By ClickonCancelWorkExperience=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input[2]");
	private By ClickonAddEducation=By.xpath("/html/body/div[1]/div[3]/div/div[5]/div[2]/form/div/p/input[1]");
	private By ClickonCancelEducation=By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[2]/form/fieldset/p/input[2]");
	private By ClickonAddSkills=By.xpath("/html/body/div[1]/div[3]/div/div[7]/div[2]/form/p/input[1]");
	private By ClickonCancelSkills=By.xpath("/html/body/div[1]/div[3]/div/div[6]/div[2]/form/fieldset/p/input[2]");
	private By ClickonAddLanguages=By.xpath("/html/body/div[1]/div[3]/div/div[9]/div[2]/form/p/input[1]");
	private By ClickonCancelLanguages=By.xpath("/html/body/div[1]/div[3]/div/div[8]/div[2]/form/fieldset/p/input[2]");
	private By ClickonAddLicense=By.xpath("/html/body/div[1]/div[3]/div/div[11]/div[2]/form/p/input[1]");
	private By ClickonCancelLicense=By.xpath("/html/body/div[1]/div[3]/div/div[10]/div[2]/form/fieldset/p/input[2]");
	private By ClickonAddAttachments=By.xpath("/html/body/div[1]/div[3]/div/div[13]/div[2]/form/p/input");
	private By ClickonCancelAttachments=By.xpath("/html/body/div[1]/div[3]/div/div[12]/div[2]/form/fieldset/p/input[3]");
	private By ClickonMemberships=By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[11]/a");
	private By ClickonAddAssignedMemberships=By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[2]/form/p/input");
	private By ClickonCancelAssignedMemberships=By.xpath("/html/body/div[1]/div[3]/div/div[2]/div[2]/form/fieldset/p/input[2]");
	private By ClickonAddMembershipAttachments=By.xpath("/html/body/div[1]/div[3]/div/div[5]/div[2]/form/p/input");
	private By ClickonCancelMembershipAttachments=By.xpath("/html/body/div[1]/div[3]/div/div[4]/div[2]/form/fieldset/p/input[3]");
	public EssEmployeeDetails(WebDriver driver)
	{
		this.driver = driver;
	}
	public void ClickonEmpName() throws Throwable {
		driver.findElement(ClickonEmpName).click();
	}
	public void ClickonPersonalDetails() throws Throwable{
		driver.findElement(ClickonPersonalDetail).click();
		Thread.sleep(1000);
        driver.findElement(ClickonEditPersonalDetails).click();
        Thread.sleep(1000);
		driver.findElement(ClickonSavePersonalDetails).click();
		}
		public void ClickonContactDetails() throws Throwable{
		driver.findElement(ClickonContactDetails).click();
		Thread.sleep(1000);
		driver.findElement(ClickonEditContactDetails).click();
		Thread.sleep(1000);
		driver.findElement(ClickonSaveContactDetails).click();
		}
		public void ClickonEmergencyContactDetails() throws Throwable{
		driver.findElement(ClickonEmergencyContactDetails).click();
		Thread.sleep(1000);
		driver.findElement(ClickonAddEmergencyContact).click();
		Thread.sleep(1000);
		driver.findElement(ClickonCancelEmergencyContact).click();
		Thread.sleep(1000);
		driver.findElement(ClickonAddAttachment).click();
		Thread.sleep(1000);
		driver.findElement(ClickonCancelAttachment).click();
		}
		public void ClickonDependents() throws Throwable{
		driver.findElement(ClickonDependents).click();
		Thread.sleep(1000);
		driver.findElement(ClickonAddDependents).click();
		Thread.sleep(1000);
		driver.findElement(ClickonCancelDependents).click();
		}
		public void ClickonImmigration() throws Throwable{
		driver.findElement(ClickonImmigration).click();
		Thread.sleep(1000);
		driver.findElement(ClickonAddImmigration).click();
		Thread.sleep(1000);
		driver.findElement(ClickonCancelImmigration).click();
		}
		public void ClickonJob() throws Throwable{
		driver.findElement(ClickonJob).click();
		Thread.sleep(1000);
		driver.findElement(ClickonEditJob).click();
		Thread.sleep(1000);
		driver.findElement(ClickonSaveJob).click();
		}
		public void ClickonSalary() throws Throwable{
		driver.findElement(ClickonSalary).click();
		Thread.sleep(1000);
		driver.findElement(ClickonAddSalaryComponents).click();
		Thread.sleep(1000);
		driver.findElement(ClickonAddSalaryAttachments).click();
		}
		public void ClickonTaxExemptions() throws Throwable{
		driver.findElement(ClickonTaxExemptions).click();
		Thread.sleep(1000);
		driver.findElement(ClickonEditTaxExemptions).click();
		Thread.sleep(1000);
		driver.findElement(ClickonSaveTaxExemptions).click();
		}
		public void ClickonReportto()  throws Throwable{
		driver.findElement(ClickonReportto).click();
		Thread.sleep(1000);
		driver.findElement(ClickonAddSupervisors).click();
		Thread.sleep(1000);
		driver.findElement(ClickonCancelSupervisors).click();
		Thread.sleep(1000);
		driver.findElement(ClickonAddSubordinates).click();
		Thread.sleep(1000);
		driver.findElement(ClickonCancelSubordinates).click();
		}
		public void ClickonQualifications() throws Throwable{
		driver.findElement(ClickonQualifications).click();
		driver.findElement(ClickonAddWorkExperience).click();
		driver.findElement(ClickonCancelWorkExperience).click();
		driver.findElement(ClickonAddEducation).click();
		driver.findElement(ClickonCancelEducation).click();
		driver.findElement(ClickonAddSkills).click();
		driver.findElement(ClickonCancelSkills).click();
		driver.findElement(ClickonAddLanguages).click();
		driver.findElement(ClickonCancelLanguages).click();
		driver.findElement(ClickonAddLicense).click();
		driver.findElement(ClickonCancelLicense).click();
		driver.findElement(ClickonAddAttachments).click();
		driver.findElement(ClickonCancelAttachments).click();
		}
		public void ClickonMemberships() throws Throwable{
		driver.findElement(ClickonMemberships).click();
		driver.findElement(ClickonAddAssignedMemberships).click();
		driver.findElement(ClickonCancelAssignedMemberships).click();
		driver.findElement(ClickonAddMembershipAttachments).click();
		driver.findElement(ClickonCancelMembershipAttachments).click();
		}
}
