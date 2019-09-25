package day_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testng_demo {
  @Test
  public void f() {
	  System.out.println("This is a test annotation");
  }
  @Test
  public void f1() {
	  System.out.println("This is a test-f1 annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is a beforeMethod annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is a Aftermethod annotation");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is a BeforeClass annotation");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is a afterClass annotation");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is a BeforeTest annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is a AfterTest annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is a beforeSuite annotation");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is a AfterSuite annotation");
  }

}
