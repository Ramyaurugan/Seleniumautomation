package week4homework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajioapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ChromeDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 driver.get("https://www.ajio.com/");
 driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags",Keys.ENTER);
 
 driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
 boolean enabled = driver.findElement(By.xpath("(//label[contains(@class,'facet')])[1]")).isEnabled();
 System.out.println(enabled);

 List<WebElement> Brand = driver.findElements(By.xpath("(//div[@class='brand']/strong)"));
List<String> brandlist = new ArrayList<String>();
 for (int i = 0; i < Brand.size(); i++) {
	 String branded = Brand.get(i).getText();
	 //System.out.println(branded);
	brandlist.add(branded);
}
 System.out.println(brandlist);
 
 //print the name of bags
 List<WebElement> Names = driver.findElements(By.xpath("//div[@class='nameCls']"));
 List<String> product = new ArrayList<String>();
  for (int j = 0; j < Names.size(); j++) {
 	 String Productname = Names.get(j).getText();
 	 //System.out.println(Productname);
 	product.add(Productname);
  }
  System.out.println(product);
 
 
 
     
 /* driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
 boolean enabled1 = driver.findElement(By.xpath("((//label[contains(@class,'facet-linkname')])[6]")).isEnabled();
 System.out.println(enabled1);*/
 
 
 driver.close();
 
 
	}

}

