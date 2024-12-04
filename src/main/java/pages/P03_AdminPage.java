package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class P03_AdminPage extends PageBase {

    private JavascriptExecutor js;

    public P03_AdminPage(WebDriver driver) {
        super(driver);
        this.js = (JavascriptExecutor) driver;
    }




    private final By addBtn = By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']");

    private final By userRoleDD = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]");

    private final By admin = By.xpath("//div[@class='oxd-select-option'][2]");
    private final By employeeName = By.xpath("//input[@placeholder=\"Type for hints...\"]");
    private final By statusDD = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]");
    private final By enabled = By.xpath("//div[@class=\"oxd-select-option\"][2]");
    private final By userName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input");
    private final By password = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input");
    private final By confirmPassword = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input");

    private final By organizationDropDown = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]");
    private final By structureOpt = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/ul/li[3]");



    /*-------------------------------------------------------------------------------------------*/


    public P03_AdminPage clickAddBtn(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(addBtn));
        driver.findElement(addBtn).click();
        return this;
    }


    public P03_AdminPage selectUserRoleFromDropdown() {

        longWait(driver).until(ExpectedConditions.elementToBeClickable(userRoleDD));
        driver.findElement(userRoleDD).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(admin).click();
        return this;
    }

    public P03_AdminPage enterEmployeeName(String employeename) {

        longWait(driver).until(ExpectedConditions.visibilityOfElementLocated(employeeName));
        driver.findElement(employeeName).sendKeys(employeename);
        return this;
    }

    public P03_AdminPage selectStatusFromDropdown() {

        longWait(driver).until(ExpectedConditions.elementToBeClickable(statusDD));
        driver.findElement(statusDD).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(enabled).click();
        return this;
    }

    public P03_AdminPage enterUserName(String username) {

        longWait(driver).until(ExpectedConditions.visibilityOfElementLocated(userName));
        driver.findElement(userName).sendKeys(username);
        return this;
    }

    public P03_AdminPage enterPassword(String userpassword) {

        longWait(driver).until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys(userpassword);
        return this;
    }

    public P03_AdminPage enterConfirmPassword(String userconfirmpassword) {

        longWait(driver).until(ExpectedConditions.visibilityOfElementLocated(confirmPassword));
        driver.findElement(confirmPassword).sendKeys(userconfirmpassword);
        return this;
    }



    public P03_AdminPage clickOrgDropDown(){

        longWait(driver).until(ExpectedConditions.elementToBeClickable(organizationDropDown));
        driver.findElement(organizationDropDown).click();
        driver.findElement(structureOpt).click();
        return this;
    }



}
