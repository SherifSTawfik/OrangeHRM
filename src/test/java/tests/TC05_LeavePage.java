package tests;

import common.MyScreenRecorder;
import common.PageBase;
import common.TestBase;
import org.testng.annotations.Test;
import pages.P05_LeavePage;

public class TC05_LeavePage extends TestBase {


    String leaveType = "CAN - Personal";

    @Test(priority = 1,description = "pick a day in calendar")
    public void searchForLeaves() throws Exception {

        //record step
        MyScreenRecorder.startRecording("Search for leaves");

        new P05_LeavePage(driver).clickLeaveListTab().chooseDay("10","June", "2024").showLeaveWithStatusAndOption()
                .removePendingApprovalOption().selectLeaveType(leaveType).selectIncludePastEmployeesAndSearch();


        //stop record
        MyScreenRecorder.stopRecording();

        //take screenshot
        PageBase.captureScreenshot(driver,"Search for leaves");
    }


}
