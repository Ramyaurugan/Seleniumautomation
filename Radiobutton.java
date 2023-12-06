package selenium.homework.day3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.leafground.com/radio.xhtml");
driver.findElement(By.xpath("//label[text()='Chrome']")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();


WebElement buttonselect = driver.findElement(By.xpath("//label[text()='Hyderabad']"));

if(!buttonselect.isSelected()==true)
{
	
	buttonselect.click();
	System.out.println("Now button is again selected");
}
else {
	System.out.println("button not selected");
}
WebElement defaultselect = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
if(defaultselect.isEnabled()==true) {
	
	System.out.println("This safari button is already selected");
}
else {
	System.out.println("Not selected");
}
WebElement alreadyselect = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
if(alreadyselect.isEnabled()==true) {
	driver.findElement(By.xpath("//label[text()='41-60 Years']")).click();
	
	System.out.println("selected 41 to 61 years age");
	
}
else {
	System.out.println("Not selected 41 to 61 years age");
}

driver.quit();
}
}