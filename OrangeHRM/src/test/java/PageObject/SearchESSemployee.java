package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchESSemployee {
WebDriver driver;
private By ClickPIMModule= By.xpath("/html/body/div[1]/div[2]/ul/li[2]/a/b");
private By EmpName= By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[1]/input[1]");
private By search= By.xpath("/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/p/input[1]");
	public SearchESSemployee(WebDriver driver) 
	{
		this.driver = driver;
	}
	public void ClickPIMModule() {
		driver.findElement(ClickPIMModule).click();
	}
	public void EmpName(String string) {
		driver.findElement(EmpName).sendKeys(string);
	}
	public void search() {
		driver.findElement(search).click();
	}
}
