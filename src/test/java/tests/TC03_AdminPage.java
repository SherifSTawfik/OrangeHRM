package tests;

import common.MyScreenRecorder;
import common.PageBase;
import common.TestBase;
import org.testng.annotations.Test;
import pages.P03_AdminPage;



public class TC03_AdminPage extends TestBase {

    String employeeName = "Sagar hag hgfkag";
    String userName = "test-user";
    String password = String.valueOf(faker.number().numberBetween(10000000 + 'a',99999999 + 'a'));


    @Test(priority = 1, description = "Add new admin")
    public void addNewUserRole() throws Exception {

        //record step
        MyScreenRecorder.startRecording("Add new user");
        new P03_AdminPage(driver).clickAddBtn().selectUserRoleFromDropdown().enterEmployeeName(employeeName).selectStatusFromDropdown()
                .enterUserName(userName).enterPassword(password).enterConfirmPassword(password);
        //stop record
        MyScreenRecorder.stopRecording();

        //take screenshot
        PageBase.captureScreenshot(driver,"Add new user");


    }

    @Test(priority = 2, description = "Navigate to organization tab then structure page")
    public void navigateToOrg(){

        new P03_AdminPage(driver).clickOrgDropDown();
    }




}
