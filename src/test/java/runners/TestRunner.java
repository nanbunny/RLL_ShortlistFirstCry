package runners;

import org.testng.annotations.Listeners;

import Utilities.ItestListenerclass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features ="C:\\Users\\Nanda Kishore\\eclipse-workspace\\.metadata\\Selenium Basics\\firstcry\\src\\test\\java\\Feature",
        glue = {"Stepdefinition"},
        dryRun = false,
        		 plugin = {"pretty","html:target/cucumber-reports/cucumber-preety"},
        		       
        	
                
       monochrome = true
       )


@Listeners(ItestListenerclass.class)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
