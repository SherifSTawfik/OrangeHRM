package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P01_LoginPage extends PageBase {

    private JavascriptExecutor js;

    public P01_LoginPage(WebDriver driver) {
        super(driver);
        this.js = (JavascriptExecutor) driver;
    }

    private final By userName = By.xpath("//input[@placeholder='Username']");
    private final By password = By.xpath("//input[@placeholder='Password']");
    private final By loginBtn = By.xpath("//button[@type='submit']");






           /*-----------------------------------------------------------------*/


    public P01_LoginPage enterUserName(String username){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(userName));
        driver.findElement(userName).sendKeys(username);
        return this;
    }
    public P01_LoginPage enterPassword(String passwords){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys(passwords);
        return this;
    }
    public P01_LoginPage clickLogin(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(loginBtn));
        driver.findElement(loginBtn).click();
        return this;
    }











































}
