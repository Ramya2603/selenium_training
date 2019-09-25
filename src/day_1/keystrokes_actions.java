package day_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class keystrokes_actions {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=DriverUtility.getDriver("chrome");
	  String url="http://demowebshop.tricentis.com/";
	  driver.manage().window().maximize();
	  driver.get(url);
	  WebElement search=driver.findElement(By.id("small-searchterms"));
	  Actions act1=new Actions(driver);
	  Thread.sleep(5000);
	  act1.sendKeys(search,"computer").perform();
	  Thread.sleep(5000);
	  act1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  //driver.findElement(By.xpath("//input[@value='Search']")).click();
	  
	  

  }
}
