package day_1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng_demo3 {
  @Test
  public void testmethod1() {
	  Assert.assertTrue(50>30);
  }
  @Test
  public void testmethod2() {
	  Assert.assertTrue("ramya".startsWith("r"));
  }
  @Test
  public void testmethod3() {
	  Assert.assertFalse(50>30);
  }
  @Test
  public void testmethod4() {
	  Assert.assertFalse("ramya".equals("akshata"));
  }
  @Test
  public void testmethod5() {
	  int actual=20;
	  int expected=30;
	  Assert.assertEquals(actual, expected);
  }
  @Test
  public void testmethod6() {
	  String actual="Hello";
	  String expected="Hi";
	  Assert.assertEquals(actual, expected);
  }
  @Test
  public void testmethod7() {
	Object obj=null;
	  Assert.assertNull(obj);
  }
  @Test
  public void testmethod8() {
	Object obj1=new Object();
	  Assert.assertNull(obj1);
  }
  @Test
  public void testmethod9() {
	SoftAssert sa= new SoftAssert();
	System.out.println("checking 1st validation");
	sa.assertEquals(10, 11);
	System.out.println("checking 2nd validation");
	sa.assertEquals("hello", "hello");
	System.out.println("checking 3rd validation");
	sa.assertEquals("hello", "hi");
	sa.assertAll();
  }
}
