package Runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty", "html:target/result.html"}, 
		monochrome=false, 
		tags = " ",
		features = {"src/test/resources/features"}, 
		glue= {"StepDefinition","Hooks"}) 


public class TestRunner extends AbstractTestNGCucumberTests{

	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
	}
}
