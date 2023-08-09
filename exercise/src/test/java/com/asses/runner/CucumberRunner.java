package com.asses.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "", features = {"src/test/resources/features"}, glue = {"com.assess.definitions"},plugin = { "pretty", "html:target/cucumber-reports.html" },monochrome = true)    
public class CucumberRunner extends AbstractTestNGCucumberTests {
    
}