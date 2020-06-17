package com.karthik.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/com/karthik/cucumber/"},
       glue = {"com.karthik.cucumber"},

        monochrome = true,
        plugin = {"pretty"/*, "html:target/cucumber-html", "json:target/cucumber-json.json"*/}
)
public class MineRunner {
}
