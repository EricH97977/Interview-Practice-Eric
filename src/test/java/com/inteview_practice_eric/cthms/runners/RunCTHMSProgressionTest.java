package com.cthms.runners;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/html-reports/cucumber-default-report","json:target/cucumber.json",
		"rerun:target/failed.txt",
		"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		features = "src/test/java/com/interview_practice_eric/cthms/features",
		glue = "com.interview-practice-eric.cthms.steps",
		tags = "@Progression",
		dryRun = false,
		monochrome = true,
		strict = true
)

public class RunCTHMSProgressionTest {
    
}
