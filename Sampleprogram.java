package seleniumsetup;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();//instantiate method we can use this place
		driver.manage().window().maximize();//call the methods using dot
		driver.get("http://leaftaps.com/opentaps/control/main");//and load the url using get method
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Demosales");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Manager");
		driver.findElement(By.className("smallSubmit")).click();
	}
	}


