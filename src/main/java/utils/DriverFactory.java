package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
public class DriverFactory {
    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;
    private static String browser;

    public static AppiumDriver initialized_Driver(String browser){
        DriverFactory.browser = browser;
        properties = ConfigReader.getProperties();
        capabilities = new DesiredCapabilities();
        if(browser.equals("Android")){

            capabilities.setCapability("deviceName","SM-G950F");
            capabilities.setCapability("udid","9889db46435448305a");
            capabilities.setCapability("platformName","Android");
            capabilities.setCapability("platformVersion","13.0");
            capabilities.setCapability("appPackage","com.turkishairlines.mobile");
            capabilities.setCapability("appActivity","com.turkishairlines.mobile.ui.ACSplash");
        }
        try {
            driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return null;
    }

    public static void quitDriver() {
        driver.quit();
    }

    public static AppiumDriver getDriver() {return driver;
    }

    public static void setdriver() {
    }

    public static String getBrowser() {
        return browser;
    }

    public static void setBrowser(String browser) {
        DriverFactory.browser = browser;
    }
}
