package utils;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.*;

import java.util.Properties;

public class Hooks {
    AppiumDriver driver;
    Properties properties;

    @BeforeAll
    public static void beforeAll() {
    }

    @Before
    public void before() {
        DriverFactory.setdriver();
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
        DriverFactory.quitDriver();
    }

    @AfterAll
    public static void afterAll() {
    }
}
