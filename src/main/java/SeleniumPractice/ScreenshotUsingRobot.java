package SeleniumPractice;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotUsingRobot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://omayo.blogspot.com/");
		
      //    The following are the benefits of using Robot Class
      //    We can take the screenshots which includes URL of the application
      //    We can take the screenshots of the displayed alerts  
          
          
		Robot robot = new Robot();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(dimension);
		BufferedImage bufferedImage = robot.createScreenCapture(rect);
		String screenshotPath = System.getProperty("user.dir")+"//Screenshot//robot.png";
		ImageIO.write(bufferedImage,"png",new File(screenshotPath));

		driver.close();
	}

}
