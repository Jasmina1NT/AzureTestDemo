package Prnew;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baClass.ScreenShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase extends ScreenShot {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void jas() throws InterruptedException, IOException {
		
			driver.findElement(By.id("email")).sendKeys("jasmina@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("jasmin132");
			CaptureScreenshot(driver, "new");
			
			Thread.sleep(5000);
		//	driver.findElement(By.xpath("//button[@type='submit'])")).click();
			String actual=driver.getTitle();
			
			assertEquals(actual, true);
	
		
		
		
		
	
	}
	@Test(priority=2)
	public void hi() throws IOException{
		
		driver.findElement(By.linkText("Create new account")).click();
		CaptureScreenshot(driver, "m");
		
	}
	@AfterMethod
	public void close() {
		
		driver.close();
	}
 
}
