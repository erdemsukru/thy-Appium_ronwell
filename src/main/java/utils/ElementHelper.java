package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ElementHelper {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key) {
        return (WebElement)this.wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key) {
        WebElement element = this.presenceElement(key);
        return element;
    }

    public void click(By key) {
        this.findElement(key).click();
    }

    public void sendKeys(By key, String text) {
        this.findElement(key).sendKeys(new CharSequence[]{text});
    }

    public void checkVisible(By key) {
        this.wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }
}