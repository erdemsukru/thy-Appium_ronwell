package testRunners;

public @interface CucumberOptions {
    String tags();

    String[] glue();

    String[] plugin();

    String features();
}
