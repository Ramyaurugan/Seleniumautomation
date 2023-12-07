package week3homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alllocators {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Create the details of create lead
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click(); // priority tags not there we use llink text
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("salesman");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ramya");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Murugan");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Ramya");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department");
driver.findElement(By.id("createLeadForm_description")).sendKeys("somethingtyping in the description field");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramyamurugan2297@gmail.com");
WebElement select = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select select2 = new Select(select);
select2.selectByVisibleText("New York");
driver.findElement(By.className("smallSubmit")).click();

//Edit the details

driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_description")).clear();
driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("It is testing purpose");
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);

driver.close();

	}

}
