package selenium.homework.day3;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://leafground.com/button.xhtml");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//parent to child xpath with index
driver.findElement(By.xpath("(//div[@class='card']/button/span)[1]")).click();
//verify the title of the page
String title = driver.getTitle();
System.out.println(title);
//again back to page
driver.navigate().to("https://leafground.com/button.xhtml");
//if the button is disabled or not 
boolean Disabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
System.out.println(Disabled); // need to confirm
//to print the location of the button
Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
System.out.println(location);

//to print the background color of the button
String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("background-color");
System.out.println(cssValue);

//to print the button height and width
Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
System.out.println(size);
driver.quit();
	}

}
