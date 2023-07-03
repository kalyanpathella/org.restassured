package tests;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//For smoke testing(run @smoketest tagged scenarios only to check basic functionality)
@CucumberOptions(features={"src\\test\\resources\\features\\feature1.feature"},
                 glue={"gluecode"},
                 monochrome=true,
       plugin={"pretty","json:target/cucumber-reports.json",
    		   "rerun:target\\failedsmoketests.txt"})
public class Runner extends AbstractTestNGCucumberTests
{
	
}
