package pages;

import common.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class P05_LeavePage extends PageBase {
    public P05_LeavePage(WebDriver driver) {
        super(driver);
    }

    private final By leaveListTab = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[6]");
    private final By calendarIcon = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/i");
    private final By fullCalendar = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div[2]/div");
    private final By rightArrow = By.xpath("//i[@class=\"oxd-icon bi-chevron-right\"]");
    private final By monthTXT = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div.oxd-date-input-calendar > div > div.oxd-calendar-header > ul > li.oxd-calendar-selector-month > div > p");
    private final By yearTXT = By.cssSelector("#app > div.oxd-layout.orangehrm-upgrade-layout > div.oxd-layout-container > div.oxd-layout-context > div > div.oxd-table-filter > div.oxd-table-filter-area > form > div:nth-child(1) > div > div:nth-child(1) > div > div:nth-child(2) > div > div.oxd-date-input-calendar > div > div.oxd-calendar-header > ul > li.oxd-calendar-selector-year > div > p");
    private final By showLeaveWithStatus = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]");
    private final By scheduledOPT = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[4]");
    private final By pendingApprovalOPT = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/span[1]/i");
    private final By leaveTypeField = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]");
    private final By includePastEmployees = By.xpath("//span[@class=\"oxd-switch-input oxd-switch-input--active --label-right\"]");
    private final By searchBTN = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]");
//    private final By e = By.xpath("//i[@class=\"oxd-icon bi-chevron-right\"]");
//    private final By e = By.xpath("//i[@class=\"oxd-icon bi-chevron-right\"]");
//    private final By e = By.xpath("//i[@class=\"oxd-icon bi-chevron-right\"]");







    /*--------------------------------------------------------------*/




    public P05_LeavePage clickLeaveListTab(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(leaveListTab));
        driver.findElement(leaveListTab).click();
        return this;
    }

    public P05_LeavePage chooseDay(String day, String month, String year) throws InterruptedException {

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(calendarIcon));
        driver.findElement(calendarIcon).click();

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(fullCalendar));
        while (true){

            String currentmonth = driver.findElement(monthTXT).getText();
            String currentyear = driver.findElement(yearTXT).getText();
            Thread.sleep(3000);
            if (currentmonth.equals(month) && currentyear.equals(year)){
                break;
            }
            driver.findElement(rightArrow).click();
        }

        driver.findElement(By.xpath("//div[@class=\"oxd-calendar-date\"][text()='" + day + "']")).click();
        return this;

    }

    public P05_LeavePage showLeaveWithStatusAndOption(){

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(showLeaveWithStatus));
        driver.findElement(showLeaveWithStatus).click();

        shortWait(driver).until(ExpectedConditions.elementToBeClickable(scheduledOPT));
        driver.findElement(scheduledOPT).click();
        return this;
    }

    public P05_LeavePage removePendingApprovalOption() throws InterruptedException {

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(pendingApprovalOPT));
        Thread.sleep(3000);
        driver.findElement(pendingApprovalOPT).click();

        return this;
    }

    public P05_LeavePage selectLeaveType(String leaveOption) throws InterruptedException {

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(leaveTypeField));
        driver.findElement(leaveTypeField).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class=\"oxd-select-option\"]/span[text()='" + leaveOption + "']")).click();

        return this;
    }

    public P05_LeavePage selectIncludePastEmployeesAndSearch(){

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(includePastEmployees));
        driver.findElement(includePastEmployees).click();

        shortWait(driver).until(ExpectedConditions.visibilityOfElementLocated(searchBTN));
        driver.findElement(searchBTN).click();

        return this;
    }


}
