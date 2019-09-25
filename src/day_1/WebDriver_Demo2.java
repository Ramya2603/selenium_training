package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_Demo2 {
  @Test
  public void f() {
	  WebDriver driver=DriverUtility.getDriver("chrome");
	  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("The title of the webpage is "+driver.getTitle());
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.name("userName")).sendKeys("Lalitha");
	  driver.findElement(By.name("password")).sendKeys("Password123");
	  driver.findElement(By.name("Login")).click();
	  Assert.assertTrue(driver.getTitle().contains("Home"));
	  
  }
}
