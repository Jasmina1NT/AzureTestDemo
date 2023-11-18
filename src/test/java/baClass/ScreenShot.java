package baClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public void CaptureScreenshot(WebDriver driver,String testname) throws IOException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
       File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"\\Screenshots\\"+ testname +
			".png");
	
		FileUtils.copyFile(sourceFile, destFile);
	
	System.out.println("Screenshot saved successfully");
	}
}



