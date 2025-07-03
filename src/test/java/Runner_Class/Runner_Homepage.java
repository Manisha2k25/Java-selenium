package Runner_Class;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"D:\\work\\Qafox\\Appfeatures"},
		glue= {"Step_definationclass","Apphooks"},
	    plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
		)

public class Runner_Homepage extends AbstractTestNGCucumberTests{

}
