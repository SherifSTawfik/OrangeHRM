package tests;

import common.MyScreenRecorder;
import common.PageBase;
import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P04_Admin_Org_Structure;

public class TC04_Admin_Org_Structure extends TestBase {



    @Test(priority = 1,description = "Assert values under engineering option")
    public void getValueUnderEngTab() throws Exception {

        //record step
        MyScreenRecorder.startRecording("Navigate through organization structure");

        new P04_Admin_Org_Structure(driver).clickEngBtn();
        Assert.assertEquals(new P04_Admin_Org_Structure(driver).clickEditBtn().getEngineeringTabLabels(), "Development");

        //stop record
        MyScreenRecorder.stopRecording();

        //take screenshot
        PageBase.captureScreenshot(driver,"Navigate through organization structure");
    }
}
