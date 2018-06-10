package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@CucumberOptions(features = "src/test/java/features/login.feature", glue = "steps", monochrome=true, 
tags = {"@Smoke or @Sanity"})
@RunWith(Cucumber.class)

public class RunTest {


}
