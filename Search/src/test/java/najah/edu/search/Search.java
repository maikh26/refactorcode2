package najah.edu.search;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "use_cases", plugin = {
		"html:target/cucumber/wikipedia.html" }, monochrome = true, snippets = SnippetType.CAMELCASE, glue = {
				"najah.edu.search" }, strict = true)

public class Search {

	
}
