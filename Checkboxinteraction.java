package selenium.homework.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Checkboxinteraction {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 ChromeDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://leafground.com/checkbox.xhtml");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.findElement(By.id("j_idt87:j_idt89")).click();
 
 driver.findElement(By.id("j_idt87:j_idt91")).click();
 boolean displayed = driver.findElement(By.className("ui-growl-title")).isDisplayed();
 System.out.println(displayed);
 
 driver.findElement(By.xpath("//label[text()='Java']")).click();
 driver.findElement(By.xpath("//label[text()='Javascript']")).click();
 
 driver.findElement(By.id("j_idt87:ajaxTriState")).click();
 String state = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
if(state.equalsIgnoreCase("State has been changed.")) {
	System.out.println(state);
}else {
	System.out.println();
}
 Thread.sleep(5000);
 driver.findElement(By.className("ui-toggleswitch-slider")).click();
 boolean displayed2 = driver.findElement(By.className("ui-growl-title")).isDisplayed();
 System.out.println(displayed2);

 boolean enabled = driver.findElement(By.id("j_idt87:j_idt102")).isEnabled();
 System.out.println(enabled);
 

 
 
 driver.close();
	}
}

 