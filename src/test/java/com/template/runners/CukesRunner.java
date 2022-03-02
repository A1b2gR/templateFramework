package com.template.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports"},
        features = "scr/test/resources/features/",
        glue = "com/template/step_definitions",
        dryRun = false  //,
//        tags = "@test"
)

public class CukesRunner {
}
