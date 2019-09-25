package day_1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WebDriver_Demo5 {
  @Test
  public void f() {
	  WebDriver driver=DriverUtility.getDriver("chrome");
	  String url="http://demo.guru99.com/popup.php";
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.findElement(By.linkText("Click Here")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentWindow=it.next();
	  String childWindow=it.next();
	  driver.switchTo().window(childWindow);
	  driver.findElement(By.name("emailid")).sendKeys("aravind.guggilla57@gmail.com");
	  driver.findElement(By.name("btnLogin")).click();
	  System.out.println(("url of the page"+driver.getTitle()));
	  driver.close();
	  driver.switchTo().window(parentWindow);
	  System.out.println("parent window title"+driver.getTitle());
  }
}
