package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

import org.junit.AfterClass;
import org.junit.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, plugin =
// {"progress", "json:target/cucumber.json"}, // --> verbose---
{ "pretty", "html:target/cucumber-html-reports.html", "json:target/cucumber.json",
		"junit:target/junit-cucumber-reports/Cucumber-junit.xml" }, // --> verbose+++
//{ "summary", "json:target/cucumber.json" }, // --> default formatter (recommended)
		glue = { "/", "com.finlogik.tnr.framwork.setps" },  // vérifier les glues sans exécuter le
																			// scenario
		dryRun = false, monochrome = false, publish = false, stepNotifications = true, useFileNameCompatibleName = true,

		tags = "@createCGUser",

		snippets = SnippetType.CAMELCASE)
public class RunnerTest {

}