package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, plugin =
// {"progress", "json:target/cucumber.json"}, // --> verbose---
// {"pretty" , "json:target/cucumber.json"}, // --> verbose+++
{ "summary", "json:target/cucumber.json" }, // --> default formatter (recommended)
		glue = { "/" }, dryRun = false, // vérifier les glues sans exécuter le scenario

		tags = "@createCGUser"

)
public class Runner {
	
	@BeforeClass
    public static void setUpClass() throws Exception
    {
       
    }
    
    
    @AfterClass
    public static void afterTest() throws Exception
    {
       
    }
    
    
}