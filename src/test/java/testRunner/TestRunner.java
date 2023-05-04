package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"features"},
                  glue = {"steps"},
                  plugin={"pretty", "junit:Report4"},
                  //dryRun = true,
                  monochrome = false
                  ,tags = "@p24"
//name = {"Link"}
 )
public class TestRunner {
}
