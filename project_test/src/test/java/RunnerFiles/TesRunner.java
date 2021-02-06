package RunnerFiles;

import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features="classpath:authentification1.feature", glue="StepDefProject")


public class TesRunner {
	
}
