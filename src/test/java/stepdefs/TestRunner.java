package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		monochrome = true, 
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
		features = "src/test/java/features",
		glue = "stepdefs",
		// tags= {"@WIP"}
        // tags= {"@Regression"}
		//tags= {"@Sanity or @Regression"} // either Sanity or Regression
		//tags= {"@Sanity and @Regression"} // both the tags should be there
		//tags= {"@Calc"} // Feature level tag
		//tags= {"not @WIP"} // execute all except WIP
		tags= {" @Browser and not @WIP"} // execute all under Browser tag except WIP
)

public class TestRunner {

}
