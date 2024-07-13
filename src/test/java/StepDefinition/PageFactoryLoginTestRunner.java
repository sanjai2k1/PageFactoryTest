package StepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",features = {"C:\\Users\\Admin\\Desktop\\PageFactoryTest\\src\\test\\resources\\Feature"},glue = {"StepDefinition"},
plugin = {"pretty","html:target/htmlreport.html"})
public class PageFactoryLoginTestRunner extends AbstractTestNGCucumberTests {

}
