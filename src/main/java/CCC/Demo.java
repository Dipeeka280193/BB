package CCC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo {
	
	

	@BeforeClass
	
	public void setUp() {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.uk/");
	}

  @Test(priority = 1)
  
  public void login()
  {
	  
	  System.out.println("Login successfully");
  }
  
 @Test(priority = 2)
  
  public void register()
  {
	  
	  System.out.println("Register successfully");
  }
 
 @Test(priority = 3)
 
 public void search()
 {
	  
	  System.out.println("Search successfully");
 }
	
}
