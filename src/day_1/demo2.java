package day_1;

import org.testng.annotations.Test;

public class demo2 {
  @Test(priority=1)
  public void Register() {
	 
		  System.out.println("This is a register annotation");
  }
  @Test(priority=2)
  public void Login() {
	 
		  System.out.println("This is a Login annotation");
  }
  @Test(priority=3)
  public void HomePage() {
	 
		  System.out.println("This is a HomePage annotation");
  }
  @Test(priority=4)
  public void Logout() {
	 
		  System.out.println("This is a Logout annotation");
  }
}
