package testRunners;

@CucumberOptions(
        tags = "@TurkishAirlines",
        features = "src/test/resources/features",
        glue = {"StepDefinitions", "utils"},
        plugin = {
                "pretty",
                "summary",
                "html:target/cucumber-report.html"})
public class runner {
}
