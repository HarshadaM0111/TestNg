package stepDefination;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)



@CucumberOptions(
		features = "cucumberfeature/demoqa.feature",
		glue = {"stepDefination"}
)

public class runner {

}