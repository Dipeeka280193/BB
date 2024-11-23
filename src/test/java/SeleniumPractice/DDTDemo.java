package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTDemo {
	
@Test(dataProvider="dataSupplier")
	public void verifyLogin(String email, String password)
	{
		
	WebDriver driver= new ChromeDriver();
	
		
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		driver.quit();
		
	}

	@DataProvider
	public String[][] dataSupplier()
	{
		String[][] data = {{"dipeeka123@gmail.com","Pass@123"},
				{"sayali123@gmail.com","Pass@123"}};
		
		return data;
	}

}
