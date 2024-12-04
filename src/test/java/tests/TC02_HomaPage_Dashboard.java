package tests;

import common.PageBase;
import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P02_HomaPage_Dashboard;

import static util.Utility.MobileNumberGenerator.generateRandomMobileNumber;

public class TC02_HomaPage_Dashboard extends TestBase {



    /*------------------------------------------------------------*/


    @Test(priority = 1, description = "navigate to admin tab")
    public void navigateToAdminTab()  {

        new P02_HomaPage_Dashboard(driver).navigateToAdmin();

    }

    @Test(priority = 2, description = "navigate to leave tab")
    public void navigateToLeaveTab()  {

        new P02_HomaPage_Dashboard(driver).navigateToLeave();
    }

}
