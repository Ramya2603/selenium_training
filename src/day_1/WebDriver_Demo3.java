package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriver_Demo3 {
  @Test
  public void f() {
	  WebDriver driver=DriverUtility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com/login";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.navigate().refresh();
	  System.out.println("The title of the webpage is "+driver.getTitle());
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.name("Email")).sendKeys("aravind.guggilla57@gmail.com");
	  driver.findElement(By.name("Password")).sendKeys("aravind");
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	  Assert.assertTrue(driver.getTitle().contains("Demo"));
  }
}
