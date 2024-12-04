package common;

import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class PageBase {

    public WebDriver driver;


    public PageBase(WebDriver driver) {

        this.driver = driver;

    }

    // long explicit wait
    public static WebDriverWait longWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(25));
    }

    // short explicit wait
    public static WebDriverWait shortWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        try {
            FileHandler.copy(takesScreenshot.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")
                    + "/src/test/resources/Screenshots/" + screenshotName + System.currentTimeMillis() + ".png"));
        } catch (WebDriverException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }























    public static void quitBrowser(WebDriver driver) {
        // clear browser localStorage , sessionStorage and delete All Cookies
        ((JavascriptExecutor) driver).executeScript("window.localStorage.clear();");
        ((JavascriptExecutor) driver).executeScript("window.sessionStorage.clear();");
        driver.manage().deleteAllCookies();
        driver.quit();
        // kill browser process on background
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
                // Runtime.getRuntime().exec("taskkill /F /IM chrome.exe /T");
            } else if (os.contains("mac") || os.contains("nix") || os.contains("nux")) {
                Runtime.getRuntime().exec("pkill -f chromedriver");
                // Runtime.getRuntime().exec("pkill -f chrome");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
