package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P04_Admin_Org_Structure extends PageBase {
    public P04_Admin_Org_Structure(WebDriver driver) {
        super(driver);
    }


    private final By editBtn = By.xpath("//*[@class=\"oxd-switch-input oxd-switch-input--active --label-left\"]");
    private final By engBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/ul/li/ul/li[2]/div[1]/span");
    private final By development = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/ul/li/ul/li[2]/ul/li[1]/div[1]/div");







    public P04_Admin_Org_Structure clickEditBtn(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(editBtn));
        driver.findElement(editBtn).click();
        return this;
    }

    public P04_Admin_Org_Structure clickEngBtn(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(engBtn));
        driver.findElement(engBtn).click();
        return this;
    }

    public String getEngineeringTabLabels(){

        return driver.findElement(development).getText();

    }

}
