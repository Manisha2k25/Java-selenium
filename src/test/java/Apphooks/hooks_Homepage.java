package Apphooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v136.page.model.Screenshot;

import QA.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class hooks_Homepage {
	         
	DriverFactory df;
	WebDriver driver;
	
	@Before
	public void LaunchBrowser() throws IOException
	
	{
		 FileInputStream file = new FileInputStream("D:\\work\\Qafox\\src\\test\\resources\\config.properties");
		Properties prop=new Properties();
		prop.load(file);
		 String BN=prop.getProperty("Browser");
		 df=new DriverFactory();
		 driver=df.initBrowser(BN);
		 driver.manage().window().maximize();
	}
	
	
	
	
	@After
	 public void CloseBrowser()
	 {
	 driver.quit();
	 }

	
     @AfterStep
     public void postaction(io.cucumber.java.Scenario sc)
     {
    	 
    	 byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    	 sc.attach(screenshot, "image/png", screenshot.toString());
    			 
    			 
 		
 	

     }
	
	
	
	
	
}
