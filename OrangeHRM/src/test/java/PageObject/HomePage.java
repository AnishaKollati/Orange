package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	private By username = By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input");
	private By password = By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input");
	private By Login = By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input");
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}	
	public void username(String string) {
		driver.findElement(username).sendKeys(string);
	}
	public void password(String string) {
		driver.findElement(password).sendKeys(string);
	}
	public void clickLogin() 
	{
		driver.findElement(Login).click();
	}
}
