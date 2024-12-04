package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P02_HomaPage_Dashboard extends PageBase {
    public P02_HomaPage_Dashboard(WebDriver driver) {
        super(driver);
    }

    private final By adminTab = By.xpath("//span[normalize-space()='Admin']");
    private final By leaveTab = By.xpath("//span[normalize-space()='Leave']");




    /*--------------------------------------------------------------------*/

    public P02_HomaPage_Dashboard navigateToAdmin(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(adminTab));
        driver.findElement(adminTab).click();
        return this;
    }

    public P02_HomaPage_Dashboard navigateToLeave(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(leaveTab));
        driver.findElement(leaveTab).click();
        return this;
    }














}
