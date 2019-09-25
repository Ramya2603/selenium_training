package day_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WebDriver_demo6 {
  @Test
  public void f() {
	  WebDriver driver=DriverUtility.getDriver("chrome");
	  String url="https://www.online.citibank.co.in/";
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.findElement(By.xpath("//img[@title='LOGIN NOW']")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentWindow=it.next();
	  String childWindow=it.next();
	  driver.switchTo().window(childWindow);
	  System.out.println(("url of the page"+driver.getTitle()));
	  driver.close();
	  driver.switchTo().window(parentWindow);
	  System.out.println("parent window title"+driver.getTitle());
  
  }
}
