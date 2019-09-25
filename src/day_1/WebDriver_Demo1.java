package day_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WebDriver_Demo1 {
WebDriver driver=null;
  @Test
  public void Browserlaunch() {
	  System.setProperty("webdriver.ie.driver", "C:\\Users\\Training_B6b.01.16\\Desktop\\Browser Drivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
	  driver=new InternetExplorerDriver();
	  String url="http://www.google.com";
	  driver.get(url);
  }
}
