package utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static utils.ConfigUtils.*;

public class DriverUtils {
    static WebDriver driver;

    public static void initDriver() {
        loadProperties();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(getPropertyByKey("application.url"));
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        if (driver == null ) {
            initDriver();
        }
        return driver;
    }

    public static void tearDown() {
        driver.quit();
        driver = null;
    }
}
